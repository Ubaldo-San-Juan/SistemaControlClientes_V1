package ventanas;

import alertas.AlertaCobrar;
import alertas.AlertaFinalizarEjecución;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author Ubaldo
 */
public class Cronometro extends Thread {

    JLabel etiqueta, txt_iniciar_pausar;
    JToggleButton boton_iniciar_pausar;
    JComboBox box_horas, box_minutos;

    public Cronometro(JLabel cronometro, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JComboBox box_horas, JComboBox box_minutos) {
        this.etiqueta = cronometro;
        this.boton_iniciar_pausar = btn_iniciar_pausar;
        this.txt_iniciar_pausar = txt_iniciar_pausar;
        this.box_horas = box_horas;
        this.box_minutos = box_minutos;
    }

    public void run() {
        try {
            while (ListaDeClientes.iniciarHilo == true) {
                if (!ListaDeClientes.pausar) {
                    Thread.sleep(4);
                    ListaDeClientes.milesima += 4;

                    if (ListaDeClientes.milesima == 1000) {
                        ListaDeClientes.milesima = 0;
                        ListaDeClientes.segundo += 1;

                        if (ListaDeClientes.segundo == 60) {
                            ListaDeClientes.segundo = 0;
                            ListaDeClientes.minuto += 1;

                            if (ListaDeClientes.minuto == 60) {
                                ListaDeClientes.minuto = 0;
                                ListaDeClientes.hora += 1;
                            }
                        }

                        String textSeg = "", textMin = "", textHora = "";
                        if (ListaDeClientes.segundo < 10) {
                            textSeg = "0" + ListaDeClientes.segundo;
                        } else {
                            textSeg = "" + ListaDeClientes.segundo;
                        }
                        if (ListaDeClientes.minuto < 10) {
                            textMin = "0" + ListaDeClientes.minuto;
                        } else {
                            textMin = "" + ListaDeClientes.minuto;
                        }
                        if (ListaDeClientes.hora < 10) {
                            textHora = "0" + ListaDeClientes.hora;
                        } else {
                            textHora = "" + ListaDeClientes.hora;
                        }

                        String reloj = textHora + " : " + textMin + " : " + textSeg;
                        etiqueta.setText(reloj);

                        if (ListaDeClientes.item_horas == ListaDeClientes.hora) {
                            if (ListaDeClientes.item_minutos == ListaDeClientes.minuto) {

                                JOptionPane.showMessageDialog(null, "Se acabó el tiempo");
                                ListaDeClientes cobro1 = new ListaDeClientes();
                                cobro1.cobrar();
                                
                                ListaDeClientes.iniciarHilo = false;
                                etiqueta.setText("00 : 00 : 00");
                                ListaDeClientes.corriendo = false;
                                ListaDeClientes.hora = 0;
                                ListaDeClientes.minuto = 0;
                                ListaDeClientes.segundo = 0;
                                ListaDeClientes.item_horas = 0;
                                ListaDeClientes.item_minutos = 0;
                                box_horas.getModel().setSelectedItem("Horas");
                                box_minutos.getModel().setSelectedItem("Minutos");
                                
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


