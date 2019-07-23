package negocio;

import acceso.ServidorCentral;
import acceso.ServidorCentralSocket;
import com.google.gson.Gson;
import java.util.*;
import mvcf.AModel;

/**
 * Clase de la cual se creara un funcionario de la agenci de visjes encargado 
 * de administrar los paquetes y los usuarios ademas de los clientes de la agencia
 * @author dawish
 */
public class Funcionario extends AModel {
    
    private final ServidorCentral servidor;
    private ArrayList <Cliente> clientes;
    
    private String username;
    private String password;
    private String nombre;
    /**
     * Constructor por defecto
     */
    public Funcionario() {
        this.servidor = new ServidorCentralSocket();
        this.clientes = new ArrayList<>();
    }
    /**
     * Constructor parametrizado para un funcionario
     * @param username
     * @param password
     * @param nombre 
     */

    public Funcionario(String username, String password, String nombre) {
        this.servidor = new ServidorCentralSocket(); 
        this.clientes = new ArrayList<>();
        
        this.username = username;
        this.password = password;
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
     /**
     * Busca los clientes en el servidor remoto del servidor central
     * además, llena el listado de clientes del sistema
     */
    public void consultarClientesServicio() {
        //Obtiene el objeto json serializado al servidor de la registraduria
        Cliente clientesServidor[];
        String json = servidor.consultarClientes();
        System.out.println("Json:"+json);
        this.clientes.clear();
        if (!json.equals("NO_ENCONTRADO")) {
            clientesServidor = deserializarClientes(json);
        
            for (Cliente cliente : clientesServidor) {
                this.clientes.add(cliente);
            }
            //this.notificar();   
        }
    }
    
    /**
     * CRUD DE CLIENTES
     */
    
    /**
     * Agrega un Cliente a la Agencia de Viajes
     * @param id
     * @param nombres
     * @param apellidos
     * @param fechaNac
     * @param direccion
     * @param celular
     * @param ciudad
     * @param email
     * @param sexo
     * @return true o false si se puede o no agregar el cliente
     */
    public boolean agregarClienteServicio(String id, String nombres, String apellidos,String fechaNac, String direccion, String celular,String ciudad, String email, String sexo) {
        return servidor.agregarCliente(id, nombres, apellidos, fechaNac, direccion, celular, ciudad, email, sexo);
    }

    /**
     * Edita un Cliente de la Agencia de Viajes
     * @param id
     * @param nombres
     * @param apellidos
     * @param fechaNac
     * @param direccion
     * @param celular
     * @param ciudad
     * @param email
     * @param sexo
     * @return true o false si se puede o no editar el cliente
     */
    public boolean editarCliente(String id, String nombres, String apellidos,String fechaNac, String direccion, String celular,String ciudad, String email, String sexo) {
        return servidor.editarCliente(id, nombres, apellidos, fechaNac, direccion, celular, ciudad, email, sexo);
    }

    /**
     * Elimina un Cliente de la Agencia de Viajes
     * @param id
     * @return true o false si se puede o no eliminar el cliente
     */
    public boolean eliminarCliente(String id) {
        return servidor.eliminarCliente(id);
    }
    
    /**
     * Deserializa el String JSon serializado de los clientes traidos desde el servidor central
     * @param arrayJsonSerializado
     * @return Cliente[] array con los clientes deserializados
     */
    public static Cliente[] deserializarClientes(String arrayJsonSerializado) {
 
        Cliente clientes[] = new Gson().fromJson(arrayJsonSerializado, Cliente[].class);
        return clientes;
    }

}