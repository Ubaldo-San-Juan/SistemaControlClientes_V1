package ventanas;

import alertas.AlertaFinalizarEjecución;
import controladores.ControladorClientes;
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
import javax.swing.ListCellRenderer;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import ventanaPrincipal.Principal;

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
        //personalizarComboBoxClientesDesabilitado();
        llenarComboBox();
        //personalizarComboBoxHorasDesabilitado();
        //personalizarComboBoxMinutosDesabilitado();
        fondo.setPreferredSize(new Dimension(400, 400));
        box_clientes.setEnabled(false);
        txt_ingresar_tiempo_1.setEnabled(false);
        box_horas_1.setEnabled(false);
        box_minutos_1.setEnabled(false);
        btn_iniciar_pausar_1.setEnabled(false);
        txt_iniciar_pausar_1.setEnabled(false);
        btn_parar_1.setEnabled(false);
        txt_parar_1.setEnabled(false);
        txt_H_M_S_1.setEnabled(false);
        txt_tiempo_1.setEnabled(false);
        btn_agregar_tiempo_1.setEnabled(false);
        txt_agregar_tiempo_1.setEnabled(false);

    }

    public void personalizarComboBoxClientesHabilitado() {
        //Personalización comboBox clientes

        box_clientes.setForeground(Color.black);
        box_clientes.setUI(new BasicComboBoxUI() {

            private Color col = new Color(237, 235, 235);

            @Override
            protected JButton createArrowButton() {
                BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                        Color.WHITE, //Color de fondo
                        new Color(130, 7, 7),//sombra
                        new Color(130, 7, 7),//darkShadow
                        Color.WHITE //highlight
                );
                //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
                basicArrowButton.setBorder(BorderFactory.createLineBorder(col, 2));
                basicArrowButton.setContentAreaFilled(false);
                return basicArrowButton;
            }

            @Override
            public void paintCurrentValueBackground(Graphics g,
                    Rectangle bounds,
                    boolean hasFocus) {
                g.setColor(col);
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
            }

            //Pinta los items
            @Override
            protected ListCellRenderer createRenderer() {
                return new DefaultListCellRenderer() {

                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index,
                            boolean isSelected, boolean cellHasFocus) {

                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        list.setSelectionBackground(col);
                        if (isSelected) {
                            setBackground(col);
                            setForeground(Color.WHITE);
                        } else {
                            setBackground(Color.WHITE);
                            setForeground(new Color(70, 70, 70));
                        }

                        return this;
                    }
                };
            }

        });

    }

    public void personalizarComboBoxClientesDesabilitado() {
        box_clientes.setForeground(Color.gray);
        //Personalización comboBox clientes
        box_clientes.setUI(new BasicComboBoxUI() {

            private Color col = new Color(212, 208, 208);

            @Override
            protected JButton createArrowButton() {
                BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                        Color.WHITE, //Color de fondo
                        new Color(130, 7, 7),//sombra
                        new Color(130, 7, 7),//darkShadow
                        Color.WHITE //highlight
                );
                //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
                basicArrowButton.setBorder(BorderFactory.createLineBorder(col, 2));
                basicArrowButton.setContentAreaFilled(false);
                return basicArrowButton;
            }

            @Override
            public void paintCurrentValueBackground(Graphics g,
                    Rectangle bounds,
                    boolean hasFocus) {
                g.setColor(col);
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
            }

            //Pinta los items
            @Override
            protected ListCellRenderer createRenderer() {
                return new DefaultListCellRenderer() {

                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index,
                            boolean isSelected, boolean cellHasFocus) {

                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        list.setSelectionBackground(col);
                        if (isSelected) {
                            setBackground(col);
                            setForeground(Color.WHITE);
                        } else {
                            setBackground(Color.WHITE);
                            setForeground(new Color(70, 70, 70));
                        }

                        return this;
                    }
                };
            }

        });

    }

    public void personalizarComboBoxHorasHabilitado() {
        //Personalización comboBox horas

        box_horas_1.setForeground(Color.black);
        box_horas_1.setUI(new BasicComboBoxUI() {

            private Color col = new Color(237, 235, 235);

            @Override
            protected JButton createArrowButton() {
                BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                        Color.WHITE, //Color de fondo
                        new Color(130, 7, 7),//sombra
                        new Color(130, 7, 7),//darkShadow
                        Color.WHITE //highlight
                );
                //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
                basicArrowButton.setBorder(BorderFactory.createLineBorder(col, 2));
                basicArrowButton.setContentAreaFilled(false);
                return basicArrowButton;
            }

            @Override
            public void paintCurrentValueBackground(Graphics g,
                    Rectangle bounds,
                    boolean hasFocus) {
                g.setColor(col);
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
            }

            //Pinta los items
            @Override
            protected ListCellRenderer createRenderer() {
                return new DefaultListCellRenderer() {

                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index,
                            boolean isSelected, boolean cellHasFocus) {

                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        list.setSelectionBackground(col);
                        if (isSelected) {
                            setBackground(col);
                            setForeground(Color.WHITE);
                        } else {
                            setBackground(Color.WHITE);
                            setForeground(new Color(70, 70, 70));
                        }

                        return this;
                    }
                };
            }

        });

    }

    public void personalizarComboBoxHorasDesabilitado() {
        box_horas_1.setForeground(Color.gray);
        //Personalización comboBox horas
        box_horas_1.setUI(new BasicComboBoxUI() {

            private Color col = new Color(212, 208, 208);

            @Override
            protected JButton createArrowButton() {
                BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                        Color.WHITE, //Color de fondo
                        new Color(130, 7, 7),//sombra
                        new Color(130, 7, 7),//darkShadow
                        Color.WHITE //highlight
                );
                //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
                basicArrowButton.setBorder(BorderFactory.createLineBorder(col, 2));
                basicArrowButton.setContentAreaFilled(false);
                return basicArrowButton;
            }

            @Override
            public void paintCurrentValueBackground(Graphics g,
                    Rectangle bounds,
                    boolean hasFocus) {
                g.setColor(col);
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
            }

            //Pinta los items
            @Override
            protected ListCellRenderer createRenderer() {
                return new DefaultListCellRenderer() {

                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index,
                            boolean isSelected, boolean cellHasFocus) {

                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        list.setSelectionBackground(col);
                        if (isSelected) {
                            setBackground(col);
                            setForeground(Color.WHITE);
                        } else {
                            setBackground(Color.WHITE);
                            setForeground(new Color(70, 70, 70));
                        }

                        return this;
                    }
                };
            }

        });

    }

    public void personalizarComboBoxMinutosHabilitado() {
        //Personalización comboBox minutos

        box_minutos_1.setForeground(Color.black);
        box_minutos_1.setUI(new BasicComboBoxUI() {

            private Color col = new Color(237, 235, 235);

            @Override
            protected JButton createArrowButton() {
                BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                        Color.WHITE, //Color de fondo
                        new Color(130, 7, 7),//sombra
                        new Color(130, 7, 7),//darkShadow
                        Color.WHITE //highlight
                );
                //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
                basicArrowButton.setBorder(BorderFactory.createLineBorder(col, 2));
                basicArrowButton.setContentAreaFilled(false);
                return basicArrowButton;
            }

            @Override
            public void paintCurrentValueBackground(Graphics g,
                    Rectangle bounds,
                    boolean hasFocus) {
                g.setColor(col);
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
            }

            //Pinta los items
            @Override
            protected ListCellRenderer createRenderer() {
                return new DefaultListCellRenderer() {

                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index,
                            boolean isSelected, boolean cellHasFocus) {

                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        list.setSelectionBackground(col);
                        if (isSelected) {
                            setBackground(col);
                            setForeground(Color.WHITE);
                        } else {
                            setBackground(Color.WHITE);
                            setForeground(new Color(70, 70, 70));
                        }

                        return this;
                    }
                };
            }

        });

    }

    public void personalizarComboBoxMinutosDesabilitado() {
        //Personalización comboBox minutos
        box_minutos_1.setForeground(Color.gray);
        box_minutos_1.setUI(new BasicComboBoxUI() {

            private Color col = new Color(212, 208, 208);

            @Override
            protected JButton createArrowButton() {
                BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                        Color.WHITE, //Color de fondo
                        new Color(130, 7, 7),//sombra
                        new Color(130, 7, 7),//darkShadow
                        Color.WHITE //highlight
                );
                //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
                basicArrowButton.setBorder(BorderFactory.createLineBorder(col, 2));
                basicArrowButton.setContentAreaFilled(false);
                return basicArrowButton;
            }

            @Override
            public void paintCurrentValueBackground(Graphics g,
                    Rectangle bounds,
                    boolean hasFocus) {
                g.setColor(col);
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
            }

            //Pinta los items
            @Override
            protected ListCellRenderer createRenderer() {
                return new DefaultListCellRenderer() {

                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index,
                            boolean isSelected, boolean cellHasFocus) {

                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        list.setSelectionBackground(col);
                        if (isSelected) {
                            setBackground(col);
                            setForeground(Color.WHITE);
                        } else {
                            setBackground(Color.WHITE);
                            setForeground(new Color(70, 70, 70));
                        }

                        return this;
                    }
                };
            }

        });

    }

    public void llenarComboBox() {
        ControladorClientes controladorC = new ControladorClientes();
        box_clientes.setModel(controladorC.llenarComboboxClientes());
    }

    boolean btn_on_off = false; //en uso
    boolean btn_iniciar_pausar;

    //Variables 
    static int hora = 0, minuto = 0, segundo = 0, milesima = 0;
    static boolean iniciarHilo = true;
    static boolean corriendo = false;
    static boolean pausar = false;
    static boolean bandera;

    static int item_horas = 0, item_minutos = 0;

    Agregar_tiempo agregarTiempo1 = new Agregar_tiempo();
    AgregarClienteNuevo agregarCliente1 = new AgregarClienteNuevo();

    public JPanel getFondo() {
        return fondo;
    }

    public void cobrar() {
        Cobro cobro1 = new Cobro(hora, minuto, segundo);
        cobro1.calcularCobro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        txt_parar_1 = new javax.swing.JLabel();
        txt_iniciar_pausar_1 = new javax.swing.JLabel();
        txt_H_M_S_1 = new javax.swing.JLabel();
        txt_tiempo_1 = new javax.swing.JLabel();
        txt_agregar_tiempo_1 = new javax.swing.JLabel();
        btn_agregar_tiempo_1 = new javax.swing.JButton();
        btn_parar_1 = new javax.swing.JButton();
        btn_iniciar_pausar_1 = new javax.swing.JToggleButton();
        txt_tiempo_agregado = new javax.swing.JLabel();
        box_minutos_1 = new javax.swing.JComboBox<>();
        box_horas_1 = new javax.swing.JComboBox<>();
        box_clientes = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_1 = new javax.swing.JLabel();
        btn_on_off_01 = new javax.swing.JToggleButton();
        txt_id_sesion = new javax.swing.JLabel();
        contenedor_01 = new javax.swing.JLabel();
        titulo_sistema = new javax.swing.JLabel();
        btn_agregar_cliente_nuevo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(239, 233, 233));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_parar_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_parar_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_parar_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_parar_1.setText("Parar");
        fondo.add(txt_parar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 40, 20));

        txt_iniciar_pausar_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_iniciar_pausar_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_iniciar_pausar_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_iniciar_pausar_1.setText("Iniciar");
        fondo.add(txt_iniciar_pausar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 100, 20));

        txt_H_M_S_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_H_M_S_1.setForeground(new java.awt.Color(237, 235, 235));
        txt_H_M_S_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_H_M_S_1.setText("H        M        S");
        fondo.add(txt_H_M_S_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 120, 20));

        txt_tiempo_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        txt_tiempo_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tiempo_1.setText("00 : 00 : 00");
        fondo.add(txt_tiempo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 120, 20));

        txt_agregar_tiempo_1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        txt_agregar_tiempo_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_agregar_tiempo_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_agregar_tiempo_1.setText("Agregar tiempo");
        fondo.add(txt_agregar_tiempo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 130, -1));

        btn_agregar_tiempo_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_agregar_tiempo.png"))); // NOI18N
        btn_agregar_tiempo_1.setContentAreaFilled(false);
        btn_agregar_tiempo_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_tiempo_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_tiempo_1MouseClicked(evt);
            }
        });
        fondo.add(btn_agregar_tiempo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 60, 60));

        btn_parar_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_parar.png"))); // NOI18N
        btn_parar_1.setContentAreaFilled(false);
        btn_parar_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_parar_1MouseClicked(evt);
            }
        });
        fondo.add(btn_parar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 65, 60));

        btn_iniciar_pausar_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png"))); // NOI18N
        btn_iniciar_pausar_1.setToolTipText("");
        btn_iniciar_pausar_1.setContentAreaFilled(false);
        btn_iniciar_pausar_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_pausar_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_pausar_1MouseClicked(evt);
            }
        });
        fondo.add(btn_iniciar_pausar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 65, 60));

        txt_tiempo_agregado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_tiempo_agregado.setForeground(new java.awt.Color(237, 235, 235));
        txt_tiempo_agregado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo.add(txt_tiempo_agregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 230, 20));

        box_minutos_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "0", "30" }));
        box_minutos_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_minutos_1.setFocusable(false);
        box_minutos_1.setRequestFocusEnabled(false);
        box_minutos_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_minutos_1ActionPerformed(evt);
            }
        });
        fondo.add(box_minutos_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 90, 30));

        box_horas_1.setForeground(new java.awt.Color(212, 208, 208));
        box_horas_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "0", "1", "2", "3", "4", "5" }));
        box_horas_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_horas_1.setFocusable(false);
        box_horas_1.setRequestFocusEnabled(false);
        box_horas_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horas_1ActionPerformed(evt);
            }
        });
        fondo.add(box_horas_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 70, 30));

        box_clientes.setForeground(new java.awt.Color(237, 235, 235));
        box_clientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        box_clientes.setFocusable(false);
        box_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_clientesActionPerformed(evt);
            }
        });
        fondo.add(box_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 140, 30));

        txt_ingresar_tiempo_1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_ingresar_tiempo_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_1.setText("Ingresar tiempo");
        fondo.add(txt_ingresar_tiempo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        btn_on_off_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_OFF.png"))); // NOI18N
        btn_on_off_01.setContentAreaFilled(false);
        btn_on_off_01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_on_off_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_on_off_01MouseClicked(evt);
            }
        });
        fondo.add(btn_on_off_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 45, 25));

        txt_id_sesion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id_sesion.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_sesion.setText("1");
        fondo.add(txt_id_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 20, 30));

        contenedor_01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedor_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png"))); // NOI18N
        fondo.add(contenedor_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 850, 135));

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

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_on_off_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_on_off_01MouseClicked

        btn_on_off = btn_on_off_01.getModel().isSelected();
        System.out.println("Selected: " + btn_on_off);

        if (btn_on_off == true) { //Si el boton está encendido
            bandera = true;

            //Agregamos el icono de encendido y el contenedor encendido
            btn_on_off_01.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_ON.png")));
            contenedor_01.setIcon(new ImageIcon(getClass().getResource("/contenedores/Contenedor_05.png")));

            //Habilitamos todos los componentes del contenedor
            //personalizarComboBoxClientesHabilitado();
            //personalizarComboBoxHorasHabilitado();
            //personalizarComboBoxMinutosHabilitado();
            box_clientes.setEnabled(true);
            box_horas_1.setEnabled(true);
            box_minutos_1.setEnabled(true);
            txt_ingresar_tiempo_1.setEnabled(true);
            btn_iniciar_pausar_1.setEnabled(true);
            txt_iniciar_pausar_1.setEnabled(true);
            btn_parar_1.setEnabled(true);
            txt_parar_1.setEnabled(true);
            txt_H_M_S_1.setEnabled(true);
            txt_tiempo_1.setEnabled(true);
            btn_agregar_tiempo_1.setEnabled(true);
            txt_agregar_tiempo_1.setEnabled(true);

        } else {    //Si el botón está apagado
            bandera = false;
            //Agregamos el icono de apagado y el contenedor apagado
            btn_on_off_01.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_OFF.png")));
            contenedor_01.setIcon(new ImageIcon(getClass().getResource("/contenedores/Contenedor_06.png")));

            //Deshabilitamos todos los componentes del contenedor
            //personalizarComboBoxClientesDesabilitado();
            //personalizarComboBoxHorasDesabilitado();
            //personalizarComboBoxMinutosDesabilitado();
            box_clientes.setEnabled(false);
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

        }

        if (hora != 0 || minuto != 0 || segundo != 0) {

            //Agregamos el icono de encendido y el contenedor encendido
            btn_on_off_01.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_ON.png")));
            contenedor_01.setIcon(new ImageIcon(getClass().getResource("/contenedores/Contenedor_05.png")));

            //Habilitamos todos los componentes del contenedor
            btn_on_off_01.setSelected(true);
            box_clientes.setEnabled(true);
            txt_ingresar_tiempo_1.setEnabled(true);
            box_horas_1.setEnabled(true);
            box_minutos_1.setEnabled(true);
            btn_iniciar_pausar_1.setEnabled(true);
            txt_iniciar_pausar_1.setEnabled(true);
            btn_parar_1.setEnabled(true);
            txt_parar_1.setEnabled(true);
            txt_H_M_S_1.setEnabled(true);
            txt_tiempo_1.setEnabled(true);
            btn_agregar_tiempo_1.setEnabled(true);
            txt_agregar_tiempo_1.setEnabled(true);

            JOptionPane.showMessageDialog(null, "Hay una sesión corriendo");
            bandera = true;

        }

        System.out.println("Bandera: " + bandera);
    }//GEN-LAST:event_btn_on_off_01MouseClicked

    public boolean getBandera() {
        return bandera;
    }


    private void btn_iniciar_pausar_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_pausar_1MouseClicked
        System.out.println("Horas: " + box_horas_1.getModel().getSelectedItem() + " - Minutos: " + box_minutos_1.getModel().getSelectedItem());
        //Diseño del boton iniciar-pausar
        btn_iniciar_pausar = btn_iniciar_pausar_1.getModel().isSelected();
        System.out.println("Propiedad del boton(selected):" + btn_iniciar_pausar);

        if (btn_iniciar_pausar == true) { //Si el botón iniciar pausar está encendido
            btn_iniciar_pausar_1.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_pausar.png")));
            txt_iniciar_pausar_1.setText("Pausar");

            //Funcionalidad del boton
            if (corriendo == false) {
                iniciarHilo = true;
                corriendo = true;
                pausar = false;
                inciarHiloCronometro();
            }

            System.out.println(box_horas_1.getModel().getSelectedItem());

            if (box_horas_1.getModel().getSelectedItem() == "Horas" || box_minutos_1.getModel().getSelectedItem() == "Minutos") {
                btn_iniciar_pausar_1.setSelected(false);
                btn_iniciar_pausar = false;
                btn_iniciar_pausar_1.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
                txt_iniciar_pausar_1.setText("Iniciar");

                corriendo = false;
                iniciarHilo = false;
                pausar = false;

                JOptionPane.showMessageDialog(null, "Por favor ingrese el tiempo (horas y minutos)");

            } else {
                System.out.println("Puede pasar");

            }

        } else if (btn_iniciar_pausar == false) { //Si el botón iniciar pausar está apagado
            btn_iniciar_pausar_1.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
            txt_iniciar_pausar_1.setText("Reaundar");

            //Funcionalidad del botón
            corriendo = false;
            iniciarHilo = false;
            pausar = false;

            System.out.println("Propiedad del boton(selected):" + btn_iniciar_pausar);

        }

        if (btn_on_off_01.getModel().isSelected() == false) {
            btn_iniciar_pausar_1.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
            txt_iniciar_pausar_1.setText("Iniciar");
        }
    }//GEN-LAST:event_btn_iniciar_pausar_1MouseClicked

    private void inciarHiloCronometro() {
        if (iniciarHilo == true) {
            System.out.println("Inicia el hilo");
            Cronometro miCronometro = new Cronometro(txt_tiempo_1, btn_iniciar_pausar_1, txt_iniciar_pausar_1, box_horas_1, box_minutos_1);
            miCronometro.start();
        }

    }


    private void btn_agregar_tiempo_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_tiempo_1MouseClicked
        if (box_horas_1.getModel().getSelectedItem().equals("Horas") || box_minutos_1.getModel().getSelectedItem().equals("Minutos")) {
            JOptionPane.showMessageDialog(null, "No se ha ingresado el tiempo");
        } else {
            agregarTiempo1.setVisible(true);
            if (agregarTiempo1.isShowing()) {
                System.out.println("Está mostrado");
            }
        }

    }//GEN-LAST:event_btn_agregar_tiempo_1MouseClicked

    private void btn_parar_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_parar_1MouseClicked

        if (hora != 0 || minuto != 0 || segundo != 0) {
            AlertaFinalizarEjecución finalizarEjecucion1 = new AlertaFinalizarEjecución();

            finalizarEjecucion1.otorgarTextoAEtiqueta(txt_tiempo_1, btn_iniciar_pausar_1, txt_iniciar_pausar_1, box_horas_1, box_minutos_1);
            finalizarEjecucion1.setVisible(true);
        } else {
            System.out.println("Hora, minuto, segundo == 0");
        }

    }//GEN-LAST:event_btn_parar_1MouseClicked

    private void box_horas_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horas_1ActionPerformed
        if (box_horas_1.getModel().getSelectedItem() == "0") {

            item_horas = 0;

            System.out.println("itemHoras = " + item_horas + " - itemMinutos: " + item_minutos);
        } else if (box_horas_1.getModel().getSelectedItem() == "1") {

            item_horas = 1;

            System.out.println("itemHoras = " + item_horas);
        } else if (box_horas_1.getModel().getSelectedItem() == "2") {

            item_horas = 2;

            System.out.println("itemHoras = " + item_horas);
        } else if (box_horas_1.getModel().getSelectedItem() == "3") {

            item_horas = 3;

            System.out.println("itemHoras = " + item_horas);
        } else if (box_horas_1.getModel().getSelectedItem() == "4") {

            item_horas = 4;

            System.out.println("itemHoras = " + item_horas);
        } else if (box_horas_1.getModel().getSelectedItem() == "5") {

            item_horas = 5;

            System.out.println("itemHoras = " + item_horas);
        }


    }//GEN-LAST:event_box_horas_1ActionPerformed

    private void box_minutos_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_minutos_1ActionPerformed
        if (box_minutos_1.getModel().getSelectedItem() == "0") {
            item_minutos = 0;
            System.out.println("itemMinutos = " + item_minutos);
        } else if (box_minutos_1.getModel().getSelectedItem() == "30") {
            item_minutos = 30;
            System.out.println("itemMinutos = " + item_minutos);
        }
    }//GEN-LAST:event_box_minutos_1ActionPerformed

    private void box_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_clientesActionPerformed

    }//GEN-LAST:event_box_clientesActionPerformed

    private void btn_agregar_cliente_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_cliente_nuevoMouseClicked
        agregarCliente1.setVisible(true);
        if (agregarCliente1.isShowing()) {
            System.out.println("Está mostrado");
        }
    }//GEN-LAST:event_btn_agregar_cliente_nuevoMouseClicked

    public void detenerYAsignarValoresDefault() {
        System.out.println("Hemos entrado a la funcion detenerYAsignarValoresDefault");
        valoresPorDefault();
        corriendo = false;
        iniciarHilo = false;
        pausar = false;
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public void valoresPorDefault() {
        txt_tiempo_1.setText("00 : 00 : 00");

        btn_iniciar_pausar_1.setSelected(false);
        btn_iniciar_pausar_1.setIcon(new ImageIcon(getClass().getResource("/botones/Boton_iniciar_pausar.png")));
        txt_iniciar_pausar_1.setText("Iniciar");

        box_horas_1.getModel().setSelectedItem("Horas");
        box_minutos_1.getModel().setSelectedItem("Minutos");
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
    private javax.swing.JComboBox<String> box_clientes;
    private javax.swing.JComboBox<String> box_horas_1;
    private javax.swing.JComboBox<String> box_minutos_1;
    private javax.swing.JLabel btn_agregar_cliente_nuevo;
    private javax.swing.JButton btn_agregar_tiempo_1;
    private javax.swing.JToggleButton btn_iniciar_pausar_1;
    private javax.swing.JToggleButton btn_on_off_01;
    private javax.swing.JButton btn_parar_1;
    private javax.swing.JLabel contenedor_01;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel titulo_sistema;
    private javax.swing.JLabel txt_H_M_S_1;
    private javax.swing.JLabel txt_agregar_tiempo_1;
    private javax.swing.JLabel txt_id_sesion;
    private javax.swing.JLabel txt_ingresar_tiempo_1;
    private javax.swing.JLabel txt_iniciar_pausar_1;
    private javax.swing.JLabel txt_parar_1;
    private javax.swing.JLabel txt_tiempo_1;
    public static javax.swing.JLabel txt_tiempo_agregado;
    // End of variables declaration//GEN-END:variables
}
