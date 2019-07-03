package negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorVuelos {
    
    private List<Vuelo> listado;

    public GestorVuelos() {
        listado = new ArrayList();
        inicializar();
    }

    public void inicializar() {
        listado.add(new Vuelo("1","01/02/2019","15/02/2019","Popayan"));
        listado.add(new Vuelo("2","01/02/2019","15/02/2019","Cali"));
        listado.add(new Vuelo("3","01/02/2019","15/02/2019","Barranquilla"));
        listado.add(new Vuelo("4","01/02/2019","15/02/2019","Bogota"));
    }

    public Vuelo getVuelo(String id) {
        for (Vuelo vuelo : listado) {
            if (vuelo.getId().equals(id)) {
                return vuelo;
            }
        }
        return null;
    }
}
