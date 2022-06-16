package cronometros;

import alertas.AlertaCobrar;
import alertas.AlertaFinalizarEjecución;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import ventanas.ListaDeClientes;

/**
 *
 * @author Ubaldo
 */
public class Cronometro_3 extends Thread {

    JLabel etiqueta, txt_iniciar_pausar;
    JToggleButton boton_iniciar_pausar;
    JComboBox box_horas, box_minutos;
    JLabel txt_tiempo_agregado, txt_tiempo_total;
    public Cronometro_3(JLabel cronometro, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JComboBox box_horas, JComboBox box_minutos, JLabel txt_tiempo_agregado, JLabel txt_tiempo_total) {
        this.etiqueta = cronometro;
        this.boton_iniciar_pausar = btn_iniciar_pausar;
        this.txt_iniciar_pausar = txt_iniciar_pausar;
        this.box_horas = box_horas;
        this.box_minutos = box_minutos;
        this.txt_tiempo_agregado = txt_tiempo_agregado;
        this.txt_tiempo_total = txt_tiempo_total;
    }

    public void run() {
        try {
            while (ListaDeClientes.iniciarHilo_3 == true) {
                if (!ListaDeClientes.pausar_3) {
                    Thread.sleep(4);
                    ListaDeClientes.milesima_3 += 4;

                    if (ListaDeClientes.milesima_3 == 1000) {
                        ListaDeClientes.milesima_3 = 0;
                        ListaDeClientes.segundo_3 += 1;

                        if (ListaDeClientes.segundo_3 == 60) {
                            ListaDeClientes.segundo_3 = 0;
                            ListaDeClientes.minuto_3 += 1;

                            if (ListaDeClientes.minuto_3 == 60) {
                                ListaDeClientes.minuto_3 = 0;
                                ListaDeClientes.hora_3 += 1;
                            }
                        }

                        String textSeg = "", textMin = "", textHora = "";
                        if (ListaDeClientes.segundo_3 < 10) {
                            textSeg = "0" + ListaDeClientes.segundo_3;
                        } else {
                            textSeg = "" + ListaDeClientes.segundo_3;
                        }
                        if (ListaDeClientes.minuto_3 < 10) {
                            textMin = "0" + ListaDeClientes.minuto_3;
                        } else {
                            textMin = "" + ListaDeClientes.minuto_3;
                        }
                        if (ListaDeClientes.hora_3 < 10) {
                            textHora = "0" + ListaDeClientes.hora_3;
                        } else {
                            textHora = "" + ListaDeClientes.hora_3;
                        }

                        String reloj = textHora + " : " + textMin + " : " + textSeg;
                        etiqueta.setText(reloj);

                        if (ListaDeClientes.item_horas_3 == ListaDeClientes.hora_3) {
                            if (ListaDeClientes.item_minutos_3 == ListaDeClientes.minuto_3) {

                                JOptionPane.showMessageDialog(null, "Se acabó el tiempo");
                                ListaDeClientes cobro_3 = new ListaDeClientes();
                                cobro_3.cobrar_3();
                                
                                ListaDeClientes.iniciarHilo_3 = false;
                                etiqueta.setText("00 : 00 : 00");
                                ListaDeClientes.corriendo_3 = false;
                                ListaDeClientes.hora_3 = 0;
                                ListaDeClientes.minuto_3 = 0;
                                ListaDeClientes.segundo_3 = 0;
                                ListaDeClientes.item_horas_3 = 0;
                                ListaDeClientes.item_minutos_3 = 0;
                                box_horas.getModel().setSelectedItem("Horas");
                                box_minutos.getModel().setSelectedItem("Minutos");
                                txt_tiempo_agregado.setText("");
                                txt_tiempo_total.setText("");
                                boton_iniciar_pausar.setSelected(false);
                                boton_iniciar_pausar.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
                                txt_iniciar_pausar.setText("Iniciar");
                                
                            }
                        }

                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Excepcion en el hilo: " + e.getMessage());
        }
    }

}


