package negocio;

import java.util.*;

/**
 * Clase para la creacion de ciudades que haran parte de los paquetes turisticos de la agencia
 * @author dawish
 */
public class CityComponent extends PackComponent {

    private long precio;
    private Vuelo vuelo;
    private Hotel hotel;
    private CityTour cityTour;
    public PlanAlimentacion planAlimentacion;
    private Date checkIn;
    private Date checkOut;



    /**
     * Default constructor
     */
    public CityComponent() {
    }

    /**
     * Constructor parametrizado
     * @param nombre 
     * @param precio
     */
    public CityComponent(String nombre, long precio) {
        super(nombre);
        this.precio=precio;
    }
    /**
     * Constructor parametrizado completo
     * @param precio
     * @param vuelo
     * @param hotel
     * @param cityTour
     * @param planAlimentacion
     * @param nombre 
     */
    public CityComponent(int precio, Vuelo vuelo, Hotel hotel, CityTour cityTour, PlanAlimentacion planAlimentacion, String nombre) {
        super(nombre);
        this.precio = precio;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.cityTour = cityTour;
        this.planAlimentacion = planAlimentacion;
    }

    /**
     * @return
     */
    public long getPrecio() {
        return this.getPrecio();
    }

    /**
     * @param precio
     */
    public void setPrecio(long precio) {
        this.precio=precio;
    }

    /**
     * @return
     */
    public Vuelo getVuelo() {
        return this.vuelo;
    }

    /**
     * @param vuelo
     */
    public void setVuelo(Vuelo vuelo) {
        this.vuelo=vuelo;
    }

    /**
     * @return
     */
    public Hotel getHotel() {
       return  this.hotel;
    }

    /**
     * @param hotel
     */
    public void setHotel(Hotel hotel) {
         this.hotel=hotel;
    }

    /**
     * @return
     */
    public CityTour getCityTour() {
            return this.cityTour;
    }

    /**
     * @param cityTour
     */
    public void setCityTour(CityTour cityTour) {
        this.cityTour=cityTour;
    }

    /**
     * @return
     */
    public PlanAlimentacion getPlanAlimentacion() {
        return this.planAlimentacion;
    }

    /**
     * @param planAlimentacion
     */
    public void setPlanAlimentacion(PlanAlimentacion planAlimentacion) {
        this.planAlimentacion=planAlimentacion;
    }

    @Override
    public long getComponentPrecio() {
        return getPrecio();
    }

}