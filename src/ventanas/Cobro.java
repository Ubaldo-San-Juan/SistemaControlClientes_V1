package ventanas;

import alertas.AlertaCobrar;
import java.text.DecimalFormat;

/**
 *
 * @author Ubaldo
 */
public class Cobro {
    int numHoras, numMinutos, numSegundos;
    float costoPorHora,costoPorMinuto, costoPorSegundo, precioHoras, precioMinutos, precioSegundos, precioTotal; 
    
    
    public Cobro(int numHoras, int numMinutos, int numSegundos){
        this.numHoras = numHoras;
        this.numMinutos = numMinutos;
        this.numSegundos = numSegundos;
    }
    
    
    public void calcularCobro(){
        System.out.println(numHoras + " : " + numMinutos + " : " + numSegundos);
        costoPorHora = 5;
        costoPorMinuto = costoPorHora / 60;
        costoPorSegundo = costoPorMinuto / 60;
        
        precioHoras = numHoras * costoPorHora;
        precioMinutos = numMinutos * costoPorMinuto;
        precioSegundos = numSegundos * costoPorSegundo;
        
        
        precioTotal = precioHoras + precioMinutos + precioSegundos;
        //Mostrar la alerta cobrar
        AlertaCobrar alertaCobrar1 = new AlertaCobrar();
        alertaCobrar1.setPrecioTotal(precioTotal);
        alertaCobrar1.setVisible(true);
        
    }
    
}