package negocio;

import java.util.*;

/**
 * Clase usada para la creacion de tours que dara la agencia en ciertas ciudades
 * @author dawish
 */
public class CityTour {
    
    private String[] tours;
    
     /**
     * Default constructor
     */
    public CityTour() {
    }
    /**
     * Cnstruye una lista de tours para una ciudades
     * @param tours 
     */
    public CityTour(String[] tours) {
        this.tours = tours;
    }

    public String[] getTours() {
        return tours;
    }

    public void setTours(String[] tours) {
        this.tours = tours;
    }

   

}