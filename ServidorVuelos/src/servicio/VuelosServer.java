package servicio;


import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import negocio.Vuelo;
import negocio.GestorVuelos;

public class VuelosServer {
    
    private GestorVuelos gestor;

    private static ServerSocket sock;
    private static Socket socket;

    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private static final int PUERTO = 5003;

    /**
     * Constructor
     */
    public VuelosServer() {
        gestor = new GestorVuelos();
    }

    public void iniciar() {
        abrirPuerto();

        while (true) {
            esperarAlCliente();
            lanzarHilo();
        }
    }

    /**
     * Lanza el hilo
     */
    private static void lanzarHilo() {
        new Thread((Runnable) new VuelosServer()).start();
    }

    private static void abrirPuerto() {
        try {
            sock = new ServerSocket(PUERTO);
            System.out.println("Escuchando por el puerto " + PUERTO);
        } catch (IOException ex) {
            Logger.getLogger(VuelosServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void esperarAlCliente() {
        try {
            socket = sock.accept();
            System.out.println("Cliente conectado");
        } catch (IOException ex) {
            Logger.getLogger(VuelosServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void run() {
        try {
            crearFlujos();
            leerFlujos();
            cerrarFlujos();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void crearFlujos() throws IOException {
        salidaDecorada = new PrintStream(socket.getOutputStream());
        entradaDecorada = new Scanner(socket.getInputStream());
    }

    private void leerFlujos() {
        if (entradaDecorada.hasNextLine()) {
            // Extrae el flujo que envía el cliente
            String peticion = entradaDecorada.nextLine();
            decodificarPeticion(peticion);

        } else {
            salidaDecorada.flush();
            salidaDecorada.println("NO_ENCONTRADO");
        }
    }

    private void decodificarPeticion(String peticion) {
        StringTokenizer tokens = new StringTokenizer(peticion, ",");
        String parametros[] = new String[10];

        int i = 0;
        while (tokens.hasMoreTokens()) {
            parametros[i++] = tokens.nextToken();
        }
        String accion = parametros[0];
        procesarAccion(accion, parametros);

    }

    private void procesarAccion(String accion, String parametros[]) {
        switch (accion) {
            case "consultarCiudadano":
                String id = parametros[1];
                Vuelo vuelo = gestor.getVuelo(id);
                if (vuelo == null) {
                    salidaDecorada.println("NO_ENCONTRADO");
                } else {
                    salidaDecorada.println(parseToJSON(vuelo));
                }
                break;
        }
    }

    private void cerrarFlujos() throws IOException {
        salidaDecorada.close();
        entradaDecorada.close();
        socket.close();
    }

    private String parseToJSON(Vuelo vuelo) {
        JsonObject jsonobj = new JsonObject();
        jsonobj.addProperty("id", vuelo.getId());
        jsonobj.addProperty("fecha1", vuelo.getFecha1());
        jsonobj.addProperty("fecha2", vuelo.getFecha2());
        jsonobj.addProperty("ciudad", vuelo.getCiudad());
        return jsonobj.toString();
    }
}
