package controladores;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ubaldo
 */
public class ControladorFecha {

    public String obtenerFecha() {
        String nombreDia = new SimpleDateFormat("EEEE").format(new Date());
        String numDia = new SimpleDateFormat("dd").format(new Date());
        String nombreMes = new SimpleDateFormat("MMMM").format(new Date());
        String numAnio = new SimpleDateFormat("YYYY").format(new Date());
        String fechaTotal = nombreDia + " " + numDia + "/" + nombreMes + "/" + numAnio;
        return fechaTotal;
    }

    public String obtenerNombreDia() {
        String nombreDia = new SimpleDateFormat("EEEE").format(new Date());
        return nombreDia;
    }

    public int obtenerNumDia() {
        int numDia = Integer.parseInt(new SimpleDateFormat("dd").format(new Date()));
        return numDia;
    }

    public String obtenerNombreMes() {
        String nombreMes = new SimpleDateFormat("MMMM").format(new Date());
        return nombreMes;
    }

    public int obtenerNumAnio() {
        int numAnio = Integer.parseInt(new SimpleDateFormat("YYYY").format(new Date()));
        return numAnio;
    }
}
