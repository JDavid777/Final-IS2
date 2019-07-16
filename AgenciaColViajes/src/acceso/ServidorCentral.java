package acceso;

/**
 * Interface donde se definen los servicios a consultar en el servidor central 
 * @author David Garcia, Victor Sotelo, Camilo Meneses
 * Fecha creacion: 22/06/2019
 * Fecha ultima modificacion: 23/06/2019
 */
public interface ServidorCentral {

    /**
     * 
     * @return 
     */
    public String consultarClientes();
    public String consultarUsuarios();
    public boolean agregarCliente(String id, String nombres, String apellidos,String fechaNac, String direccion, String celular,String ciudad, String email, String sexo);
    public boolean editarCliente(String id, String nombres, String apellidos,String fechaNac, String direccion, String celular,String ciudad, String email, String sexo);
    public boolean eliminarCliente(String id);
}