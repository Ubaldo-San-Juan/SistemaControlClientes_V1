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
public class Cronometro_6 extends Thread {

    JLabel etiqueta, txt_iniciar_pausar;
    JToggleButton boton_iniciar_pausar;
    JComboBox box_horas, box_minutos;
    JLabel txt_tiempo_agregado, txt_tiempo_total;
    int idCliente = 0;
    public Cronometro_6(int idCliente, JLabel cronometro, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JComboBox box_horas, JComboBox box_minutos, JLabel txt_tiempo_agregado, JLabel txt_tiempo_total) {
        this.idCliente = idCliente;
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
            while (ListaDeClientes.iniciarHilo_6 == true) {
                if (!ListaDeClientes.pausar_6) {
                    Thread.sleep(4);
                    ListaDeClientes.milesima_6 += 4;

                    if (ListaDeClientes.milesima_6 == 1000) {
                        ListaDeClientes.milesima_6 = 0;
                        ListaDeClientes.segundo_6 += 30;

                        if (ListaDeClientes.segundo_6 == 60) {
                            ListaDeClientes.segundo_6 = 0;
                            ListaDeClientes.minuto_6 += 10;

                            if (ListaDeClientes.minuto_6 == 60) {
                                ListaDeClientes.minuto_6 = 0;
                                ListaDeClientes.hora_6 += 1;
                            }
                        }

                        String textSeg = "", textMin = "", textHora = "";
                        if (ListaDeClientes.segundo_6 < 10) {
                            textSeg = "0" + ListaDeClientes.segundo_6;
                        } else {
                            textSeg = "" + ListaDeClientes.segundo_6;
                        }
                        if (ListaDeClientes.minuto_6 < 10) {
                            textMin = "0" + ListaDeClientes.minuto_6;
                        } else {
                            textMin = "" + ListaDeClientes.minuto_6;
                        }
                        if (ListaDeClientes.hora_6 < 10) {
                            textHora = "0" + ListaDeClientes.hora_6;
                        } else {
                            textHora = "" + ListaDeClientes.hora_6;
                        }

                        String reloj = textHora + " : " + textMin + " : " + textSeg;
                        etiqueta.setText(reloj);

                        if (ListaDeClientes.item_horas_6 == ListaDeClientes.hora_6) {
                            if (ListaDeClientes.item_minutos_6 == ListaDeClientes.minuto_6) {

                                JOptionPane.showMessageDialog(null, "Se acabó el tiempo");
                                ListaDeClientes cobro_6 = new ListaDeClientes();
                                cobro_6.cobrar_6(ListaDeClientes.id_usuario, idCliente);
                                
                                ListaDeClientes.iniciarHilo_6 = false;
                                etiqueta.setText("00 : 00 : 00");
                                ListaDeClientes.corriendo_6 = false;
                                ListaDeClientes.hora_6 = 0;
                                ListaDeClientes.minuto_6 = 0;
                                ListaDeClientes.segundo_6 = 0;
                                ListaDeClientes.item_horas_6 = 0;
                                ListaDeClientes.item_minutos_6 = 0;
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


