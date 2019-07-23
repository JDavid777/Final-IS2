package negocio;


/**
 * Fabrica de pagos, utiliza el patron metodo de fabrica
 * @author dawish
 */
public class FabricaPagos {


     /**
     * Default constructor
     */
    public FabricaPagos() {
    }

    /**
     * Obteiene el metodo de pago que usara un cliente
     * @param nombrePago 
     * @return
     */
    public Pago getPago(String nombrePago) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Pago) Class.forName(nombrePago).newInstance();
               
    }

}