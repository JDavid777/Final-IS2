package acceso;


import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Servidor concreto para el servidor central de la agencia de viajes
 * * @author David Garcia, Victor Sotelo, Camilo Meneses
 * Fecha creacion: 22/06/2019
 * Fecha ultima modificacion: 23/06/2019
 */
public class ServidorCentralSocket implements ServidorCentral{
    
    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    
    /**
     * Metodo generico para realizar una consulta al servidor central 
     * @param servicio 
     * @return 
     */
    private String consultarServicio(String servicio) {
       String respuesta = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(servicio);
            cerrarFlujos();
            desconectar();
            
        }catch (IOException ex) {
            Logger.getLogger(ServidorCentralSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
    /**
     * Retorna el resultado de una consulta realizada al servidor
     * @param servicio
     * @return
     * @throws IOException 
     */
    private String leerFlujoEntradaSalida(String servicio) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println(servicio);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        return respuesta;
    }
    /**
     * Cierra la comunicacion con el servidor
     */
    private void cerrarFlujos() {
        salidaDecorada.close();
        entradaDecorada.close();
    }
    /**
     * Realiza la desconexion con el servidor central
     */
    private void desconectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorCentralSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Inicia una nueva conexion con el servidor
    */
    public void conectar(String address, int port) throws IOException {
        socket = new Socket(address, port);
        System.out.println("Conectado");
    }

    @Override
    public String consultarClientes() {
        return consultarServicio("consultarClientes");
    }

    @Override
    public String consultarUsuarios() {
        return consultarServicio("consultarUsuarios");
    }

    @Override
    public boolean agregarCliente(String id, String nombres, String apellidos,String fechaNac, String direccion, String celular,String ciudad, String email, String sexo) {
        String respuesta = consultarServicio("agregarCliente,"+id+","+nombres+","+apellidos+","+fechaNac+","+direccion+","+celular+","+ciudad+","+email+","+sexo);
        return respuesta.equals("Exito");
    }

    @Override
    public boolean editarCliente(String id, String nombres, String apellidos, String fechaNac, String direccion, String celular, String ciudad, String email, String sexo) {
        String respuesta = consultarServicio("editarCliente,"+id+","+nombres+","+apellidos+","+fechaNac+","+direccion+","+celular+","+ciudad+","+email+","+sexo);
        return respuesta.equals("Exito");
    }

    @Override
    public boolean eliminarCliente(String id) {
        String respuesta = consultarServicio("eliminarCliente,"+id);
        return respuesta.equals("Exito");
    }
    
    @Override
    public boolean agregarVenta(String idVenta, String idCliente,String idPaquete) {
         String respuesta = consultarServicio("agregarVenta,"+idVenta+","+idCliente+","+idPaquete+",");
        return respuesta.equals("Exito");
    }

}