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
public class Cronometro_8 extends Thread {

    JLabel etiqueta, txt_iniciar_pausar;
    JToggleButton boton_iniciar_pausar;
    JComboBox box_horas, box_minutos;
    JLabel txt_tiempo_agregado, txt_tiempo_total;
    public Cronometro_8(JLabel cronometro, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JComboBox box_horas, JComboBox box_minutos, JLabel txt_tiempo_agregado, JLabel txt_tiempo_total) {
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
            while (ListaDeClientes.iniciarHilo_8 == true) {
                if (!ListaDeClientes.pausar_8) {
                    Thread.sleep(4);
                    ListaDeClientes.milesima_8 += 4;

                    if (ListaDeClientes.milesima_8 == 1000) {
                        ListaDeClientes.milesima_8 = 0;
                        ListaDeClientes.segundo_8 += 1;

                        if (ListaDeClientes.segundo_8 == 60) {
                            ListaDeClientes.segundo_8 = 0;
                            ListaDeClientes.minuto_8 += 1;

                            if (ListaDeClientes.minuto_8 == 60) {
                                ListaDeClientes.minuto_8 = 0;
                                ListaDeClientes.hora_8 += 1;
                            }
                        }

                        String textSeg = "", textMin = "", textHora = "";
                        if (ListaDeClientes.segundo_8 < 10) {
                            textSeg = "0" + ListaDeClientes.segundo_8;
                        } else {
                            textSeg = "" + ListaDeClientes.segundo_8;
                        }
                        if (ListaDeClientes.minuto_8 < 10) {
                            textMin = "0" + ListaDeClientes.minuto_8;
                        } else {
                            textMin = "" + ListaDeClientes.minuto_8;
                        }
                        if (ListaDeClientes.hora_8 < 10) {
                            textHora = "0" + ListaDeClientes.hora_8;
                        } else {
                            textHora = "" + ListaDeClientes.hora_8;
                        }

                        String reloj = textHora + " : " + textMin + " : " + textSeg;
                        etiqueta.setText(reloj);

                        if (ListaDeClientes.item_horas_8 == ListaDeClientes.hora_8) {
                            if (ListaDeClientes.item_minutos_8 == ListaDeClientes.minuto_8) {

                                JOptionPane.showMessageDialog(null, "Se acabó el tiempo");
                                ListaDeClientes cobro_8 = new ListaDeClientes();
                                cobro_8.cobrar_8();
                                
                                ListaDeClientes.iniciarHilo_8 = false;
                                etiqueta.setText("00 : 00 : 00");
                                ListaDeClientes.corriendo_8 = false;
                                ListaDeClientes.hora_8 = 0;
                                ListaDeClientes.minuto_8 = 0;
                                ListaDeClientes.segundo_8 = 0;
                                ListaDeClientes.item_horas_8 = 0;
                                ListaDeClientes.item_minutos_8 = 0;
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


