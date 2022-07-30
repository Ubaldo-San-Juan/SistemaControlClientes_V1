package ventanas;

import alertas.AlertaFinalizarEjecución;
import com.formdev.flatlaf.FlatIntelliJLaf;
import conexion.Conector;
import controladores.Clientes;
import controladores.ControladorClientes;
import controladores.ControladorFecha;
import controladores.ControladorUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import ventanaPrincipal.Principal;
import cronometros.Cronometro_1;
import cronometros.Cronometro_2;
import cronometros.Cronometro_3;
import cronometros.Cronometro_4;
import cronometros.Cronometro_5;
import cronometros.Cronometro_6;
import cronometros.Cronometro_7;
import cronometros.Cronometro_8;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Ubaldo
 */
public class ListaDeClientes extends javax.swing.JFrame {

    /**
     * Creates new form ListaDeClientes
     */
    public ListaDeClientes() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/Icono.png")).getImage());
        fondo.setPreferredSize(new Dimension(400, 400));

        deshabilitarComponentesDeTodosLosGrupos();
        llenarComboBox();
        agregarFechaALabel();
    }

    public void deshabilitarComponentesDeTodosLosGrupos() {
        //Componentes grupo 1
        box_clientes_1.setEnabled(false);
        box_horas_1.setEnabled(false);
        box_minutos_1.setEnabled(false);
        txt_ingresar_tiempo_1.setEnabled(false);
        btn_iniciar_pausar_1.setEnabled(false);
        txt_iniciar_pausar_1.setEnabled(false);
        btn_parar_1.setEnabled(false);
        txt_parar_1.setEnabled(false);
        txt_H_M_S_1.setEnabled(false);
        txt_tiempo_1.setEnabled(false);
        btn_agregar_tiempo_1.setEnabled(false);
        txt_agregar_tiempo_1.setEnabled(false);

        //Componentes grupo 2
        box_clientes_2.setEnabled(false);
        box_horas_2.setEnabled(false);
        box_minutos_2.setEnabled(false);
        txt_ingresar_tiempo_2.setEnabled(false);
        btn_iniciar_pausar_2.setEnabled(false);
        txt_iniciar_pausar_2.setEnabled(false);
        btn_parar_2.setEnabled(false);
        txt_parar_2.setEnabled(false);
        txt_H_M_S_2.setEnabled(false);
        txt_tiempo_2.setEnabled(false);
        btn_agregar_tiempo_2.setEnabled(false);
        txt_agregar_tiempo_2.setEnabled(false);

        //Componentes grupo 3
        box_clientes_3.setEnabled(false);
        box_horas_3.setEnabled(false);
        box_minutos_3.setEnabled(false);
        txt_ingresar_tiempo_3.setEnabled(false);
        btn_iniciar_pausar_3.setEnabled(false);
        txt_iniciar_pausar_3.setEnabled(false);
        btn_parar_3.setEnabled(false);
        txt_parar_3.setEnabled(false);
        txt_H_M_S_3.setEnabled(false);
        txt_tiempo_3.setEnabled(false);
        btn_agregar_tiempo_3.setEnabled(false);
        txt_agregar_tiempo_3.setEnabled(false);

        //Componentes grupo 4
        box_clientes_4.setEnabled(false);
        box_horas_4.setEnabled(false);
        box_minutos_4.setEnabled(false);
        txt_ingresar_tiempo_4.setEnabled(false);
        btn_iniciar_pausar_4.setEnabled(false);
        txt_iniciar_pausar_4.setEnabled(false);
        btn_parar_4.setEnabled(false);
        txt_parar_4.setEnabled(false);
        txt_H_M_S_4.setEnabled(false);
        txt_tiempo_4.setEnabled(false);
        btn_agregar_tiempo_4.setEnabled(false);
        txt_agregar_tiempo_4.setEnabled(false);

        //Componentes grupo 5
        box_clientes_5.setEnabled(false);
        box_horas_5.setEnabled(false);
        box_minutos_5.setEnabled(false);
        txt_ingresar_tiempo_5.setEnabled(false);
        btn_iniciar_pausar_5.setEnabled(false);
        txt_iniciar_pausar_5.setEnabled(false);
        btn_parar_5.setEnabled(false);
        txt_parar_5.setEnabled(false);
        txt_H_M_S_5.setEnabled(false);
        txt_tiempo_5.setEnabled(false);
        btn_agregar_tiempo_5.setEnabled(false);
        txt_agregar_tiempo_5.setEnabled(false);

        //Componentes grupo 6
        box_clientes_6.setEnabled(false);
        box_horas_6.setEnabled(false);
        box_minutos_6.setEnabled(false);
        txt_ingresar_tiempo_6.setEnabled(false);
        btn_iniciar_pausar_6.setEnabled(false);
        txt_iniciar_pausar_6.setEnabled(false);
        btn_parar_6.setEnabled(false);
        txt_parar_6.setEnabled(false);
        txt_H_M_S_6.setEnabled(false);
        txt_tiempo_6.setEnabled(false);
        btn_agregar_tiempo_6.setEnabled(false);
        txt_agregar_tiempo_6.setEnabled(false);

        //Componentes grupo 7
        box_clientes_7.setEnabled(false);
        box_horas_7.setEnabled(false);
        box_minutos_7.setEnabled(false);
        txt_ingresar_tiempo_7.setEnabled(false);
        btn_iniciar_pausar_7.setEnabled(false);
        txt_iniciar_pausar_7.setEnabled(false);
        btn_parar_7.setEnabled(false);
        txt_parar_7.setEnabled(false);
        txt_H_M_S_7.setEnabled(false);
        txt_tiempo_7.setEnabled(false);
        btn_agregar_tiempo_7.setEnabled(false);
        txt_agregar_tiempo_7.setEnabled(false);

        //Componentes grupo 8
        box_clientes_8.setEnabled(false);
        box_horas_8.setEnabled(false);
        box_minutos_8.setEnabled(false);
        txt_ingresar_tiempo_8.setEnabled(false);
        btn_iniciar_pausar_8.setEnabled(false);
        txt_iniciar_pausar_8.setEnabled(false);
        btn_parar_8.setEnabled(false);
        txt_parar_8.setEnabled(false);
        txt_H_M_S_8.setEnabled(false);
        txt_tiempo_8.setEnabled(false);
        btn_agregar_tiempo_8.setEnabled(false);
        txt_agregar_tiempo_8.setEnabled(false);

    }

    public void agregarFechaALabel() {
        txt_fecha.setText(new ControladorFecha().obtenerFecha());
    }

    public void llenarComboBox() {

//        box_clientes_1.setModel(new ControladorClientes().llenarComboboxClientes());
//        box_clientes_2.setModel(new ControladorClientes().llenarComboboxClientes());
//        box_clientes_3.setModel(new ControladorClientes().llenarComboboxClientes());
//        box_clientes_4.setModel(new ControladorClientes().llenarComboboxClientes());
//        box_clientes_5.setModel(new ControladorClientes().llenarComboboxClientes());
//        box_clientes_6.setModel(new ControladorClientes().llenarComboboxClientes());
//        box_clientes_7.setModel(new ControladorClientes().llenarComboboxClientes());
//        box_clientes_8.setModel(new ControladorClientes().llenarComboboxClientes());
        procesoLlenadoComboBox(box_clientes_1);
        procesoLlenadoComboBox(box_clientes_2);
        procesoLlenadoComboBox(box_clientes_3);
        procesoLlenadoComboBox(box_clientes_4);
        procesoLlenadoComboBox(box_clientes_5);
        procesoLlenadoComboBox(box_clientes_6);
        procesoLlenadoComboBox(box_clientes_7);
        procesoLlenadoComboBox(box_clientes_8);

    }

    public void procesoLlenadoComboBox(JComboBox box_Clientes) {
        try {

            Conector conexion = new Conector();

            Connection cn = conexion.conectar();

            Statement st = cn.createStatement();

            ResultSet rst = st.executeQuery("SELECT id_cliente, nombre FROM clientes");
            box_Clientes.addItem(new Clientes(0, "Selecciona un cliente"));

            while (rst.next()) {
                int idCliente = Integer.parseInt(rst.getString(1));
                String nombreCliente = rst.getString(2);
                System.out.println("idCliente: " + idCliente);
                System.out.println("nombreCliente: " + nombreCliente);
                box_Clientes.addItem(new Clientes(idCliente, nombreCliente));

            }

            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ListaDeClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    boolean var_btn_iniciar_pausar_1 = false;
    boolean var_btn_iniciar_pausar_2 = false;
    boolean var_btn_iniciar_pausar_3 = false;
    boolean var_btn_iniciar_pausar_4 = false;
    boolean var_btn_iniciar_pausar_5 = false;
    boolean var_btn_iniciar_pausar_6 = false;
    boolean var_btn_iniciar_pausar_7 = false;
    boolean var_btn_iniciar_pausar_8 = false;

    //Variables 
    public static int hora_1 = 0, minuto_1 = 0, segundo_1 = 0, milesima_1 = 0;
    public static int hora_2 = 0, minuto_2 = 0, segundo_2 = 0, milesima_2 = 0;
    public static int hora_3 = 0, minuto_3 = 0, segundo_3 = 0, milesima_3 = 0;
    public static int hora_4 = 0, minuto_4 = 0, segundo_4 = 0, milesima_4 = 0;
    public static int hora_5 = 0, minuto_5 = 0, segundo_5 = 0, milesima_5 = 0;
    public static int hora_6 = 0, minuto_6 = 0, segundo_6 = 0, milesima_6 = 0;
    public static int hora_7 = 0, minuto_7 = 0, segundo_7 = 0, milesima_7 = 0;
    public static int hora_8 = 0, minuto_8 = 0, segundo_8 = 0, milesima_8 = 0;

    public static boolean iniciarHilo_1 = true;
    public static boolean iniciarHilo_2 = true;
    public static boolean iniciarHilo_3 = true;
    public static boolean iniciarHilo_4 = true;
    public static boolean iniciarHilo_5 = true;
    public static boolean iniciarHilo_6 = true;
    public static boolean iniciarHilo_7 = true;
    public static boolean iniciarHilo_8 = true;

    public static boolean corriendo_1 = false;
    public static boolean corriendo_2 = false;
    public static boolean corriendo_3 = false;
    public static boolean corriendo_4 = false;
    public static boolean corriendo_5 = false;
    public static boolean corriendo_6 = false;
    public static boolean corriendo_7 = false;
    public static boolean corriendo_8 = false;

    public static boolean pausar_1 = false;
    public static boolean pausar_2 = false;
    public static boolean pausar_3 = false;
    public static boolean pausar_4 = false;
    public static boolean pausar_5 = false;
    public static boolean pausar_6 = false;
    public static boolean pausar_7 = false;
    public static boolean pausar_8 = false;

    public static int item_horas_1 = 0, item_minutos_1 = 0;
    public static int item_horas_2 = 0, item_minutos_2 = 0;
    public static int item_horas_3 = 0, item_minutos_3 = 0;
    public static int item_horas_4 = 0, item_minutos_4 = 0;
    public static int item_horas_5 = 0, item_minutos_5 = 0;
    public static int item_horas_6 = 0, item_minutos_6 = 0;
    public static int item_horas_7 = 0, item_minutos_7 = 0;
    public static int item_horas_8 = 0, item_minutos_8 = 0;

    public static String item_clientes_1 = "";
    public static String item_clientes_2 = "";
    public static String item_clientes_3 = "";
    public static String item_clientes_4 = "";
    public static String item_clientes_5 = "";
    public static String item_clientes_6 = "";
    public static String item_clientes_7 = "";
    public static String item_clientes_8 = "";

    
    public static int id_usuario = 0;
    
    public static int id_cliente_1 = 0;
    public static int id_cliente_2 = 0;
    public static int id_cliente_3 = 0;
    public static int id_cliente_4 = 0;
    public static int id_cliente_5 = 0;
    public static int id_cliente_6 = 0;
    public static int id_cliente_7 = 0;
    public static int id_cliente_8 = 0;
    

    Agregar_tiempo agregarTiempo_1 = new Agregar_tiempo();
    Agregar_tiempo agregarTiempo_2 = new Agregar_tiempo();
    Agregar_tiempo agregarTiempo_3 = new Agregar_tiempo();
    Agregar_tiempo agregarTiempo_4 = new Agregar_tiempo();
    Agregar_tiempo agregarTiempo_5 = new Agregar_tiempo();
    Agregar_tiempo agregarTiempo_6 = new Agregar_tiempo();
    Agregar_tiempo agregarTiempo_7 = new Agregar_tiempo();
    Agregar_tiempo agregarTiempo_8 = new Agregar_tiempo();

    AgregarClienteNuevo agregarCliente1 = new AgregarClienteNuevo();

    public JPanel getFondo() {
        return fondo;
    }

    public void cobrar_1(int idUsuario, int idcliente) {
        System.out.println("id del Cliente: " + idcliente);
        System.out.println("id del Usuario: " + idUsuario);
        Cobro cobro_1 = new Cobro(hora_1, minuto_1, segundo_1, idUsuario, idcliente);
        cobro_1.calcularCobro();
    }

    public void cobrar_2(int idUsuario, int idCliente) {
        Cobro cobro_2 = new Cobro(hora_2, minuto_2, segundo_2, idUsuario, idCliente);
        cobro_2.calcularCobro();
    }

    public void cobrar_3(int idUsuario, int idCliente) {
        Cobro cobro_3 = new Cobro(hora_3, minuto_3, segundo_3, idUsuario, idCliente);
        cobro_3.calcularCobro();
    }

    public void cobrar_4(int idUsuario, int idCliente) {
        Cobro cobro_4 = new Cobro(hora_4, minuto_4, segundo_4, idUsuario, idCliente);
        cobro_4.calcularCobro();
    }

    public void cobrar_5(int idUsuario, int idCliente) {
        Cobro cobro_5 = new Cobro(hora_5, minuto_5, segundo_5, idUsuario, idCliente);
        cobro_5.calcularCobro();
    }

    public void cobrar_6(int idUsuario, int idCliente) {
        Cobro cobro_6 = new Cobro(hora_6, minuto_6, segundo_6, idUsuario, idCliente);
        cobro_6.calcularCobro();
    }

    public void cobrar_7(int idUsuario, int idCliente) {
        Cobro cobro_7 = new Cobro(hora_7, minuto_7, segundo_7, idUsuario, idCliente);
        cobro_7.calcularCobro();
    }

    public void cobrar_8(int idUsuario, int idCliente) {
        Cobro cobro_8 = new Cobro(hora_8, minuto_8, segundo_8, idUsuario, idCliente);
        cobro_8.calcularCobro();
    }

    public void procesoBotonIniciarPausar(int id, JComboBox box_clientes, JComboBox box_horas, JComboBox box_minutos, boolean var_btn_iniciar_pausar, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, boolean corriendo, boolean pausar, JToggleButton btn_on_off) {

        System.out.println("Horas: " + box_horas.getModel().getSelectedItem() + " - Minutos: " + box_minutos.getModel().getSelectedItem());
        var_btn_iniciar_pausar = btn_iniciar_pausar.getModel().isSelected();

        if (btn_on_off.isSelected() == true) {
            if (box_horas.getModel().getSelectedItem() == "Horas" || box_minutos.getModel().getSelectedItem() == "Minutos") {
                btn_iniciar_pausar.setSelected(false);
                var_btn_iniciar_pausar = false;
                btn_iniciar_pausar.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
                txt_iniciar_pausar.setText("Iniciar");

                corriendo = false;
                switch (id) {
                    case 1:
                        iniciarHilo_1 = false;
                        break;
                    case 2:
                        iniciarHilo_2 = false;
                        break;
                    case 3:
                        iniciarHilo_3 = false;
                        break;
                    case 4:
                        iniciarHilo_4 = false;
                    case 5:
                        iniciarHilo_5 = false;
                        break;
                    case 6:
                        iniciarHilo_6 = false;
                        break;
                    case 7:
                        iniciarHilo_7 = false;
                        break;
                    case 8:
                        iniciarHilo_8 = false;

                }
                pausar = false;

                JOptionPane.showMessageDialog(null, "Por favor ingrese el tiempo (horas y minutos)");

            } else {

                if (box_clientes.getSelectedItem() == "Seleccionar cliente") {

                    btn_iniciar_pausar.setSelected(false);
                    var_btn_iniciar_pausar = false;
                    btn_iniciar_pausar.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
                    txt_iniciar_pausar.setText("Iniciar");

                    corriendo = false;
                    switch (id) {
                        case 1:
                            iniciarHilo_1 = false;
                            break;
                        case 2:
                            iniciarHilo_2 = false;
                            break;
                        case 3:
                            iniciarHilo_3 = false;
                            break;
                        case 4:
                            iniciarHilo_4 = false;
                        case 5:
                            iniciarHilo_5 = false;
                            break;
                        case 6:
                            iniciarHilo_6 = false;
                            break;
                        case 7:
                            iniciarHilo_7 = false;
                            break;
                        case 8:
                            iniciarHilo_8 = false;
                    }
                    pausar = false;

                    JOptionPane.showMessageDialog(null, "Por favor seleccione el cliente");

                } else {
                    System.out.println("Puede pasar");
                    //Diseño del boton iniciar-pausar
                    System.out.println("Propiedad del boton(selected):" + var_btn_iniciar_pausar);

                    if (var_btn_iniciar_pausar == true) { //Si el botón iniciar pausar está encendido
                        btn_iniciar_pausar.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_pausar.png")));
                        txt_iniciar_pausar.setText("Pausar");

                        //Funcionalidad del boton
                        if (corriendo == false) {

                            corriendo = true;
                            switch (id) {
                                case 1:
                                    iniciarHilo_1 = true;
                                    break;
                                case 2:
                                    iniciarHilo_2 = true;
                                    break;
                                case 3:
                                    iniciarHilo_3 = true;
                                    break;
                                case 4:
                                    iniciarHilo_4 = true;
                                case 5:
                                    iniciarHilo_5 = true;
                                    break;
                                case 6:
                                    iniciarHilo_6 = true;
                                    break;
                                case 7:
                                    iniciarHilo_7 = true;
                                    break;
                                case 8:
                                    iniciarHilo_8 = true;

                            }
                            pausar = false;

                            switch (id) {
                                case 1:
                                    iniciarHiloCronometro_1();
                                    break;
                                case 2:
                                    iniciarHiloCronometro_2();
                                    break;
                                case 3:
                                    iniciarHiloCronometro_3();
                                    break;
                                case 4:
                                    iniciarHiloCronometro_4();
                                    break;
                                case 5:
                                    iniciarHiloCronometro_5();
                                    break;
                                case 6:
                                    iniciarHiloCronometro_6();
                                    break;
                                case 7:
                                    iniciarHiloCronometro_7();
                                    break;
                                case 8:
                                    iniciarHiloCronometro_8();
                                    break;
                            }
                        }

                    } else if (var_btn_iniciar_pausar == false) { //Si el botón iniciar pausar está apagado

                        btn_iniciar_pausar.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
                        txt_iniciar_pausar.setText("Reaundar");

                        //Funcionalidad del botón
                        corriendo = false;
                        switch (id) {
                            case 1:
                                iniciarHilo_1 = false;
                                break;
                            case 2:
                                iniciarHilo_2 = false;
                                break;
                            case 3:
                                iniciarHilo_3 = false;
                                break;
                            case 4:
                                iniciarHilo_4 = false;
                            case 5:
                                iniciarHilo_5 = false;
                                break;
                            case 6:
                                iniciarHilo_6 = false;
                                break;
                            case 7:
                                iniciarHilo_7 = false;
                                break;
                            case 8:
                                iniciarHilo_8 = false;
                        }
                        pausar = false;

                        System.out.println("Propiedad del boton(selected):" + var_btn_iniciar_pausar);

                    }
                }

            }
        } else {

        }

    }

    public void procesoBotonParar(int hora, int minuto, int segundo, int idUsuario, int idCliente, int id, JLabel txt_tiempo, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JComboBox box_horas, JComboBox box_minutos, JLabel txt_tiempo_agregado, JLabel txt_tiempo_total) {
        if (hora != 0 || minuto != 0 || segundo != 0) {

            if (id == 1) {
                AlertaFinalizarEjecución finalizarEjecucion_1 = new AlertaFinalizarEjecución();

                finalizarEjecucion_1.otorgarTextoAEtiqueta(txt_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, box_horas, box_minutos, txt_tiempo_agregado, txt_tiempo_total);
                finalizarEjecucion_1.otorgarID(id);
                finalizarEjecucion_1.otorgarIdUsuario(idUsuario);
                finalizarEjecucion_1.otorgarIdCliente(idCliente);
                finalizarEjecucion_1.setVisible(true);
            } else if (id == 2) {
                AlertaFinalizarEjecución finalizarEjecucion_2 = new AlertaFinalizarEjecución();

                finalizarEjecucion_2.otorgarTextoAEtiqueta(txt_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, box_horas, box_minutos, txt_tiempo_agregado, txt_tiempo_total);
                finalizarEjecucion_2.otorgarID(id);
                finalizarEjecucion_2.otorgarIdUsuario(idUsuario);
                finalizarEjecucion_2.otorgarIdCliente(idCliente);
                finalizarEjecucion_2.setVisible(true);
            } else if (id == 3) {
                AlertaFinalizarEjecución finalizarEjecucion_3 = new AlertaFinalizarEjecución();
                
                finalizarEjecucion_3.otorgarTextoAEtiqueta(txt_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, box_horas, box_minutos, txt_tiempo_agregado, txt_tiempo_total);
                finalizarEjecucion_3.otorgarID(id);
                finalizarEjecucion_3.otorgarIdUsuario(idUsuario);
                finalizarEjecucion_3.otorgarIdCliente(idCliente);
                finalizarEjecucion_3.setVisible(true);
            } else if (id == 4) {
                AlertaFinalizarEjecución finalizarEjecucion_4 = new AlertaFinalizarEjecución();

                finalizarEjecucion_4.otorgarTextoAEtiqueta(txt_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, box_horas, box_minutos, txt_tiempo_agregado, txt_tiempo_total);
                finalizarEjecucion_4.otorgarID(id);
                finalizarEjecucion_4.otorgarIdUsuario(idUsuario);
                finalizarEjecucion_4.otorgarIdCliente(idCliente);
                finalizarEjecucion_4.setVisible(true);
            } else if (id == 5) {
                AlertaFinalizarEjecución finalizarEjecucion_5 = new AlertaFinalizarEjecución();

                finalizarEjecucion_5.otorgarTextoAEtiqueta(txt_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, box_horas, box_minutos, txt_tiempo_agregado, txt_tiempo_total);
                finalizarEjecucion_5.otorgarID(id);
                finalizarEjecucion_5.otorgarIdUsuario(idUsuario);
                finalizarEjecucion_5.otorgarIdCliente(idCliente);
                finalizarEjecucion_5.setVisible(true);
            } else if (id == 6) {
                AlertaFinalizarEjecución finalizarEjecucion_6 = new AlertaFinalizarEjecución();

                finalizarEjecucion_6.otorgarTextoAEtiqueta(txt_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, box_horas, box_minutos, txt_tiempo_agregado, txt_tiempo_total);
                finalizarEjecucion_6.otorgarID(id);
                finalizarEjecucion_6.otorgarIdUsuario(idUsuario);
                finalizarEjecucion_6.otorgarIdCliente(idCliente);
                finalizarEjecucion_6.setVisible(true);
            } else if (id == 7) {
                AlertaFinalizarEjecución finalizarEjecucion_7 = new AlertaFinalizarEjecución();

                finalizarEjecucion_7.otorgarTextoAEtiqueta(txt_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, box_horas, box_minutos, txt_tiempo_agregado, txt_tiempo_total);
                finalizarEjecucion_7.otorgarID(id);
                finalizarEjecucion_7.otorgarIdUsuario(idUsuario);
                finalizarEjecucion_7.otorgarIdCliente(idCliente);
                finalizarEjecucion_7.setVisible(true);
            } else if (id == 8) {
                AlertaFinalizarEjecución finalizarEjecucion_8 = new AlertaFinalizarEjecución();

                finalizarEjecucion_8.otorgarTextoAEtiqueta(txt_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, box_horas, box_minutos, txt_tiempo_agregado, txt_tiempo_total);
                finalizarEjecucion_8.otorgarID(id);
                finalizarEjecucion_8.otorgarIdUsuario(idUsuario);
                finalizarEjecucion_8.otorgarIdCliente(idCliente);
                finalizarEjecucion_8.setVisible(true);
            }

        } else {
            System.out.println("Hora, minuto, segundo == 0");
        }

    }

    public void procesoBotonAgregarTiempo(JToggleButton btn_on_off, JComboBox box_horas, JComboBox box_minutos, int id, JLabel txt_tiempo_agregado, JLabel txt_tiempo_total) {
        if (btn_on_off.isSelected() == true) {
            if (box_horas.getModel().getSelectedItem().equals("Horas") || box_minutos.getModel().getSelectedItem().equals("Minutos")) {
                JOptionPane.showMessageDialog(null, "No se ha ingresado el tiempo");
            } else {
                if (id == 1) {
                    agregarTiempo_1.setVisible(true);
                    agregarTiempo_1.agregarTextoTiempoAgregado(txt_tiempo_agregado, txt_tiempo_total);
                    agregarTiempo_1.asignarID(id);
                    if (agregarTiempo_1.isShowing()) {
                        System.out.println("Está mostrado");
                    }
                } else if (id == 2) {
                    agregarTiempo_2.setVisible(true);
                    agregarTiempo_2.agregarTextoTiempoAgregado(txt_tiempo_agregado, txt_tiempo_total);
                    agregarTiempo_2.asignarID(id);
                    if (agregarTiempo_2.isShowing()) {
                        System.out.println("Está mostrado");
                    }
                } else if (id == 3) {
                    agregarTiempo_3.setVisible(true);
                    agregarTiempo_3.agregarTextoTiempoAgregado(txt_tiempo_agregado, txt_tiempo_total);
                    agregarTiempo_3.asignarID(id);
                    if (agregarTiempo_3.isShowing()) {
                        System.out.println("Está mostrado");
                    }
                } else if (id == 4) {
                    agregarTiempo_4.setVisible(true);
                    agregarTiempo_4.agregarTextoTiempoAgregado(txt_tiempo_agregado, txt_tiempo_total);
                    agregarTiempo_4.asignarID(id);
                    if (agregarTiempo_4.isShowing()) {
                        System.out.println("Está mostrado");
                    }
                } else if (id == 5) {
                    agregarTiempo_5.setVisible(true);
                    agregarTiempo_5.agregarTextoTiempoAgregado(txt_tiempo_agregado, txt_tiempo_total);
                    agregarTiempo_5.asignarID(id);
                    if (agregarTiempo_5.isShowing()) {
                        System.out.println("Está mostrado");
                    }
                } else if (id == 6) {
                    agregarTiempo_6.setVisible(true);
                    agregarTiempo_6.agregarTextoTiempoAgregado(txt_tiempo_agregado, txt_tiempo_total);
                    agregarTiempo_6.asignarID(id);
                    if (agregarTiempo_6.isShowing()) {
                        System.out.println("Está mostrado");
                    }
                } else if (id == 7) {
                    agregarTiempo_7.setVisible(true);
                    agregarTiempo_7.agregarTextoTiempoAgregado(txt_tiempo_agregado, txt_tiempo_total);
                    agregarTiempo_7.asignarID(id);
                    if (agregarTiempo_7.isShowing()) {
                        System.out.println("Está mostrado");
                    }
                } else if (id == 8) {
                    agregarTiempo_8.setVisible(true);
                    agregarTiempo_8.agregarTextoTiempoAgregado(txt_tiempo_agregado, txt_tiempo_total);
                    agregarTiempo_8.asignarID(id);
                    if (agregarTiempo_8.isShowing()) {
                        System.out.println("Está mostrado");
                    }
                }

            }
        }
    }

    public void procesoBotonOn_Off(JToggleButton btn_on_off, JLabel contenedor, JComboBox box_clientes, JComboBox box_horas, JComboBox box_minutos, JLabel txt_ingresar_tiempo, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JButton btn_parar, JLabel txt_parar, JLabel txt_H_M_S, JLabel txt_tiempo, JButton btn_agregar_tiempo, JLabel txt_agregar_tiempo, int hora, int minuto, int segundo) {
        System.out.println("Selected: " + btn_on_off.getModel().isSelected());

        if (btn_on_off.getModel().isSelected() == true) { //Si el boton está encendido

            //Agregamos el icono de encendido y el contenedor encendido
            btn_on_off.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_ON.png")));
            contenedor.setIcon(new ImageIcon(getClass().getResource("/contenedores/Contenedor_05.png")));

            //Habilitamos todos los componentes del grupo 1
            habilitarComponentesPorGrupo(box_clientes, box_horas, box_minutos, txt_ingresar_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, btn_parar, txt_parar, txt_H_M_S, txt_tiempo, btn_agregar_tiempo, txt_agregar_tiempo);

        } else {    //Si el botón está apagado

            //Agregamos el icono de apagado y el contenedor apagado
            btn_on_off.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_OFF.png")));
            contenedor.setIcon(new ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png")));

            //Deshabilitamos todos los componentes del grupo 1
            deshabilitarComponentesPorGrupo(box_clientes, box_horas, box_minutos, txt_ingresar_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, btn_parar, txt_parar, txt_H_M_S, txt_tiempo, btn_agregar_tiempo, txt_agregar_tiempo);
        }

        if (hora != 0 || minuto != 0 || segundo != 0) {

            //Agregamos el icono de encendido y el contenedor encendido
            btn_on_off.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_ON.png")));
            contenedor.setIcon(new ImageIcon(getClass().getResource("/contenedores/Contenedor_05.png")));

            //Habilitamos todos los componentes del grupo 1
            habilitarComponentesPorGrupo(box_clientes, box_horas, box_minutos, txt_ingresar_tiempo, btn_iniciar_pausar, txt_iniciar_pausar, btn_parar, txt_parar, txt_H_M_S, txt_tiempo, btn_agregar_tiempo, txt_agregar_tiempo);

            JOptionPane.showMessageDialog(null, "Hay una sesión corriendo");
            btn_on_off.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        txt_fecha = new javax.swing.JLabel();
        titulo_sistema = new javax.swing.JLabel();
        btn_agregar_cliente_nuevo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        txt_parar_1 = new javax.swing.JLabel();
        txt_iniciar_pausar_1 = new javax.swing.JLabel();
        txt_H_M_S_1 = new javax.swing.JLabel();
        txt_tiempo_1 = new javax.swing.JLabel();
        txt_agregar_tiempo_1 = new javax.swing.JLabel();
        btn_agregar_tiempo_1 = new javax.swing.JButton();
        btn_parar_1 = new javax.swing.JButton();
        btn_iniciar_pausar_1 = new javax.swing.JToggleButton();
        txt_tiempo_total_1 = new javax.swing.JLabel();
        txt_tiempo_agregado_1 = new javax.swing.JLabel();
        box_minutos_1 = new javax.swing.JComboBox<>();
        box_horas_1 = new javax.swing.JComboBox<>();
        box_clientes_1 = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_1 = new javax.swing.JLabel();
        btn_on_off_1 = new javax.swing.JToggleButton();
        txt_id_sesion_1 = new javax.swing.JLabel();
        contenedor_1 = new javax.swing.JLabel();
        txt_parar_2 = new javax.swing.JLabel();
        txt_iniciar_pausar_2 = new javax.swing.JLabel();
        txt_H_M_S_2 = new javax.swing.JLabel();
        txt_tiempo_2 = new javax.swing.JLabel();
        txt_agregar_tiempo_2 = new javax.swing.JLabel();
        btn_agregar_tiempo_2 = new javax.swing.JButton();
        btn_parar_2 = new javax.swing.JButton();
        btn_iniciar_pausar_2 = new javax.swing.JToggleButton();
        txt_tiempo_total_2 = new javax.swing.JLabel();
        txt_tiempo_agregado_2 = new javax.swing.JLabel();
        box_minutos_2 = new javax.swing.JComboBox<>();
        box_horas_2 = new javax.swing.JComboBox<>();
        box_clientes_2 = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_2 = new javax.swing.JLabel();
        btn_on_off_2 = new javax.swing.JToggleButton();
        txt_id_sesion_2 = new javax.swing.JLabel();
        contenedor_2 = new javax.swing.JLabel();
        txt_parar_3 = new javax.swing.JLabel();
        txt_iniciar_pausar_3 = new javax.swing.JLabel();
        txt_H_M_S_3 = new javax.swing.JLabel();
        txt_tiempo_3 = new javax.swing.JLabel();
        txt_agregar_tiempo_3 = new javax.swing.JLabel();
        btn_agregar_tiempo_3 = new javax.swing.JButton();
        btn_parar_3 = new javax.swing.JButton();
        btn_iniciar_pausar_3 = new javax.swing.JToggleButton();
        txt_tiempo_total_3 = new javax.swing.JLabel();
        txt_tiempo_agregado_3 = new javax.swing.JLabel();
        box_minutos_3 = new javax.swing.JComboBox<>();
        box_horas_3 = new javax.swing.JComboBox<>();
        box_clientes_3 = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_3 = new javax.swing.JLabel();
        btn_on_off_3 = new javax.swing.JToggleButton();
        txt_id_sesion_3 = new javax.swing.JLabel();
        contenedor_3 = new javax.swing.JLabel();
        txt_parar_4 = new javax.swing.JLabel();
        txt_iniciar_pausar_4 = new javax.swing.JLabel();
        txt_H_M_S_4 = new javax.swing.JLabel();
        txt_tiempo_4 = new javax.swing.JLabel();
        txt_agregar_tiempo_4 = new javax.swing.JLabel();
        btn_agregar_tiempo_4 = new javax.swing.JButton();
        btn_parar_4 = new javax.swing.JButton();
        btn_iniciar_pausar_4 = new javax.swing.JToggleButton();
        txt_tiempo_total_4 = new javax.swing.JLabel();
        txt_tiempo_agregado_4 = new javax.swing.JLabel();
        box_minutos_4 = new javax.swing.JComboBox<>();
        box_horas_4 = new javax.swing.JComboBox<>();
        box_clientes_4 = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_4 = new javax.swing.JLabel();
        btn_on_off_4 = new javax.swing.JToggleButton();
        txt_id_sesion_4 = new javax.swing.JLabel();
        contenedor_4 = new javax.swing.JLabel();
        txt_parar_5 = new javax.swing.JLabel();
        txt_iniciar_pausar_5 = new javax.swing.JLabel();
        txt_H_M_S_5 = new javax.swing.JLabel();
        txt_tiempo_5 = new javax.swing.JLabel();
        txt_agregar_tiempo_5 = new javax.swing.JLabel();
        btn_agregar_tiempo_5 = new javax.swing.JButton();
        btn_parar_5 = new javax.swing.JButton();
        btn_iniciar_pausar_5 = new javax.swing.JToggleButton();
        txt_tiempo_total_5 = new javax.swing.JLabel();
        txt_tiempo_agregado_5 = new javax.swing.JLabel();
        box_minutos_5 = new javax.swing.JComboBox<>();
        box_horas_5 = new javax.swing.JComboBox<>();
        box_clientes_5 = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_5 = new javax.swing.JLabel();
        btn_on_off_5 = new javax.swing.JToggleButton();
        txt_id_sesion_5 = new javax.swing.JLabel();
        contenedor_5 = new javax.swing.JLabel();
        txt_parar_6 = new javax.swing.JLabel();
        txt_iniciar_pausar_6 = new javax.swing.JLabel();
        txt_H_M_S_6 = new javax.swing.JLabel();
        txt_tiempo_6 = new javax.swing.JLabel();
        txt_agregar_tiempo_6 = new javax.swing.JLabel();
        btn_agregar_tiempo_6 = new javax.swing.JButton();
        btn_parar_6 = new javax.swing.JButton();
        btn_iniciar_pausar_6 = new javax.swing.JToggleButton();
        txt_tiempo_total_6 = new javax.swing.JLabel();
        txt_tiempo_agregado_6 = new javax.swing.JLabel();
        box_minutos_6 = new javax.swing.JComboBox<>();
        box_horas_6 = new javax.swing.JComboBox<>();
        box_clientes_6 = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_6 = new javax.swing.JLabel();
        btn_on_off_6 = new javax.swing.JToggleButton();
        txt_id_sesion_6 = new javax.swing.JLabel();
        contenedor_6 = new javax.swing.JLabel();
        txt_parar_7 = new javax.swing.JLabel();
        txt_iniciar_pausar_7 = new javax.swing.JLabel();
        txt_H_M_S_7 = new javax.swing.JLabel();
        txt_tiempo_7 = new javax.swing.JLabel();
        txt_agregar_tiempo_7 = new javax.swing.JLabel();
        btn_agregar_tiempo_7 = new javax.swing.JButton();
        btn_parar_7 = new javax.swing.JButton();
        btn_iniciar_pausar_7 = new javax.swing.JToggleButton();
        txt_tiempo_total_7 = new javax.swing.JLabel();
        txt_tiempo_agregado_7 = new javax.swing.JLabel();
        box_minutos_7 = new javax.swing.JComboBox<>();
        box_horas_7 = new javax.swing.JComboBox<>();
        box_clientes_7 = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_7 = new javax.swing.JLabel();
        btn_on_off_7 = new javax.swing.JToggleButton();
        txt_id_sesion_7 = new javax.swing.JLabel();
        contenedor_7 = new javax.swing.JLabel();
        txt_parar_8 = new javax.swing.JLabel();
        txt_iniciar_pausar_8 = new javax.swing.JLabel();
        txt_H_M_S_8 = new javax.swing.JLabel();
        txt_tiempo_8 = new javax.swing.JLabel();
        txt_agregar_tiempo_8 = new javax.swing.JLabel();
        btn_agregar_tiempo_8 = new javax.swing.JButton();
        btn_parar_8 = new javax.swing.JButton();
        btn_iniciar_pausar_8 = new javax.swing.JToggleButton();
        txt_tiempo_total_8 = new javax.swing.JLabel();
        txt_tiempo_agregado_8 = new javax.swing.JLabel();
        box_minutos_8 = new javax.swing.JComboBox<>();
        box_horas_8 = new javax.swing.JComboBox<>();
        box_clientes_8 = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_8 = new javax.swing.JLabel();
        btn_on_off_8 = new javax.swing.JToggleButton();
        txt_id_sesion_8 = new javax.swing.JLabel();
        contenedor_8 = new javax.swing.JLabel();
        btn_recargar = new javax.swing.JButton();
        txt_creditos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(239, 233, 233));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_fecha.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txt_fecha.setForeground(new java.awt.Color(102, 102, 102));
        fondo.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 20));

        titulo_sistema.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        titulo_sistema.setText("Sistema de control clientes");
        fondo.add(titulo_sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 67));

        btn_agregar_cliente_nuevo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        btn_agregar_cliente_nuevo.setForeground(new java.awt.Color(88, 69, 69));
        btn_agregar_cliente_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar_cliente_nuevo.setText("Agregar cliente nuevo");
        btn_agregar_cliente_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_cliente_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_cliente_nuevoMouseClicked(evt);
            }
        });
        fondo.add(btn_agregar_cliente_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 180, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setDoubleBuffered(true);

        jPanel2.setBackground(new java.awt.Color(239, 233, 233));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_parar_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_1.setText("Parar");
        jPanel2.add(txt_parar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 40, 20));

        txt_iniciar_pausar_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_1.setText("Iniciar");
        jPanel2.add(txt_iniciar_pausar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, 20));

        txt_H_M_S_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_1.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_1.setText("H        M        S");
        jPanel2.add(txt_H_M_S_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 120, 20));

        txt_tiempo_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_1.setText("00 : 00 : 00");
        jPanel2.add(txt_tiempo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 120, 20));

        txt_agregar_tiempo_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_1.setText("Agregar tiempo");
        jPanel2.add(txt_agregar_tiempo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 130, -1));

        btn_agregar_tiempo_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_1.setContentAreaFilled(false);
        btn_agregar_tiempo_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_1MouseClicked(evt);
            }
        });
        jPanel2.add(btn_agregar_tiempo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 60, 60));

        btn_parar_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_1.setContentAreaFilled(false);
        btn_parar_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_1MouseClicked(evt);
            }
        });
        jPanel2.add(btn_parar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 65, 60));

        btn_iniciar_pausar_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_1.setToolTipText("");
        btn_iniciar_pausar_1.setContentAreaFilled(false);
        btn_iniciar_pausar_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_1MouseClicked(evt);
            }
        });
        jPanel2.add(btn_iniciar_pausar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 65, 60));

        txt_tiempo_total_1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_total_1.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_total_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_total_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 200, 20));

        txt_tiempo_agregado_1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado_1.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_agregado_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 230, 20));

        box_minutos_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_1.setFocusable(false);
        box_minutos_1.setRequestFocusEnabled(false);
        box_minutos_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_1ActionPerformed(evt);
            }
        });
        jPanel2.add(box_minutos_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 90, 30));

        box_horas_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_1.setFocusable(false);
        box_horas_1.setRequestFocusEnabled(false);
        box_horas_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box_horas_1MouseClicked(evt);
            }
        });
        box_horas_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_1ActionPerformed(evt);
            }
        });
        jPanel2.add(box_horas_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 70, 30));

        box_clientes_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes_1.setFocusable(false);
        box_clientes_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientes_1ActionPerformed(evt);
            }
        });
        jPanel2.add(box_clientes_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 140, 30));

        txt_ingresar_tiempo_1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_1.setText("Ingresar tiempo");
        jPanel2.add(txt_ingresar_tiempo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        btn_on_off_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_1.setContentAreaFilled(false);
        btn_on_off_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_1MouseClicked(evt);
            }
        });
        jPanel2.add(btn_on_off_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 45, 25));

        txt_id_sesion_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion_1.setText("1");
        jPanel2.add(txt_id_sesion_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 20, 30));

        contenedor_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        jPanel2.add(contenedor_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 135));

        txt_parar_2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_2.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_2.setText("Parar");
        jPanel2.add(txt_parar_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 40, 20));

        txt_iniciar_pausar_2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_2.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_2.setText("Iniciar");
        jPanel2.add(txt_iniciar_pausar_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 100, 20));

        txt_H_M_S_2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_2.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_2.setText("H        M        S");
        jPanel2.add(txt_H_M_S_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 120, 20));

        txt_tiempo_2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_2.setText("00 : 00 : 00");
        jPanel2.add(txt_tiempo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 120, 20));

        txt_agregar_tiempo_2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_2.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_2.setText("Agregar tiempo");
        jPanel2.add(txt_agregar_tiempo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 130, -1));

        btn_agregar_tiempo_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_2.setContentAreaFilled(false);
        btn_agregar_tiempo_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_2MouseClicked(evt);
            }
        });
        jPanel2.add(btn_agregar_tiempo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 60, 60));

        btn_parar_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_2.setContentAreaFilled(false);
        btn_parar_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_2MouseClicked(evt);
            }
        });
        jPanel2.add(btn_parar_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 65, 60));

        btn_iniciar_pausar_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_2.setToolTipText("");
        btn_iniciar_pausar_2.setContentAreaFilled(false);
        btn_iniciar_pausar_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_2MouseEntered(evt);
            }
        });
        jPanel2.add(btn_iniciar_pausar_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 65, 60));

        txt_tiempo_total_2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_total_2.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_total_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_total_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 20));

        txt_tiempo_agregado_2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado_2.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_agregado_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 230, 20));

        box_minutos_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_2.setFocusable(false);
        box_minutos_2.setRequestFocusEnabled(false);
        box_minutos_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_2ActionPerformed(evt);
            }
        });
        jPanel2.add(box_minutos_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 90, 30));

        box_horas_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_2.setFocusable(false);
        box_horas_2.setRequestFocusEnabled(false);
        box_horas_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_2ActionPerformed(evt);
            }
        });
        jPanel2.add(box_horas_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 70, 30));

        box_clientes_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes_2.setFocusable(false);
        box_clientes_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientes_2ActionPerformed(evt);
            }
        });
        jPanel2.add(box_clientes_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 30));

        txt_ingresar_tiempo_2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_2.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_2.setText("Ingresar tiempo");
        jPanel2.add(txt_ingresar_tiempo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        btn_on_off_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_2.setContentAreaFilled(false);
        btn_on_off_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_2MouseClicked(evt);
            }
        });
        jPanel2.add(btn_on_off_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 45, 25));

        txt_id_sesion_2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion_2.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion_2.setText("2");
        jPanel2.add(txt_id_sesion_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 20, 30));

        contenedor_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        jPanel2.add(contenedor_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 850, 135));

        txt_parar_3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_3.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_3.setText("Parar");
        jPanel2.add(txt_parar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 40, 20));

        txt_iniciar_pausar_3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_3.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_3.setText("Iniciar");
        jPanel2.add(txt_iniciar_pausar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 100, 20));

        txt_H_M_S_3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_3.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_3.setText("H        M        S");
        jPanel2.add(txt_H_M_S_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 120, 20));

        txt_tiempo_3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_3.setText("00 : 00 : 00");
        jPanel2.add(txt_tiempo_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 120, 20));

        txt_agregar_tiempo_3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_3.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_3.setText("Agregar tiempo");
        jPanel2.add(txt_agregar_tiempo_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 130, -1));

        btn_agregar_tiempo_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_3.setContentAreaFilled(false);
        btn_agregar_tiempo_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_3MouseClicked(evt);
            }
        });
        jPanel2.add(btn_agregar_tiempo_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 60, 60));

        btn_parar_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_3.setContentAreaFilled(false);
        btn_parar_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_3MouseClicked(evt);
            }
        });
        jPanel2.add(btn_parar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 65, 60));

        btn_iniciar_pausar_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_3.setToolTipText("");
        btn_iniciar_pausar_3.setContentAreaFilled(false);
        btn_iniciar_pausar_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_3MouseClicked(evt);
            }
        });
        jPanel2.add(btn_iniciar_pausar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 65, 60));

        txt_tiempo_total_3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_total_3.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_total_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_total_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 200, 20));

        txt_tiempo_agregado_3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado_3.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_agregado_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 230, 20));

        box_minutos_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_3.setFocusable(false);
        box_minutos_3.setRequestFocusEnabled(false);
        box_minutos_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_3ActionPerformed(evt);
            }
        });
        jPanel2.add(box_minutos_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 90, 30));

        box_horas_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_3.setFocusable(false);
        box_horas_3.setRequestFocusEnabled(false);
        box_horas_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_3ActionPerformed(evt);
            }
        });
        jPanel2.add(box_horas_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 70, 30));

        box_clientes_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes_3.setFocusable(false);
        box_clientes_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientes_3ActionPerformed(evt);
            }
        });
        jPanel2.add(box_clientes_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 140, 30));

        txt_ingresar_tiempo_3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_3.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_3.setText("Ingresar tiempo");
        jPanel2.add(txt_ingresar_tiempo_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        btn_on_off_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_3.setContentAreaFilled(false);
        btn_on_off_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_3MouseClicked(evt);
            }
        });
        jPanel2.add(btn_on_off_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 45, 25));

        txt_id_sesion_3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion_3.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion_3.setText("3");
        jPanel2.add(txt_id_sesion_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 20, 30));

        contenedor_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        jPanel2.add(contenedor_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 850, 135));

        txt_parar_4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_4.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_4.setText("Parar");
        jPanel2.add(txt_parar_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 40, 20));

        txt_iniciar_pausar_4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_4.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_4.setText("Iniciar");
        jPanel2.add(txt_iniciar_pausar_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 100, 20));

        txt_H_M_S_4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_4.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_4.setText("H        M        S");
        jPanel2.add(txt_H_M_S_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 120, 20));

        txt_tiempo_4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_4.setText("00 : 00 : 00");
        jPanel2.add(txt_tiempo_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 120, 20));

        txt_agregar_tiempo_4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_4.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_4.setText("Agregar tiempo");
        jPanel2.add(txt_agregar_tiempo_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 130, -1));

        btn_agregar_tiempo_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_4.setContentAreaFilled(false);
        btn_agregar_tiempo_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_4MouseClicked(evt);
            }
        });
        jPanel2.add(btn_agregar_tiempo_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 60, 60));

        btn_parar_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_4.setContentAreaFilled(false);
        btn_parar_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_4MouseClicked(evt);
            }
        });
        jPanel2.add(btn_parar_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 65, 60));

        btn_iniciar_pausar_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_4.setToolTipText("");
        btn_iniciar_pausar_4.setContentAreaFilled(false);
        btn_iniciar_pausar_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_4MouseClicked(evt);
            }
        });
        jPanel2.add(btn_iniciar_pausar_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 65, 60));

        txt_tiempo_total_4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_total_4.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_total_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_total_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 200, 20));

        txt_tiempo_agregado_4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado_4.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_agregado_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 230, 20));

        box_minutos_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_4.setFocusable(false);
        box_minutos_4.setRequestFocusEnabled(false);
        box_minutos_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_4ActionPerformed(evt);
            }
        });
        jPanel2.add(box_minutos_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 90, 30));

        box_horas_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_4.setFocusable(false);
        box_horas_4.setRequestFocusEnabled(false);
        box_horas_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_4ActionPerformed(evt);
            }
        });
        jPanel2.add(box_horas_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 70, 30));

        box_clientes_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes_4.setFocusable(false);
        box_clientes_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientes_4ActionPerformed(evt);
            }
        });
        jPanel2.add(box_clientes_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, 30));

        txt_ingresar_tiempo_4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_4.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_4.setText("Ingresar tiempo");
        jPanel2.add(txt_ingresar_tiempo_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        btn_on_off_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_4.setContentAreaFilled(false);
        btn_on_off_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_4MouseClicked(evt);
            }
        });
        jPanel2.add(btn_on_off_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 45, 25));

        txt_id_sesion_4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion_4.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion_4.setText("4");
        jPanel2.add(txt_id_sesion_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 20, 30));

        contenedor_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        jPanel2.add(contenedor_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 850, 135));

        txt_parar_5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_5.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_5.setText("Parar");
        jPanel2.add(txt_parar_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 700, 40, 20));

        txt_iniciar_pausar_5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_5.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_5.setText("Iniciar");
        jPanel2.add(txt_iniciar_pausar_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 100, 20));

        txt_H_M_S_5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_5.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_5.setText("H        M        S");
        jPanel2.add(txt_H_M_S_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, 120, 20));

        txt_tiempo_5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_5.setText("00 : 00 : 00");
        jPanel2.add(txt_tiempo_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, 120, 20));

        txt_agregar_tiempo_5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_5.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_5.setText("Agregar tiempo");
        jPanel2.add(txt_agregar_tiempo_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 700, 130, -1));

        btn_agregar_tiempo_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_5.setContentAreaFilled(false);
        btn_agregar_tiempo_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_5MouseClicked(evt);
            }
        });
        jPanel2.add(btn_agregar_tiempo_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 640, 60, 60));

        btn_parar_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_5.setContentAreaFilled(false);
        btn_parar_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_5MouseClicked(evt);
            }
        });
        jPanel2.add(btn_parar_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 65, 60));

        btn_iniciar_pausar_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_5.setToolTipText("");
        btn_iniciar_pausar_5.setContentAreaFilled(false);
        btn_iniciar_pausar_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_5MouseEntered(evt);
            }
        });
        jPanel2.add(btn_iniciar_pausar_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 65, 60));

        txt_tiempo_total_5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_total_5.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_total_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_total_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 710, 200, 20));

        txt_tiempo_agregado_5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado_5.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_agregado_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 230, 20));

        box_minutos_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_5.setFocusable(false);
        box_minutos_5.setRequestFocusEnabled(false);
        box_minutos_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_5ActionPerformed(evt);
            }
        });
        jPanel2.add(box_minutos_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 90, 30));

        box_horas_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_5.setFocusable(false);
        box_horas_5.setRequestFocusEnabled(false);
        box_horas_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_5ActionPerformed(evt);
            }
        });
        jPanel2.add(box_horas_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, 70, 30));

        box_clientes_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes_5.setFocusable(false);
        box_clientes_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientes_5ActionPerformed(evt);
            }
        });
        jPanel2.add(box_clientes_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 140, 30));

        txt_ingresar_tiempo_5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_5.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_5.setText("Ingresar tiempo");
        jPanel2.add(txt_ingresar_tiempo_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, -1, -1));

        btn_on_off_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_5.setContentAreaFilled(false);
        btn_on_off_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_5MouseClicked(evt);
            }
        });
        jPanel2.add(btn_on_off_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 45, 25));

        txt_id_sesion_5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion_5.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion_5.setText("5");
        jPanel2.add(txt_id_sesion_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 20, 30));

        contenedor_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        jPanel2.add(contenedor_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 850, 135));

        txt_parar_6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_6.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_6.setText("Parar");
        jPanel2.add(txt_parar_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 860, 40, 20));

        txt_iniciar_pausar_6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_6.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_6.setText("Iniciar");
        jPanel2.add(txt_iniciar_pausar_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 860, 100, 20));

        txt_H_M_S_6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_6.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_6.setText("H        M        S");
        jPanel2.add(txt_H_M_S_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 810, 120, 20));

        txt_tiempo_6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_6.setText("00 : 00 : 00");
        jPanel2.add(txt_tiempo_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 840, 120, 20));

        txt_agregar_tiempo_6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_6.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_6.setText("Agregar tiempo");
        jPanel2.add(txt_agregar_tiempo_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 860, 130, -1));

        btn_agregar_tiempo_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_6.setContentAreaFilled(false);
        btn_agregar_tiempo_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_6MouseClicked(evt);
            }
        });
        jPanel2.add(btn_agregar_tiempo_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 800, 60, 60));

        btn_parar_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_6.setContentAreaFilled(false);
        btn_parar_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_6MouseClicked(evt);
            }
        });
        jPanel2.add(btn_parar_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, 65, 60));

        btn_iniciar_pausar_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_6.setToolTipText("");
        btn_iniciar_pausar_6.setContentAreaFilled(false);
        btn_iniciar_pausar_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_6MouseClicked(evt);
            }
        });
        jPanel2.add(btn_iniciar_pausar_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 800, 65, 60));

        txt_tiempo_total_6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_total_6.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_total_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_total_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 870, 200, 20));

        txt_tiempo_agregado_6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado_6.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_agregado_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 780, 230, 20));

        box_minutos_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_6.setFocusable(false);
        box_minutos_6.setRequestFocusEnabled(false);
        box_minutos_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_6ActionPerformed(evt);
            }
        });
        jPanel2.add(box_minutos_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 830, 90, 30));

        box_horas_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_6.setFocusable(false);
        box_horas_6.setRequestFocusEnabled(false);
        box_horas_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_6ActionPerformed(evt);
            }
        });
        jPanel2.add(box_horas_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 830, 70, 30));

        box_clientes_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes_6.setFocusable(false);
        box_clientes_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientes_6ActionPerformed(evt);
            }
        });
        jPanel2.add(box_clientes_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 830, 140, 30));

        txt_ingresar_tiempo_6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_6.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_6.setText("Ingresar tiempo");
        jPanel2.add(txt_ingresar_tiempo_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 790, -1, -1));

        btn_on_off_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_6.setContentAreaFilled(false);
        btn_on_off_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_6MouseClicked(evt);
            }
        });
        jPanel2.add(btn_on_off_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 790, 45, 25));

        txt_id_sesion_6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion_6.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion_6.setText("6");
        jPanel2.add(txt_id_sesion_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 20, 30));

        contenedor_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        jPanel2.add(contenedor_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 850, 135));

        txt_parar_7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_7.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_7.setText("Parar");
        jPanel2.add(txt_parar_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1010, 40, 20));

        txt_iniciar_pausar_7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_7.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_7.setText("Iniciar");
        jPanel2.add(txt_iniciar_pausar_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1010, 100, 20));

        txt_H_M_S_7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_7.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_7.setText("H        M        S");
        jPanel2.add(txt_H_M_S_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 960, 120, 20));

        txt_tiempo_7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_7.setText("00 : 00 : 00");
        jPanel2.add(txt_tiempo_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 990, 120, 20));

        txt_agregar_tiempo_7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_7.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_7.setText("Agregar tiempo");
        jPanel2.add(txt_agregar_tiempo_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 1010, 130, -1));

        btn_agregar_tiempo_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_7.setContentAreaFilled(false);
        btn_agregar_tiempo_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_7MouseClicked(evt);
            }
        });
        jPanel2.add(btn_agregar_tiempo_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 950, 60, 60));

        btn_parar_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_7.setContentAreaFilled(false);
        btn_parar_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_7MouseClicked(evt);
            }
        });
        jPanel2.add(btn_parar_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 950, 65, 60));

        btn_iniciar_pausar_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_7.setToolTipText("");
        btn_iniciar_pausar_7.setContentAreaFilled(false);
        btn_iniciar_pausar_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_7MouseClicked(evt);
            }
        });
        jPanel2.add(btn_iniciar_pausar_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 950, 65, 60));

        txt_tiempo_total_7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_total_7.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_total_7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_total_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1020, 200, 20));

        txt_tiempo_agregado_7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado_7.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado_7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_agregado_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 930, 230, 20));

        box_minutos_7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_7.setFocusable(false);
        box_minutos_7.setRequestFocusEnabled(false);
        box_minutos_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_7ActionPerformed(evt);
            }
        });
        jPanel2.add(box_minutos_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 980, 90, 30));

        box_horas_7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_7.setFocusable(false);
        box_horas_7.setRequestFocusEnabled(false);
        box_horas_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_7ActionPerformed(evt);
            }
        });
        jPanel2.add(box_horas_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 980, 70, 30));

        box_clientes_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes_7.setFocusable(false);
        box_clientes_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientes_7ActionPerformed(evt);
            }
        });
        jPanel2.add(box_clientes_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 980, 140, 30));

        txt_ingresar_tiempo_7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_7.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_7.setText("Ingresar tiempo");
        jPanel2.add(txt_ingresar_tiempo_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 940, -1, -1));

        btn_on_off_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_7.setContentAreaFilled(false);
        btn_on_off_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_7MouseClicked(evt);
            }
        });
        jPanel2.add(btn_on_off_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 940, 45, 25));

        txt_id_sesion_7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion_7.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion_7.setText("7");
        jPanel2.add(txt_id_sesion_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 20, 30));

        contenedor_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        jPanel2.add(contenedor_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 920, 850, 135));

        txt_parar_8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_8.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_8.setText("Parar");
        jPanel2.add(txt_parar_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1160, 40, 20));

        txt_iniciar_pausar_8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_8.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_8.setText("Iniciar");
        jPanel2.add(txt_iniciar_pausar_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1160, 100, 20));

        txt_H_M_S_8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_8.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_8.setText("H        M        S");
        jPanel2.add(txt_H_M_S_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 1110, 120, 20));

        txt_tiempo_8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_8.setText("00 : 00 : 00");
        jPanel2.add(txt_tiempo_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 1140, 120, 20));

        txt_agregar_tiempo_8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_8.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_8.setText("Agregar tiempo");
        jPanel2.add(txt_agregar_tiempo_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 1160, 130, -1));

        btn_agregar_tiempo_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_8.setContentAreaFilled(false);
        btn_agregar_tiempo_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_8MouseClicked(evt);
            }
        });
        jPanel2.add(btn_agregar_tiempo_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1100, 60, 60));

        btn_parar_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_8.setContentAreaFilled(false);
        btn_parar_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_8MouseClicked(evt);
            }
        });
        jPanel2.add(btn_parar_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1100, 65, 60));

        btn_iniciar_pausar_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_8.setToolTipText("");
        btn_iniciar_pausar_8.setContentAreaFilled(false);
        btn_iniciar_pausar_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_8MouseClicked(evt);
            }
        });
        jPanel2.add(btn_iniciar_pausar_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1100, 65, 60));

        txt_tiempo_total_8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_total_8.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_total_8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_total_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1170, 200, 20));

        txt_tiempo_agregado_8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado_8.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado_8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(txt_tiempo_agregado_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1080, 230, 20));

        box_minutos_8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_8.setFocusable(false);
        box_minutos_8.setRequestFocusEnabled(false);
        box_minutos_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_8ActionPerformed(evt);
            }
        });
        jPanel2.add(box_minutos_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1130, 90, 30));

        box_horas_8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_8.setFocusable(false);
        box_horas_8.setRequestFocusEnabled(false);
        box_horas_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_8ActionPerformed(evt);
            }
        });
        jPanel2.add(box_horas_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1130, 70, 30));

        box_clientes_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes_8.setFocusable(false);
        box_clientes_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientes_8ActionPerformed(evt);
            }
        });
        jPanel2.add(box_clientes_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1130, 140, 30));

        txt_ingresar_tiempo_8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_8.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_8.setText("Ingresar tiempo");
        jPanel2.add(txt_ingresar_tiempo_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1090, -1, -1));

        btn_on_off_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_8.setContentAreaFilled(false);
        btn_on_off_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_8MouseClicked(evt);
            }
        });
        jPanel2.add(btn_on_off_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1090, 45, 25));

        txt_id_sesion_8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion_8.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion_8.setText("8");
        jPanel2.add(txt_id_sesion_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1130, 20, 30));

        contenedor_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        jPanel2.add(contenedor_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1070, 850, 135));

        jScrollPane1.setViewportView(jPanel2);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 870, 600));

        btn_recargar.setText("Recargar");
        btn_recargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_recargarMouseClicked(evt);
            }
        });
        fondo.add(btn_recargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txt_creditos.setForeground(new java.awt.Color(153, 153, 153));
        txt_creditos.setText("Elaborado por: Ubaldo S.J");
        fondo.add(txt_creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 730, 140, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 1380));
        fondo.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Componentes del grupo 1
    private void btn_on_off_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_1MouseClicked
        procesoBotonOn_Off(btn_on_off_1, contenedor_1, box_clientes_1, box_horas_1, box_minutos_1, txt_ingresar_tiempo_1, btn_iniciar_pausar_1, txt_iniciar_pausar_1, btn_parar_1, txt_parar_1, txt_H_M_S_1, txt_tiempo_1, btn_agregar_tiempo_1, txt_agregar_tiempo_1, hora_1, minuto_1, segundo_1);

    }//GEN-LAST:event_btn_on_off_1MouseClicked

    public void habilitarComponentesPorGrupo(JComboBox box_clientes, JComboBox box_horas, JComboBox box_minutos, JLabel txt_ingresar_tiempo, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JButton btn_parar, JLabel txt_parar, JLabel txt_H_M_S, JLabel txt_tiempo, JButton btn_agregar_tiempo, JLabel txt_agregar_tiempo) {
        //Habilitamos todos los componentes del grupo 1
        box_clientes.setEnabled(true);
        box_horas.setEnabled(true);
        box_minutos.setEnabled(true);
        txt_ingresar_tiempo.setEnabled(true);
        btn_iniciar_pausar.setEnabled(true);
        txt_iniciar_pausar.setEnabled(true);
        btn_parar.setEnabled(true);
        txt_parar.setEnabled(true);
        txt_H_M_S.setEnabled(true);
        txt_tiempo.setEnabled(true);
        btn_agregar_tiempo.setEnabled(true);
        txt_agregar_tiempo.setEnabled(true);
    }

    public void deshabilitarComponentesPorGrupo(JComboBox box_clientes, JComboBox box_horas, JComboBox box_minutos, JLabel txt_ingresar_tiempo, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JButton btn_parar, JLabel txt_parar, JLabel txt_H_M_S, JLabel txt_tiempo, JButton btn_agregar_tiempo, JLabel txt_agregar_tiempo) {
        //Deshabilitamos todos los componentes del grupo 2
        box_clientes.setEnabled(false);
        box_horas.setEnabled(false);
        box_minutos.setEnabled(false);
        txt_ingresar_tiempo.setEnabled(false);
        btn_iniciar_pausar.setEnabled(false);
        txt_iniciar_pausar.setEnabled(false);
        btn_parar.setEnabled(false);
        txt_parar.setEnabled(false);
        txt_H_M_S.setEnabled(false);
        txt_tiempo.setEnabled(false);
        btn_agregar_tiempo.setEnabled(false);
        txt_agregar_tiempo.setEnabled(false);
    }


    private void btn_iniciar_pausar_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_1MouseClicked
        procesoBotonIniciarPausar(1, box_clientes_1, box_horas_1, box_minutos_1, var_btn_iniciar_pausar_1, btn_iniciar_pausar_1, txt_iniciar_pausar_1, corriendo_1, pausar_1, btn_on_off_1);
    }//GEN-LAST:event_btn_iniciar_pausar_1MouseClicked

    private void iniciarHiloCronometro_1() {
        if (iniciarHilo_1 == true) {
            System.out.println("Inicia el hilo");
            Cronometro_1 miCronometro_1 = new Cronometro_1(id_cliente_1,txt_tiempo_1, btn_iniciar_pausar_1, txt_iniciar_pausar_1, box_horas_1, box_minutos_1, txt_tiempo_agregado_1, txt_tiempo_total_1);
            miCronometro_1.start();
        }

    }

    private void iniciarHiloCronometro_2() {
        if (iniciarHilo_2 == true) {
            System.out.println("Inicia el hilo");
            Cronometro_2 miCronometro_2 = new Cronometro_2(id_cliente_2, txt_tiempo_2, btn_iniciar_pausar_2, txt_iniciar_pausar_2, box_horas_2, box_minutos_2, txt_tiempo_agregado_2, txt_tiempo_total_2);
            miCronometro_2.start();
        }

    }

    private void iniciarHiloCronometro_3() {
        if (iniciarHilo_3 == true) {
            System.out.println("Inicia el hilo");
            Cronometro_3 miCronometro_3 = new Cronometro_3(id_cliente_3, txt_tiempo_3, btn_iniciar_pausar_3, txt_iniciar_pausar_3, box_horas_3, box_minutos_3, txt_tiempo_agregado_3, txt_tiempo_total_3);
            miCronometro_3.start();
        }
    }

    private void iniciarHiloCronometro_4() {
        if (iniciarHilo_4 == true) {
            System.out.println("Inicia el hilo");
            Cronometro_4 miCronometro_4 = new Cronometro_4(id_cliente_4, txt_tiempo_4, btn_iniciar_pausar_4, txt_iniciar_pausar_4, box_horas_4, box_minutos_4, txt_tiempo_agregado_4, txt_tiempo_total_4);
            miCronometro_4.start();
        }
    }

    private void iniciarHiloCronometro_5() {
        if (iniciarHilo_5 == true) {
            System.out.println("Inicia el hilo");
            Cronometro_5 miCronometro_5 = new Cronometro_5(id_cliente_5, txt_tiempo_5, btn_iniciar_pausar_5, txt_iniciar_pausar_5, box_horas_5, box_minutos_5, txt_tiempo_agregado_5, txt_tiempo_total_5);
            miCronometro_5.start();
        }
    }

    private void iniciarHiloCronometro_6() {
        if (iniciarHilo_6 == true) {
            System.out.println("Inicia el hilo");
            Cronometro_6 miCronometro_6 = new Cronometro_6(id_cliente_6, txt_tiempo_6, btn_iniciar_pausar_6, txt_iniciar_pausar_6, box_horas_6, box_minutos_6, txt_tiempo_agregado_6, txt_tiempo_total_6);
            miCronometro_6.start();
        }
    }

    private void iniciarHiloCronometro_7() {
        if (iniciarHilo_7 == true) {
            System.out.println("Inicia el hilo");
            Cronometro_7 miCronometro_7 = new Cronometro_7(id_cliente_7, txt_tiempo_7, btn_iniciar_pausar_7, txt_iniciar_pausar_7, box_horas_7, box_minutos_7, txt_tiempo_agregado_7, txt_tiempo_total_7);
            miCronometro_7.start();
        }
    }

    private void iniciarHiloCronometro_8() {
        if (iniciarHilo_8 == true) {
            System.out.println("Inicia el hilo");
            Cronometro_8 miCronometro_8 = new Cronometro_8(id_cliente_8, txt_tiempo_8, btn_iniciar_pausar_8, txt_iniciar_pausar_8, box_horas_8, box_minutos_8, txt_tiempo_agregado_8, txt_tiempo_total_8);
            miCronometro_8.start();
        }
    }


    private void btn_agregar_tiempo_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_1MouseClicked
        procesoBotonAgregarTiempo(btn_on_off_1, box_horas_1, box_minutos_1, 1, txt_tiempo_agregado_1, txt_tiempo_total_1);
    }//GEN-LAST:event_btn_agregar_tiempo_1MouseClicked

    private void btn_parar_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_1MouseClicked
        procesoBotonParar(hora_1, minuto_1, segundo_1, id_usuario, id_cliente_1, 1, txt_tiempo_1, btn_iniciar_pausar_1, txt_iniciar_pausar_1, box_horas_1, box_minutos_1, txt_tiempo_agregado_1, txt_tiempo_total_1);
    }//GEN-LAST:event_btn_parar_1MouseClicked

    private void box_horas_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_1ActionPerformed
        if (box_horas_1.getModel().getSelectedItem().equals("0")) {

            item_horas_1 = 0;

            System.out.println("itemHoras = " + item_horas_1);
        } else if (box_horas_1.getModel().getSelectedItem().equals("1")) {

            item_horas_1 = 1;

            System.out.println("itemHoras = " + item_horas_1);
        } else if (box_horas_1.getModel().getSelectedItem().equals("2")) {

            item_horas_1 = 2;

            System.out.println("itemHoras = " + item_horas_1);
        } else if (box_horas_1.getModel().getSelectedItem().equals("3")) {

            item_horas_1 = 3;

            System.out.println("itemHoras = " + item_horas_1);
        } else if (box_horas_1.getModel().getSelectedItem().equals("4")) {

            item_horas_1 = 4;

            System.out.println("itemHoras = " + item_horas_1);
        } else if (box_horas_1.getModel().getSelectedItem().equals("5")) {

            item_horas_1 = 5;

            System.out.println("itemHoras = " + item_horas_1);
        }

    }//GEN-LAST:event_box_horas_1ActionPerformed

    private void box_minutos_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_1ActionPerformed
        if (box_minutos_1.getModel().getSelectedItem() == "0") {
            item_minutos_1 = 0;
            System.out.println("itemMinutos = " + item_minutos_1);
        } else if (box_minutos_1.getModel().getSelectedItem() == "30") {
            item_minutos_1 = 30;
            System.out.println("itemMinutos = " + item_minutos_1);
        }
    }//GEN-LAST:event_box_minutos_1ActionPerformed

    private void box_clientes_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientes_1ActionPerformed

        id_cliente_1 = box_clientes_1.getItemAt(box_clientes_1.getSelectedIndex()).getId();
        System.out.println("Id: " + id_cliente_1);
    }//GEN-LAST:event_box_clientes_1ActionPerformed
    
    public int getIdCliente_1(){
        return id_cliente_1;
    } 
            
    private void btn_agregar_cliente_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_cliente_nuevoMouseClicked
        agregarCliente1.setVisible(true);

        if (agregarCliente1.isShowing()) {
            System.out.println("Está mostrado");
        }

    }//GEN-LAST:event_btn_agregar_cliente_nuevoMouseClicked

    // Componentes del grupo 2    
    private void btn_agregar_tiempo_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_2MouseClicked
        procesoBotonAgregarTiempo(btn_on_off_2, box_horas_2, box_minutos_2, 2, txt_tiempo_agregado_2, txt_tiempo_total_2);
    }//GEN-LAST:event_btn_agregar_tiempo_2MouseClicked

    private void btn_parar_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_2MouseClicked
        procesoBotonParar(hora_2, minuto_2, segundo_2, id_usuario, id_cliente_2,2, txt_tiempo_2, btn_iniciar_pausar_2, txt_iniciar_pausar_2, box_horas_2, box_minutos_2, txt_tiempo_agregado_2, txt_tiempo_total_2);
    }//GEN-LAST:event_btn_parar_2MouseClicked

    private void btn_iniciar_pausar_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_2MouseClicked
        procesoBotonIniciarPausar(2, box_clientes_2, box_horas_2, box_minutos_2, var_btn_iniciar_pausar_2, btn_iniciar_pausar_2, txt_iniciar_pausar_2, corriendo_2, pausar_2, btn_on_off_2);
    }//GEN-LAST:event_btn_iniciar_pausar_2MouseClicked

    private void box_minutos_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_2ActionPerformed
        if (box_minutos_2.getModel().getSelectedItem() == "0") {
            item_minutos_2 = 0;
            System.out.println("itemMinutos = " + item_minutos_2);
        } else if (box_minutos_2.getModel().getSelectedItem() == "30") {
            item_minutos_2 = 30;
            System.out.println("itemMinutos = " + item_minutos_2);
        }
    }//GEN-LAST:event_box_minutos_2ActionPerformed

    private void box_horas_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_2ActionPerformed
        if (box_horas_2.getModel().getSelectedItem().equals("0")) {

            item_horas_2 = 0;

            System.out.println("itemHoras = " + item_horas_2);
        } else if (box_horas_2.getModel().getSelectedItem().equals("1")) {

            item_horas_2 = 1;

            System.out.println("itemHoras = " + item_horas_2);
        } else if (box_horas_2.getModel().getSelectedItem().equals("2")) {

            item_horas_2 = 2;

            System.out.println("itemHoras = " + item_horas_2);
        } else if (box_horas_2.getModel().getSelectedItem().equals("3")) {

            item_horas_2 = 3;

            System.out.println("itemHoras = " + item_horas_2);
        } else if (box_horas_2.getModel().getSelectedItem().equals("4")) {

            item_horas_2 = 4;

            System.out.println("itemHoras = " + item_horas_2);
        } else if (box_horas_2.getModel().getSelectedItem().equals("5")) {

            item_horas_2 = 5;

            System.out.println("itemHoras = " + item_horas_2);
        }
    }//GEN-LAST:event_box_horas_2ActionPerformed

    private void box_clientes_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientes_2ActionPerformed
//        item_clientes_2 = (String) box_clientes_2.getModel().getSelectedItem();
//        System.out.println(item_clientes_2);
        System.out.println(box_clientes_2.getModel().getSelectedItem());
        id_cliente_2 = box_clientes_2.getItemAt(box_clientes_2.getSelectedIndex()).getId();
        System.out.println("Id: " + id_cliente_2);
    }//GEN-LAST:event_box_clientes_2ActionPerformed

    private void btn_on_off_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_2MouseClicked
        procesoBotonOn_Off(btn_on_off_2, contenedor_2, box_clientes_2, box_horas_2, box_minutos_2, txt_ingresar_tiempo_2, btn_iniciar_pausar_2, txt_iniciar_pausar_2, btn_parar_2, txt_parar_2, txt_H_M_S_2, txt_tiempo_2, btn_agregar_tiempo_2, txt_agregar_tiempo_2, hora_2, minuto_2, segundo_2);
    }//GEN-LAST:event_btn_on_off_2MouseClicked

    // Componentes del grupo 3
    private void btn_agregar_tiempo_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_3MouseClicked
        procesoBotonAgregarTiempo(btn_on_off_3, box_horas_3, box_minutos_3, 3, txt_tiempo_agregado_3, txt_tiempo_total_3);
    }//GEN-LAST:event_btn_agregar_tiempo_3MouseClicked

    private void btn_parar_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_3MouseClicked
        procesoBotonParar(hora_3, minuto_3, segundo_3, id_usuario, id_cliente_3, 3, txt_tiempo_3, btn_iniciar_pausar_3, txt_iniciar_pausar_3, box_horas_3, box_minutos_3, txt_tiempo_agregado_3, txt_tiempo_total_3);
    }//GEN-LAST:event_btn_parar_3MouseClicked

    private void btn_iniciar_pausar_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_3MouseClicked
        procesoBotonIniciarPausar(3, box_clientes_3, box_horas_3, box_minutos_3, var_btn_iniciar_pausar_3, btn_iniciar_pausar_3, txt_iniciar_pausar_3, corriendo_3, pausar_3, btn_on_off_3);
    }//GEN-LAST:event_btn_iniciar_pausar_3MouseClicked

    private void box_minutos_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_3ActionPerformed
        if (box_minutos_3.getModel().getSelectedItem() == "0") {
            item_minutos_3 = 0;
            System.out.println("itemMinutos = " + item_minutos_3);
        } else if (box_minutos_3.getModel().getSelectedItem() == "30") {
            item_minutos_3 = 30;
            System.out.println("itemMinutos = " + item_minutos_3);
        }
    }//GEN-LAST:event_box_minutos_3ActionPerformed

    private void box_horas_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_3ActionPerformed
        if (box_horas_3.getModel().getSelectedItem().equals("0")) {

            item_horas_3 = 0;

            System.out.println("itemHoras = " + item_horas_3);
        } else if (box_horas_3.getModel().getSelectedItem().equals("1")) {

            item_horas_3 = 1;

            System.out.println("itemHoras = " + item_horas_3);
        } else if (box_horas_3.getModel().getSelectedItem().equals("2")) {

            item_horas_3 = 2;

            System.out.println("itemHoras = " + item_horas_3);
        } else if (box_horas_3.getModel().getSelectedItem().equals("3")) {

            item_horas_3 = 3;

            System.out.println("itemHoras = " + item_horas_3);
        } else if (box_horas_3.getModel().getSelectedItem().equals("4")) {

            item_horas_3 = 4;

            System.out.println("itemHoras = " + item_horas_3);
        } else if (box_horas_3.getModel().getSelectedItem().equals("5")) {

            item_horas_3 = 5;

            System.out.println("itemHoras = " + item_horas_3);
        }
    }//GEN-LAST:event_box_horas_3ActionPerformed

    private void box_clientes_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientes_3ActionPerformed
//        item_clientes_3 = (String) box_clientes_3.getModel().getSelectedItem();
//        System.out.println(item_clientes_3);
        System.out.println(box_clientes_3.getModel().getSelectedItem());
        id_cliente_3 = box_clientes_3.getItemAt(box_clientes_3.getSelectedIndex()).getId();
        System.out.println("Id: " + id_cliente_3);
    }//GEN-LAST:event_box_clientes_3ActionPerformed

    private void btn_on_off_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_3MouseClicked
        procesoBotonOn_Off(btn_on_off_3, contenedor_3, box_clientes_3, box_horas_3, box_minutos_3, txt_ingresar_tiempo_3, btn_iniciar_pausar_3, txt_iniciar_pausar_3, btn_parar_3, txt_parar_3, txt_H_M_S_3, txt_tiempo_3, btn_agregar_tiempo_3, txt_agregar_tiempo_3, hora_3, minuto_3, segundo_3);
    }//GEN-LAST:event_btn_on_off_3MouseClicked

    // Componentes del grupo 4
    private void btn_agregar_tiempo_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_4MouseClicked
        procesoBotonAgregarTiempo(btn_on_off_4, box_horas_4, box_minutos_4, 4, txt_tiempo_agregado_4, txt_tiempo_total_4);
    }//GEN-LAST:event_btn_agregar_tiempo_4MouseClicked

    private void btn_parar_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_4MouseClicked
        procesoBotonParar(hora_4, minuto_4, segundo_4, id_usuario, id_cliente_4, 4, txt_tiempo_4, btn_iniciar_pausar_4, txt_iniciar_pausar_4, box_horas_4, box_minutos_4, txt_tiempo_agregado_4, txt_tiempo_total_4);
    }//GEN-LAST:event_btn_parar_4MouseClicked

    private void btn_iniciar_pausar_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_4MouseClicked
        procesoBotonIniciarPausar(4, box_clientes_4, box_horas_4, box_minutos_4, var_btn_iniciar_pausar_4, btn_iniciar_pausar_4, txt_iniciar_pausar_4, corriendo_4, pausar_4, btn_on_off_4);
    }//GEN-LAST:event_btn_iniciar_pausar_4MouseClicked

    private void box_minutos_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_4ActionPerformed
        if (box_minutos_4.getModel().getSelectedItem() == "0") {
            item_minutos_4 = 0;
            System.out.println("itemMinutos = " + item_minutos_4);
        } else if (box_minutos_4.getModel().getSelectedItem() == "30") {
            item_minutos_4 = 30;
            System.out.println("itemMinutos = " + item_minutos_4);
        }
    }//GEN-LAST:event_box_minutos_4ActionPerformed

    private void box_horas_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_4ActionPerformed
        if (box_horas_4.getModel().getSelectedItem().equals("0")) {

            item_horas_4 = 0;

            System.out.println("itemHoras = " + item_horas_4);
        } else if (box_horas_4.getModel().getSelectedItem().equals("1")) {

            item_horas_4 = 1;

            System.out.println("itemHoras = " + item_horas_4);
        } else if (box_horas_4.getModel().getSelectedItem().equals("2")) {

            item_horas_4 = 2;

            System.out.println("itemHoras = " + item_horas_4);
        } else if (box_horas_4.getModel().getSelectedItem().equals("3")) {

            item_horas_4 = 3;

            System.out.println("itemHoras = " + item_horas_4);
        } else if (box_horas_4.getModel().getSelectedItem().equals("4")) {

            item_horas_4 = 4;

            System.out.println("itemHoras = " + item_horas_4);
        } else if (box_horas_4.getModel().getSelectedItem().equals("5")) {

            item_horas_4 = 5;

            System.out.println("itemHoras = " + item_horas_4);
        }
    }//GEN-LAST:event_box_horas_4ActionPerformed

    private void btn_on_off_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_4MouseClicked
        procesoBotonOn_Off(btn_on_off_4, contenedor_4, box_clientes_4, box_horas_4, box_minutos_4, txt_ingresar_tiempo_4, btn_iniciar_pausar_4, txt_iniciar_pausar_4, btn_parar_4, txt_parar_4, txt_H_M_S_4, txt_tiempo_4, btn_agregar_tiempo_4, txt_agregar_tiempo_4, hora_4, minuto_4, segundo_4);
    }//GEN-LAST:event_btn_on_off_4MouseClicked

    // Componentes del grupo 5
    private void btn_agregar_tiempo_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_5MouseClicked
        procesoBotonAgregarTiempo(btn_on_off_5, box_horas_5, box_minutos_5, 5, txt_tiempo_agregado_5, txt_tiempo_total_5);
    }//GEN-LAST:event_btn_agregar_tiempo_5MouseClicked

    private void btn_parar_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_5MouseClicked
        procesoBotonParar(hora_5, minuto_5, segundo_5, id_usuario, id_cliente_5, 5, txt_tiempo_5, btn_iniciar_pausar_5, txt_iniciar_pausar_5, box_horas_5, box_minutos_5, txt_tiempo_agregado_5, txt_tiempo_total_5);
    }//GEN-LAST:event_btn_parar_5MouseClicked

    private void btn_iniciar_pausar_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_5MouseClicked
        procesoBotonIniciarPausar(5, box_clientes_5, box_horas_5, box_minutos_5, var_btn_iniciar_pausar_5, btn_iniciar_pausar_5, txt_iniciar_pausar_5, corriendo_5, pausar_5, btn_on_off_5);
    }//GEN-LAST:event_btn_iniciar_pausar_5MouseClicked

    private void box_minutos_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_5ActionPerformed
        if (box_minutos_5.getModel().getSelectedItem() == "0") {
            item_minutos_5 = 0;
            System.out.println("itemMinutos = " + item_minutos_5);
        } else if (box_minutos_5.getModel().getSelectedItem() == "30") {
            item_minutos_5 = 30;
            System.out.println("itemMinutos = " + item_minutos_5);
        }
    }//GEN-LAST:event_box_minutos_5ActionPerformed

    private void box_horas_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_5ActionPerformed
        if (box_horas_5.getModel().getSelectedItem().equals("0")) {

            item_horas_5 = 0;

            System.out.println("itemHoras = " + item_horas_5);
        } else if (box_horas_5.getModel().getSelectedItem().equals("1")) {

            item_horas_5 = 1;

            System.out.println("itemHoras = " + item_horas_5);
        } else if (box_horas_5.getModel().getSelectedItem().equals("2")) {

            item_horas_5 = 2;

            System.out.println("itemHoras = " + item_horas_5);
        } else if (box_horas_5.getModel().getSelectedItem().equals("3")) {

            item_horas_5 = 3;

            System.out.println("itemHoras = " + item_horas_5);
        } else if (box_horas_5.getModel().getSelectedItem().equals("4")) {

            item_horas_5 = 4;

            System.out.println("itemHoras = " + item_horas_5);
        } else if (box_horas_5.getModel().getSelectedItem().equals("5")) {

            item_horas_5 = 5;

            System.out.println("itemHoras = " + item_horas_5);
        }
    }//GEN-LAST:event_box_horas_5ActionPerformed

    private void box_clientes_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientes_5ActionPerformed
//        item_clientes_5 = (String) box_clientes_5.getModel().getSelectedItem();
//        System.out.println(item_clientes_5);
        System.out.println(box_clientes_5.getModel().getSelectedItem());
        id_cliente_5 = box_clientes_5.getItemAt(box_clientes_5.getSelectedIndex()).getId();
        System.out.println("Id: " + id_cliente_5);
    }//GEN-LAST:event_box_clientes_5ActionPerformed

    private void btn_on_off_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_5MouseClicked
        procesoBotonOn_Off(btn_on_off_5, contenedor_5, box_clientes_5, box_horas_5, box_minutos_5, txt_ingresar_tiempo_5, btn_iniciar_pausar_5, txt_iniciar_pausar_5, btn_parar_5, txt_parar_5, txt_H_M_S_5, txt_tiempo_5, btn_agregar_tiempo_5, txt_agregar_tiempo_5, hora_5, minuto_5, segundo_5);
    }//GEN-LAST:event_btn_on_off_5MouseClicked

    //Componentes del grupo 6

    private void btn_agregar_tiempo_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_6MouseClicked
        procesoBotonAgregarTiempo(btn_on_off_6, box_horas_6, box_minutos_6, 6, txt_tiempo_agregado_6, txt_tiempo_total_6);
    }//GEN-LAST:event_btn_agregar_tiempo_6MouseClicked

    private void btn_parar_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_6MouseClicked
        procesoBotonParar(hora_6, minuto_6, segundo_6, id_usuario, id_cliente_6, 6, txt_tiempo_6, btn_iniciar_pausar_6, txt_iniciar_pausar_6, box_horas_6, box_minutos_6, txt_tiempo_agregado_6, txt_tiempo_total_6);
    }//GEN-LAST:event_btn_parar_6MouseClicked

    private void btn_iniciar_pausar_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_6MouseClicked
        procesoBotonIniciarPausar(6, box_clientes_6, box_horas_6, box_minutos_6, var_btn_iniciar_pausar_6, btn_iniciar_pausar_6, txt_iniciar_pausar_6, corriendo_6, pausar_6, btn_on_off_6);
    }//GEN-LAST:event_btn_iniciar_pausar_6MouseClicked

    private void box_minutos_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_6ActionPerformed
        if (box_minutos_6.getModel().getSelectedItem() == "0") {
            item_minutos_6 = 0;
            System.out.println("itemMinutos = " + item_minutos_6);
        } else if (box_minutos_6.getModel().getSelectedItem() == "30") {
            item_minutos_6 = 30;
            System.out.println("itemMinutos = " + item_minutos_6);
        }
    }//GEN-LAST:event_box_minutos_6ActionPerformed

    private void box_horas_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_6ActionPerformed
        if (box_horas_6.getModel().getSelectedItem().equals("0")) {

            item_horas_6 = 0;

            System.out.println("itemHoras = " + item_horas_6);
        } else if (box_horas_6.getModel().getSelectedItem().equals("1")) {

            item_horas_6 = 1;

            System.out.println("itemHoras = " + item_horas_6);
        } else if (box_horas_6.getModel().getSelectedItem().equals("2")) {

            item_horas_6 = 2;

            System.out.println("itemHoras = " + item_horas_6);
        } else if (box_horas_6.getModel().getSelectedItem().equals("3")) {

            item_horas_6 = 3;

            System.out.println("itemHoras = " + item_horas_6);
        } else if (box_horas_6.getModel().getSelectedItem().equals("4")) {

            item_horas_6 = 4;

            System.out.println("itemHoras = " + item_horas_6);
        } else if (box_horas_6.getModel().getSelectedItem().equals("5")) {

            item_horas_6 = 5;

            System.out.println("itemHoras = " + item_horas_6);
        }
    }//GEN-LAST:event_box_horas_6ActionPerformed

    private void box_clientes_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientes_6ActionPerformed
//        item_clientes_6 = (String) box_clientes_6.getModel().getSelectedItem();
//        System.out.println(item_clientes_6);
        System.out.println(box_clientes_6.getModel().getSelectedItem());
        id_cliente_6 = box_clientes_6.getItemAt(box_clientes_6.getSelectedIndex()).getId();
        System.out.println("Id: " + id_cliente_6);
    }//GEN-LAST:event_box_clientes_6ActionPerformed

    private void btn_on_off_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_6MouseClicked
        procesoBotonOn_Off(btn_on_off_6, contenedor_6, box_clientes_6, box_horas_6, box_minutos_6, txt_ingresar_tiempo_6, btn_iniciar_pausar_6, txt_iniciar_pausar_6, btn_parar_6, txt_parar_6, txt_H_M_S_6, txt_tiempo_6, btn_agregar_tiempo_6, txt_agregar_tiempo_6, hora_6, minuto_6, segundo_6);
    }//GEN-LAST:event_btn_on_off_6MouseClicked


    private void btn_agregar_tiempo_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_7MouseClicked
        procesoBotonAgregarTiempo(btn_on_off_7, box_horas_7, box_minutos_7, 7, txt_tiempo_agregado_7, txt_tiempo_total_7);
    }//GEN-LAST:event_btn_agregar_tiempo_7MouseClicked

    private void btn_parar_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_7MouseClicked
        procesoBotonParar(hora_7, minuto_7, segundo_7, id_usuario, id_cliente_7, 7, txt_tiempo_7, btn_iniciar_pausar_7, txt_iniciar_pausar_7, box_horas_7, box_minutos_7, txt_tiempo_agregado_7, txt_tiempo_total_7);
    }//GEN-LAST:event_btn_parar_7MouseClicked

    private void btn_iniciar_pausar_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_7MouseClicked
        procesoBotonIniciarPausar(7, box_clientes_7, box_horas_7, box_minutos_7, var_btn_iniciar_pausar_7, btn_iniciar_pausar_7, txt_iniciar_pausar_7, corriendo_7, pausar_7, btn_on_off_7);
    }//GEN-LAST:event_btn_iniciar_pausar_7MouseClicked

    private void box_minutos_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_7ActionPerformed
        if (box_minutos_7.getModel().getSelectedItem() == "0") {
            item_minutos_7 = 0;
            System.out.println("itemMinutos = " + item_minutos_7);
        } else if (box_minutos_7.getModel().getSelectedItem() == "30") {
            item_minutos_7 = 30;
            System.out.println("itemMinutos = " + item_minutos_7);
        }    }//GEN-LAST:event_box_minutos_7ActionPerformed

    private void box_horas_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_7ActionPerformed
        if (box_horas_7.getModel().getSelectedItem().equals("0")) {

            item_horas_7 = 0;

            System.out.println("itemHoras = " + item_horas_7);
        } else if (box_horas_7.getModel().getSelectedItem().equals("1")) {

            item_horas_7 = 1;

            System.out.println("itemHoras = " + item_horas_7);
        } else if (box_horas_7.getModel().getSelectedItem().equals("2")) {

            item_horas_7 = 2;

            System.out.println("itemHoras = " + item_horas_7);
        } else if (box_horas_7.getModel().getSelectedItem().equals("3")) {

            item_horas_7 = 3;

            System.out.println("itemHoras = " + item_horas_7);
        } else if (box_horas_7.getModel().getSelectedItem().equals("4")) {

            item_horas_7 = 4;

            System.out.println("itemHoras = " + item_horas_7);
        } else if (box_horas_7.getModel().getSelectedItem().equals("5")) {

            item_horas_7 = 5;

            System.out.println("itemHoras = " + item_horas_7);
        }
    }//GEN-LAST:event_box_horas_7ActionPerformed

    private void box_clientes_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientes_7ActionPerformed
//        item_clientes_7 = (String) box_clientes_7.getModel().getSelectedItem();
//        System.out.println(item_clientes_7);
        System.out.println(box_clientes_7.getModel().getSelectedItem());
        id_cliente_7 = box_clientes_7.getItemAt(box_clientes_7.getSelectedIndex()).getId();
        System.out.println("Id: " + id_cliente_7);
    }//GEN-LAST:event_box_clientes_7ActionPerformed

    private void btn_on_off_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_7MouseClicked
        procesoBotonOn_Off(btn_on_off_7, contenedor_7, box_clientes_7, box_horas_7, box_minutos_7, txt_ingresar_tiempo_7, btn_iniciar_pausar_7, txt_iniciar_pausar_7, btn_parar_7, txt_parar_7, txt_H_M_S_7, txt_tiempo_7, btn_agregar_tiempo_7, txt_agregar_tiempo_7, hora_7, minuto_7, segundo_7);
    }//GEN-LAST:event_btn_on_off_7MouseClicked

    //Componentes del grupo 8
    private void btn_agregar_tiempo_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_8MouseClicked
        procesoBotonAgregarTiempo(btn_on_off_8, box_horas_8, box_minutos_8, 8, txt_tiempo_agregado_8, txt_tiempo_total_8);
    }//GEN-LAST:event_btn_agregar_tiempo_8MouseClicked

    private void btn_parar_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_8MouseClicked
        procesoBotonParar(hora_8, minuto_8, segundo_8, id_usuario, id_cliente_8, 8, txt_tiempo_8, btn_iniciar_pausar_8, txt_iniciar_pausar_8, box_horas_8, box_minutos_8, txt_tiempo_agregado_8, txt_tiempo_total_8);
    }//GEN-LAST:event_btn_parar_8MouseClicked

    private void btn_iniciar_pausar_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_8MouseClicked
        procesoBotonIniciarPausar(8, box_clientes_8, box_horas_8, box_minutos_8, var_btn_iniciar_pausar_8, btn_iniciar_pausar_8, txt_iniciar_pausar_8, corriendo_8, pausar_8, btn_on_off_8);
    }//GEN-LAST:event_btn_iniciar_pausar_8MouseClicked

    private void box_minutos_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_8ActionPerformed
        if (box_minutos_8.getModel().getSelectedItem() == "0") {
            item_minutos_8 = 0;
            System.out.println("itemMinutos = " + item_minutos_8);
        } else if (box_minutos_8.getModel().getSelectedItem() == "30") {
            item_minutos_8 = 30;
            System.out.println("itemMinutos = " + item_minutos_8);
        }
    }//GEN-LAST:event_box_minutos_8ActionPerformed

    private void box_horas_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_8ActionPerformed
        if (box_horas_8.getModel().getSelectedItem().equals("0")) {

            item_horas_8 = 0;

            System.out.println("itemHoras = " + item_horas_8);
        } else if (box_horas_8.getModel().getSelectedItem().equals("1")) {

            item_horas_8 = 1;

            System.out.println("itemHoras = " + item_horas_8);
        } else if (box_horas_8.getModel().getSelectedItem().equals("2")) {

            item_horas_8 = 2;

            System.out.println("itemHoras = " + item_horas_8);
        } else if (box_horas_8.getModel().getSelectedItem().equals("3")) {

            item_horas_8 = 3;

            System.out.println("itemHoras = " + item_horas_8);
        } else if (box_horas_8.getModel().getSelectedItem().equals("4")) {

            item_horas_8 = 4;

            System.out.println("itemHoras = " + item_horas_8);
        } else if (box_horas_8.getModel().getSelectedItem().equals("5")) {

            item_horas_8 = 5;

            System.out.println("itemHoras = " + item_horas_8);
        }
    }//GEN-LAST:event_box_horas_8ActionPerformed

    private void box_clientes_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientes_8ActionPerformed
//        item_clientes_8 = (String) box_clientes_8.getModel().getSelectedItem();
//        System.out.println(item_clientes_8);
        System.out.println(box_clientes_8.getModel().getSelectedItem());
        id_cliente_8 = box_clientes_8.getItemAt(box_clientes_8.getSelectedIndex()).getId();
        System.out.println("Id: " + id_cliente_8);
    }//GEN-LAST:event_box_clientes_8ActionPerformed

    private void btn_on_off_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_8MouseClicked
        procesoBotonOn_Off(btn_on_off_8, contenedor_8, box_clientes_8, box_horas_8, box_minutos_8, txt_ingresar_tiempo_8, btn_iniciar_pausar_8, txt_iniciar_pausar_8, btn_parar_8, txt_parar_8, txt_H_M_S_8, txt_tiempo_8, btn_agregar_tiempo_8, txt_agregar_tiempo_8, hora_8, minuto_8, segundo_8);
    }//GEN-LAST:event_btn_on_off_8MouseClicked

    private void box_horas_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_horas_1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_box_horas_1MouseClicked

    private void btn_iniciar_pausar_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_iniciar_pausar_2MouseEntered

    private void btn_iniciar_pausar_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_iniciar_pausar_5MouseEntered

    private void btn_recargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_recargarMouseClicked
        recargarBoxClientes(box_clientes_1);
        recargarBoxClientes(box_clientes_2);
        recargarBoxClientes(box_clientes_3);
        recargarBoxClientes(box_clientes_4);
        recargarBoxClientes(box_clientes_5);
        recargarBoxClientes(box_clientes_6);
        recargarBoxClientes(box_clientes_7);
        recargarBoxClientes(box_clientes_8);

    }//GEN-LAST:event_btn_recargarMouseClicked

    private void box_clientes_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientes_4ActionPerformed
        System.out.println(box_clientes_4.getModel().getSelectedItem());
        id_cliente_4 = box_clientes_4.getItemAt(box_clientes_4.getSelectedIndex()).getId();
        System.out.println("Id: " + id_cliente_4);
    }//GEN-LAST:event_box_clientes_4ActionPerformed

    public void recargarBoxClientes(JComboBox box_clientes) {
        if (box_clientes.getModel().getSelectedItem().equals("Seleccionar cliente")) {
            box_clientes.setModel(new ControladorClientes().llenarComboboxClientes());
        }
    }

    public void detenerYAsignarValoresDefault_1() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault 1");
        valoresPorDefault(txt_tiempo_1, btn_iniciar_pausar_1, txt_iniciar_pausar_1, box_horas_1, box_minutos_1);
        corriendo_1 = false;
        iniciarHilo_1 = false;
        pausar_1 = false;
        hora_1 = 0;
        minuto_1 = 0;
        segundo_1 = 0;
    }

    public void detenerYAsignarValoresDefault_2() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault 2");
        valoresPorDefault(txt_tiempo_2, btn_iniciar_pausar_2, txt_iniciar_pausar_2, box_horas_2, box_minutos_2);
        corriendo_2 = false;
        iniciarHilo_2 = false;
        pausar_2 = false;
        hora_2 = 0;
        minuto_2 = 0;
        segundo_2 = 0;
    }

    public void detenerYAsignarValoresDefault_3() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault 3");
        valoresPorDefault(txt_tiempo_3, btn_iniciar_pausar_3, txt_iniciar_pausar_3, box_horas_3, box_minutos_3);
        corriendo_3 = false;
        iniciarHilo_3 = false;
        pausar_3 = false;
        hora_3 = 0;
        minuto_3 = 0;
        segundo_3 = 0;
    }

    public void detenerYAsignarValoresDefault_4() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault 4");
        valoresPorDefault(txt_tiempo_4, btn_iniciar_pausar_4, txt_iniciar_pausar_4, box_horas_4, box_minutos_4);
        corriendo_4 = false;
        iniciarHilo_4 = false;
        pausar_4 = false;
        hora_4 = 0;
        minuto_4 = 0;
        segundo_4 = 0;
    }

    public void detenerYAsignarValoresDefault_5() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault 5");
        valoresPorDefault(txt_tiempo_5, btn_iniciar_pausar_5, txt_iniciar_pausar_5, box_horas_5, box_minutos_5);
        corriendo_5 = false;
        iniciarHilo_5 = false;
        pausar_5 = false;
        hora_5 = 0;
        minuto_5 = 0;
        segundo_5 = 0;
    }

    public void detenerYAsignarValoresDefault_6() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault 6");
        valoresPorDefault(txt_tiempo_6, btn_iniciar_pausar_6, txt_iniciar_pausar_6, box_horas_6, box_minutos_6);
        corriendo_6 = false;
        iniciarHilo_6 = false;
        pausar_6 = false;
        hora_6 = 0;
        minuto_6 = 0;
        segundo_6 = 0;
    }

    public void detenerYAsignarValoresDefault_7() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault 7");
        valoresPorDefault(txt_tiempo_7, btn_iniciar_pausar_7, txt_iniciar_pausar_7, box_horas_7, box_minutos_7);
        corriendo_7 = false;
        iniciarHilo_7 = false;
        pausar_7 = false;
        hora_7 = 0;
        minuto_7 = 0;
        segundo_7 = 0;
    }

    public void detenerYAsignarValoresDefault_8() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault 8");
        valoresPorDefault(txt_tiempo_8, btn_iniciar_pausar_8, txt_iniciar_pausar_8, box_horas_8, box_minutos_8);
        corriendo_8 = false;
        iniciarHilo_8 = false;
        pausar_8 = false;
        hora_8 = 0;
        minuto_8 = 0;
        segundo_8 = 0;
    }

    public void valoresPorDefault(JLabel txt_tiempo, JToggleButton btn_iniciar_pausar, JLabel txt_iniciar_pausar, JComboBox box_horas, JComboBox box_minutos) {
        txt_tiempo.setText("00 : 00 : 00");
        btn_iniciar_pausar.setSelected(false);
        btn_iniciar_pausar.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
        txt_iniciar_pausar.setText("Iniciar");

        box_horas.getModel().setSelectedItem("Horas");
        box_minutos.getModel().setSelectedItem("Minutos");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Clientes> box_clientes_1;
    private javax.swing.JComboBox<Clientes> box_clientes_2;
    private javax.swing.JComboBox<Clientes> box_clientes_3;
    private javax.swing.JComboBox<Clientes> box_clientes_4;
    private javax.swing.JComboBox<Clientes> box_clientes_5;
    private javax.swing.JComboBox<Clientes> box_clientes_6;
    private javax.swing.JComboBox<Clientes> box_clientes_7;
    private javax.swing.JComboBox<Clientes> box_clientes_8;
    private javax.swing.JComboBox<String> box_horas_1;
    private javax.swing.JComboBox<String> box_horas_2;
    private javax.swing.JComboBox<String> box_horas_3;
    private javax.swing.JComboBox<String> box_horas_4;
    private javax.swing.JComboBox<String> box_horas_5;
    private javax.swing.JComboBox<String> box_horas_6;
    private javax.swing.JComboBox<String> box_horas_7;
    private javax.swing.JComboBox<String> box_horas_8;
    private javax.swing.JComboBox<String> box_minutos_1;
    private javax.swing.JComboBox<String> box_minutos_2;
    private javax.swing.JComboBox<String> box_minutos_3;
    private javax.swing.JComboBox<String> box_minutos_4;
    private javax.swing.JComboBox<String> box_minutos_5;
    private javax.swing.JComboBox<String> box_minutos_6;
    private javax.swing.JComboBox<String> box_minutos_7;
    private javax.swing.JComboBox<String> box_minutos_8;
    private javax.swing.JLabel btn_agregar_cliente_nuevo;
    private javax.swing.JButton btn_agregar_tiempo_1;
    private javax.swing.JButton btn_agregar_tiempo_2;
    private javax.swing.JButton btn_agregar_tiempo_3;
    private javax.swing.JButton btn_agregar_tiempo_4;
    private javax.swing.JButton btn_agregar_tiempo_5;
    private javax.swing.JButton btn_agregar_tiempo_6;
    private javax.swing.JButton btn_agregar_tiempo_7;
    private javax.swing.JButton btn_agregar_tiempo_8;
    private javax.swing.JToggleButton btn_iniciar_pausar_1;
    private javax.swing.JToggleButton btn_iniciar_pausar_2;
    private javax.swing.JToggleButton btn_iniciar_pausar_3;
    private javax.swing.JToggleButton btn_iniciar_pausar_4;
    private javax.swing.JToggleButton btn_iniciar_pausar_5;
    private javax.swing.JToggleButton btn_iniciar_pausar_6;
    private javax.swing.JToggleButton btn_iniciar_pausar_7;
    private javax.swing.JToggleButton btn_iniciar_pausar_8;
    private javax.swing.JToggleButton btn_on_off_1;
    private javax.swing.JToggleButton btn_on_off_2;
    private javax.swing.JToggleButton btn_on_off_3;
    private javax.swing.JToggleButton btn_on_off_4;
    private javax.swing.JToggleButton btn_on_off_5;
    private javax.swing.JToggleButton btn_on_off_6;
    private javax.swing.JToggleButton btn_on_off_7;
    private javax.swing.JToggleButton btn_on_off_8;
    private javax.swing.JButton btn_parar_1;
    private javax.swing.JButton btn_parar_2;
    private javax.swing.JButton btn_parar_3;
    private javax.swing.JButton btn_parar_4;
    private javax.swing.JButton btn_parar_5;
    private javax.swing.JButton btn_parar_6;
    private javax.swing.JButton btn_parar_7;
    private javax.swing.JButton btn_parar_8;
    private javax.swing.JButton btn_recargar;
    private javax.swing.JLabel contenedor_1;
    private javax.swing.JLabel contenedor_2;
    private javax.swing.JLabel contenedor_3;
    private javax.swing.JLabel contenedor_4;
    private javax.swing.JLabel contenedor_5;
    private javax.swing.JLabel contenedor_6;
    private javax.swing.JLabel contenedor_7;
    private javax.swing.JLabel contenedor_8;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo_sistema;
    private javax.swing.JLabel txt_H_M_S_1;
    private javax.swing.JLabel txt_H_M_S_2;
    private javax.swing.JLabel txt_H_M_S_3;
    private javax.swing.JLabel txt_H_M_S_4;
    private javax.swing.JLabel txt_H_M_S_5;
    private javax.swing.JLabel txt_H_M_S_6;
    private javax.swing.JLabel txt_H_M_S_7;
    private javax.swing.JLabel txt_H_M_S_8;
    private javax.swing.JLabel txt_agregar_tiempo_1;
    private javax.swing.JLabel txt_agregar_tiempo_2;
    private javax.swing.JLabel txt_agregar_tiempo_3;
    private javax.swing.JLabel txt_agregar_tiempo_4;
    private javax.swing.JLabel txt_agregar_tiempo_5;
    private javax.swing.JLabel txt_agregar_tiempo_6;
    private javax.swing.JLabel txt_agregar_tiempo_7;
    private javax.swing.JLabel txt_agregar_tiempo_8;
    private javax.swing.JLabel txt_creditos;
    private javax.swing.JLabel txt_fecha;
    private javax.swing.JLabel txt_id_sesion_1;
    private javax.swing.JLabel txt_id_sesion_2;
    private javax.swing.JLabel txt_id_sesion_3;
    private javax.swing.JLabel txt_id_sesion_4;
    private javax.swing.JLabel txt_id_sesion_5;
    private javax.swing.JLabel txt_id_sesion_6;
    private javax.swing.JLabel txt_id_sesion_7;
    private javax.swing.JLabel txt_id_sesion_8;
    private javax.swing.JLabel txt_ingresar_tiempo_1;
    private javax.swing.JLabel txt_ingresar_tiempo_2;
    private javax.swing.JLabel txt_ingresar_tiempo_3;
    private javax.swing.JLabel txt_ingresar_tiempo_4;
    private javax.swing.JLabel txt_ingresar_tiempo_5;
    private javax.swing.JLabel txt_ingresar_tiempo_6;
    private javax.swing.JLabel txt_ingresar_tiempo_7;
    private javax.swing.JLabel txt_ingresar_tiempo_8;
    private javax.swing.JLabel txt_iniciar_pausar_1;
    private javax.swing.JLabel txt_iniciar_pausar_2;
    private javax.swing.JLabel txt_iniciar_pausar_3;
    private javax.swing.JLabel txt_iniciar_pausar_4;
    private javax.swing.JLabel txt_iniciar_pausar_5;
    private javax.swing.JLabel txt_iniciar_pausar_6;
    private javax.swing.JLabel txt_iniciar_pausar_7;
    private javax.swing.JLabel txt_iniciar_pausar_8;
    private javax.swing.JLabel txt_parar_1;
    private javax.swing.JLabel txt_parar_2;
    private javax.swing.JLabel txt_parar_3;
    private javax.swing.JLabel txt_parar_4;
    private javax.swing.JLabel txt_parar_5;
    private javax.swing.JLabel txt_parar_6;
    private javax.swing.JLabel txt_parar_7;
    private javax.swing.JLabel txt_parar_8;
    private javax.swing.JLabel txt_tiempo_1;
    private javax.swing.JLabel txt_tiempo_2;
    private javax.swing.JLabel txt_tiempo_3;
    private javax.swing.JLabel txt_tiempo_4;
    private javax.swing.JLabel txt_tiempo_5;
    private javax.swing.JLabel txt_tiempo_6;
    private javax.swing.JLabel txt_tiempo_7;
    private javax.swing.JLabel txt_tiempo_8;
    private javax.swing.JLabel txt_tiempo_agregado_1;
    private javax.swing.JLabel txt_tiempo_agregado_2;
    private javax.swing.JLabel txt_tiempo_agregado_3;
    private javax.swing.JLabel txt_tiempo_agregado_4;
    private javax.swing.JLabel txt_tiempo_agregado_5;
    private javax.swing.JLabel txt_tiempo_agregado_6;
    private javax.swing.JLabel txt_tiempo_agregado_7;
    private javax.swing.JLabel txt_tiempo_agregado_8;
    private javax.swing.JLabel txt_tiempo_total_1;
    private javax.swing.JLabel txt_tiempo_total_2;
    private javax.swing.JLabel txt_tiempo_total_3;
    private javax.swing.JLabel txt_tiempo_total_4;
    private javax.swing.JLabel txt_tiempo_total_5;
    private javax.swing.JLabel txt_tiempo_total_6;
    private javax.swing.JLabel txt_tiempo_total_7;
    private javax.swing.JLabel txt_tiempo_total_8;
    // End of variables declaration//GEN-END:variables
}
