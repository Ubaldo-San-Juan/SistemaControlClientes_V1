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
public class Cronometro_1 extends Thread {

    JLabel etiqueta, txt_iniciar_pausar;
    JToggleButton boton_iniciar_pausar;
    JComboBox box_horas, box_minutos;
    JLabel txt_tiempo_agregado, txt_tiempo_total;
    int idCliente = 0;
    public Cronometro_1(int idCliente, JLabel cronometro, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JComboBox box_horas, JComboBox box_minutos, JLabel txt_tiempo_agregado, JLabel txt_tiempo_total) {
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
            while (ListaDeClientes.iniciarHilo_1 == true) {
                if (!ListaDeClientes.pausar_1) {
                    Thread.sleep(4);
                    ListaDeClientes.milesima_1 += 4;

                    if (ListaDeClientes.milesima_1 == 1000) {
                        ListaDeClientes.milesima_1 = 0;
                        ListaDeClientes.segundo_1 += 30;

                        if (ListaDeClientes.segundo_1 == 60) {
                            ListaDeClientes.segundo_1 = 0;
                            ListaDeClientes.minuto_1 += 10;

                            if (ListaDeClientes.minuto_1 == 60) {
                                ListaDeClientes.minuto_1 = 0;
                                ListaDeClientes.hora_1 += 1;
                            }
                        }

                        String textSeg = "", textMin = "", textHora = "";
                        if (ListaDeClientes.segundo_1 < 10) {
                            textSeg = "0" + ListaDeClientes.segundo_1;
                        } else {
                            textSeg = "" + ListaDeClientes.segundo_1;
                        }
                        if (ListaDeClientes.minuto_1 < 10) {
                            textMin = "0" + ListaDeClientes.minuto_1;
                        } else {
                            textMin = "" + ListaDeClientes.minuto_1;
                        }
                        if (ListaDeClientes.hora_1 < 10) {
                            textHora = "0" + ListaDeClientes.hora_1;
                        } else {
                            textHora = "" + ListaDeClientes.hora_1;
                        }

                        String reloj = textHora + " : " + textMin + " : " + textSeg;
                        etiqueta.setText(reloj);

                        if (ListaDeClientes.item_horas_1 == ListaDeClientes.hora_1) {
                            if (ListaDeClientes.item_minutos_1 == ListaDeClientes.minuto_1) {

                                JOptionPane.showMessageDialog(null, "Se acabó el tiempo");
                                ListaDeClientes cobro_1 = new ListaDeClientes();
                                cobro_1.cobrar_1(ListaDeClientes.id_usuario, idCliente);
                                
                                ListaDeClientes.iniciarHilo_1 = false;
                                etiqueta.setText("00 : 00 : 00");
                                ListaDeClientes.corriendo_1 = false;
                                ListaDeClientes.hora_1 = 0;
                                ListaDeClientes.minuto_1 = 0;
                                ListaDeClientes.segundo_1 = 0;
                                ListaDeClientes.item_horas_1 = 0;
                                ListaDeClientes.item_minutos_1 = 0;
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


