package negocio;

import java.util.Date;

public class Vuelo {
    private String fecha1;
    private String fecha2;
    private String ciudad;
    private String id;

    public Vuelo(String id,String fecha1, String fecha2, String ciudad) {
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
        this.ciudad = ciudad;
        this.id=id;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
