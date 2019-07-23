package negocio;


/**
 * Clase de la cual se crearan planes de aleimentacion que tendran los paquetes turisticos
 * @author dawish
 */
public class PlanAlimentacion {
    
    private String[] alimentacion;

    /**
     * Default constructor
     */
    public PlanAlimentacion() {
    }
    /**
     * Crea un lista de planes de alimnetacion
     * @param alimentacion 
     */

    public PlanAlimentacion(String[] alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String[] getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String[] alimentacion) {
        this.alimentacion = alimentacion;
    }
    
}