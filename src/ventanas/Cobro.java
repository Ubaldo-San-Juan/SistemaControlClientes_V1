package ventanas;

import alertas.AlertaCobrar;
import controladores.ControladorFecha;
import controladores.ControladorInventario;
import controladores.ControladorTarifa;
import java.text.DecimalFormat;

/**
 *
 * @author Ubaldo
 */
public class Cobro {

    int numHoras, numMinutos, numSegundos;
    float costoPorHora, costoPorMinuto, costoPorSegundo, precioHoras, precioMinutos, precioSegundos, precioTotal;
    int idUsuario, idCliente;
    
    public Cobro(int numHoras, int numMinutos, int numSegundos, int idUsuario, int idCliente) {
        this.numHoras = numHoras;
        this.numMinutos = numMinutos;
        this.numSegundos = numSegundos;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
    }

    public void calcularCobro() {
        System.out.println(numHoras + " : " + numMinutos + " : " + numSegundos);
        ControladorTarifa controladorTarifa1 = new ControladorTarifa();
        costoPorHora = controladorTarifa1.obtenerTarifa();
        costoPorMinuto = costoPorHora / 60;
        costoPorSegundo = costoPorMinuto / 60;

        precioHoras = numHoras * costoPorHora;
        precioMinutos = numMinutos * costoPorMinuto;
        precioSegundos = numSegundos * costoPorSegundo;

        precioTotal = (float)Math.round((precioHoras + precioMinutos + precioSegundos) * 100f) / 100f;
        
        //Mostrar la alerta cobrar
        AlertaCobrar alertaCobrar1 = new AlertaCobrar();
        alertaCobrar1.setPrecioTotal(precioTotal);

        //Insertar datos a inventario
        ControladorInventario controlInventario = new ControladorInventario();
        ControladorFecha controlFecha = new ControladorFecha();
        int diaNum = controlFecha.obtenerNumDia();
        String diaNombre = controlFecha.obtenerNombreDia();
        String mesNombre = controlFecha.obtenerNombreMes();
        int anio = controlFecha.obtenerNumAnio();
        
        
        controlInventario.agregarInventario(idUsuario, idCliente, numHoras, numMinutos, precioTotal, diaNum, diaNombre, mesNombre, anio);

        alertaCobrar1.setVisible(true);

    }

}
