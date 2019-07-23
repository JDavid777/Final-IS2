package acceso;

/**
 * Interface donde se definen los servicios a consultar en el servidor central 
 * @author David Garcia, Victor Sotelo, Camilo Meneses
 * Fecha creacion: 22/06/2019
 * Fecha ultima modificacion: 23/06/2019
 */
public interface ServidorCentral {

    /**
     * Obtiene un listado de clientes almacenados en la base de datos
     * @return Clientes de la agencia
     */
    public String consultarClientes();
    /**
     * Consulta los usuarios almacenados en la base de datos
     * @return 
     */
    public String consultarUsuarios();
    /**
     * 
     * @param id
     * @param nombres
     * @param apellidos
     * @param fechaNac
     * @param direccion
     * @param celular
     * @param ciudad
     * @param email
     * @param sexo
     * @return 
     */
    public boolean agregarCliente(String id, String nombres, String apellidos,String fechaNac, String direccion, String celular,String ciudad, String email, String sexo);
    /**
     * 
     * @param id
     * @param nombres
     * @param apellidos
     * @param fechaNac
     * @param direccion
     * @param celular
     * @param ciudad
     * @param email
     * @param sexo
     * @return 
     */
    public boolean editarCliente(String id, String nombres, String apellidos,String fechaNac, String direccion, String celular,String ciudad, String email, String sexo);
    /**
     * 
     * @param id
     * @return 
     */
    public boolean eliminarCliente(String id);
    /**
     * 
     * @param idCliente
     * @param idVenta
     * @param idPaquete
     * @return 
     */
    public boolean agregarVenta(String idCliente, String idVenta,String idPaquete);
}