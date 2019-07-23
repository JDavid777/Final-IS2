package negocio;


/**
 * Clase para la creacion de pagos segun su tipo. Clase padre
 * @author dawish
 */
public abstract class Pago {

    protected long valor;
    protected Cliente cliente;   
    
    /**
     * Default constructor
     */
    public Pago() {
    }
    /**
     * Contruye un pago generico
     * @param valor
     * @param cliente 
     */
    public Pago(int valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }
    

    /**
     * @param cliente
     */
    public void Pago(Cliente cliente) {
        // TODO implement here
    }
    /**
     * Metodo encragado de registrar un pago, segun sea el tiṕo
     * Implemntado por las subclases
     * @param cliente
     * @param valor 
     */
    public abstract void registrarPago(Cliente cliente,long valor);

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

}