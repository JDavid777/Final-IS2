package acceso;

import java.util.*;

/**
 * Servidor para el manejo de los hoteles de la agencia
* @author David Garcia, Victor Sotelo, Camilo Meneses
 * Fecha creacion: 22/06/2019
 * Fecha ultima modificacion: 23/06/2019
 */
public interface ServidorHoteles {

    /**
     * Consulta la informacion de un hotel almecenado en la base de datos de la agencia
     * @param fecha1 
     * @param fecha2 
     * @param ciudad
     */
    public void consultarInfoHotel(String fecha1, String fecha2, String ciudad);

}