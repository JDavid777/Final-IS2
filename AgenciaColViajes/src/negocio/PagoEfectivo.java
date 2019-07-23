package negocio;


/**
 * Clase para la creacion del metod de pago en efectivo, subclase de Pago
 * @author dawish
 */
public class PagoEfectivo extends Pago {

    /**
     * Default constructor
     */
    public PagoEfectivo() {
    }
   
    /**
     *
     * @param cliente
     * @param valor
     */
    @Override
    public void registrarPago(Cliente cliente,long valor) {
        this.setCliente(cliente);
        this.setValor(valor);
    }

}