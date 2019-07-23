package negocio;

import java.util.*;

/**
 * Clase de la cual se crearan objetos de vuelo 
 * @author dawish
 */
public class Vuelo {
    
    private String aerolinea;
    private Date fechaHoraLlegada;
    private Date fechaHoraSalida;

    /**
     * Default constructor
     */
    public Vuelo() {
    }
    /**
     * Contruye un nueo vuelo
     * @param aerolinea
     * @param fechaHoraLlegada
     * @param fechaHoraSalida 
     */
    public Vuelo(String aerolinea, Date fechaHoraLlegada, Date fechaHoraSalida) {
        this.aerolinea = aerolinea;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Date getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(Date fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    

}