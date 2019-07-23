package negocio;

import java.util.*;

/**
 * Clase a partir de la cuan se crearan objetos de tipo hotel que tendra la base de datos de la agencia
 * @author dawish
 */
public class Hotel {

    private String nombre;
    /**
     * Default constructor
     */
    public Hotel() {
    }
    /**
     * Construye un hotel con nombre
     * @param nombre 
     */
    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}