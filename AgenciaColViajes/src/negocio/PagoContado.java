package negocio;


/**
 * Clase para la creacion del metodo de pago a contado
 * @author dawish
 */
public class PagoContado extends Pago {
    /**
     * 
     */
    private int plazo;
    
     /**
     * Default constructor
     */
    public PagoContado() {
    }

    public PagoContado(int plazo) {
        this.plazo = plazo;
    }
    

    /**
     * Calcula el saldo pendiente de un cliente
     */
    public void calcularDeuda() {
        // TODO implement here
    }

    /**
     * Calcula el pago inicial minimo que debera realiar el cliente
     */
    public void calcularPagoInicial() {
        // TODO implement here
    }

   
    @Override
    public void registrarPago(Cliente cliente,long valor){
        this.setCliente(cliente);
        this.setValor(valor);
    }
    public void registrarPago(Cliente cliente,long valor, int plazo){
        registrarPago(cliente, valor);
        this.setPlazo(plazo);
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    

}