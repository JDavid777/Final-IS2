/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *Informacion de la venta que esta almacenada en la base de datos
 * @author Cuatro
 */
public class Venta {
    private String idVenta;
    private String idCliente;
    
    private String idPaquete;
/**
 * 
 * @param idVenta
 * @param idCliente
 * @param idPaquete 
 */
    public Venta(String idVenta, String idCliente, String idPaquete) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idPaquete = idPaquete;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }
    
    
}
