
package controladores;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ubaldo
 */
public class Fecha {
    
    public String obtenerFecha(){
        String nombreDia = new SimpleDateFormat("EEEE").format(new Date());
        String numDia = new SimpleDateFormat("dd").format(new Date());
        String numMes = new SimpleDateFormat("MMMM").format(new Date());
        String numAnio = new SimpleDateFormat("YYYY").format(new Date());
        String fechaTotal = nombreDia + " " + numDia + "/" + numMes + "/" + numAnio;        
        return fechaTotal;
    }    

}
