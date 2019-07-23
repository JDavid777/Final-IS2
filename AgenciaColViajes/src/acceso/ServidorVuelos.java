package acceso;

import java.util.*;

/**
 * Interface para el servidor de vuelos de la agencia
* @author David Garcia, Victor Sotelo, Camilo Meneses
 * Fecha creacion: 22/06/2019
 * Fecha ultima modificacion: 23/06/2019
 */
 
public interface ServidorVuelos {

    /**
     * Obtiene la informacion relacijonada aun vuelo programdo
     * @param fecha1 
     * @param fecha2 
     * @param origen 
     * @param destino
     */
    public void getInfoVuelo(String fecha1, String fecha2, String origen, String destino);

}