/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *Gestiona las ventas almacenadas en la base de datos de la agencia
 * @author Cuatro
 */
public class GestorVentas {
        
    private ConectorJdbc conector;
    
    public GestorVentas() {
        conector = new ConectorJdbc();
    }
    
    public ArrayList<Venta> consultarVentas() throws ClassNotFoundException, SQLException{
        //TODO Buscar        
          
        conector.conectarse();
        conector.crearConsulta("SELECT * FROM VENTA;");
        ArrayList<Venta> ventas = new ArrayList();

        while (conector.getResultado().next()) {
            Venta newVenta = new Venta(conector.getResultado().getString("idVenta"), conector.getResultado().getString("idCliente"),conector.getResultado().getString("idPaquete"));
            ventas.add(newVenta);
        }
        conector.desconectarse();
        return ventas;
    }

    public void agregarVenta(String idVenta, String idCliente, String idPaquete) throws ClassNotFoundException, SQLException {
        conector.conectarse();
        conector.actualizar("INSERT INTO Venta(idVenta, idCliente, idPaquete)"
                + " VALUES ("
                + "'" + idVenta + "',"
                + "'" + idCliente + "',"
                + "'" + idPaquete + "',");
        conector.desconectarse();

    }
    
}
