package ventanas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ubaldo
 */
public class Agregar_tiempo extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_tiempo
     */
    public Agregar_tiempo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar tiempo");
    }
    static int item_horas = 0, item_minutos = 0;
    JLabel txt_tiempo_agregado, txt_tiempo_total;

    static int id = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JLabel();
        fondo_boton_agregar = new javax.swing.JButton();
        box_horas = new javax.swing.JComboBox<>();
        txt_ingresar_tiempo_a_agregar = new javax.swing.JLabel();
        contenedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 80, 115));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_agregar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        btn_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar.setText("Agregar");
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, 30));

        fondo_boton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_aceptar.png"))); // NOI18N
        fondo_boton_agregar.setContentAreaFilled(false);
        fondo_boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondo_boton_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(fondo_boton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, 30));

        box_horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "1/2", "1", "2", "3" }));
        box_horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_horasActionPerformed(evt);
            }
        });
        jPanel1.add(box_horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 90, 30));

        txt_ingresar_tiempo_a_agregar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        txt_ingresar_tiempo_a_agregar.setForeground(new java.awt.Color(255, 255, 255));
        txt_ingresar_tiempo_a_agregar.setText("Ingresar el tiempo a agregar");
        jPanel1.add(txt_ingresar_tiempo_a_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 270, 20));

        contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_02.png"))); // NOI18N
        jPanel1.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 165));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fondo_boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondo_boton_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fondo_boton_agregarActionPerformed

    public void asignarID(int id) {
        this.id = id;
    }

    public void agregarTextoTiempoAgregado(JLabel txt_tiempo_agregado, JLabel txt_tiempo_total) {
        this.txt_tiempo_agregado = txt_tiempo_agregado;
        this.txt_tiempo_total = txt_tiempo_total;
    }

    public void ejecutarAgregarTexto(String textoTiempoAgregado, String textoTiempoTotal) {
        txt_tiempo_agregado.setText(textoTiempoAgregado);
        txt_tiempo_total.setText(textoTiempoTotal);
    }

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        String textoAOtorgar = "";

        if (id == 1) {
            if (box_horas.getModel().getSelectedItem() == "Horas") {

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");

            } else if (item_minutos == 30) {
                System.out.println("Item horas lista: " + ListaDeClientes.item_horas_1);
                System.out.println("Item minutos lista: " + ListaDeClientes.item_minutos_1);

                if (ListaDeClientes.item_minutos_1 == 30) {
                    ListaDeClientes.item_horas_1 = ListaDeClientes.item_horas_1 + 1;
                    ListaDeClientes.item_minutos_1 = 0;
                } else {

//                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                    ListaDeClientes.item_minutos_1 = ListaDeClientes.item_minutos_1 + item_minutos;
                }
                textoAOtorgar = "Tiempo agregado: " + item_minutos + " minutos";
            } else if (item_horas == 1) {

                ListaDeClientes.item_horas_1 = ListaDeClientes.item_horas_1 + item_horas;
                ListaDeClientes.item_minutos_1 = ListaDeClientes.item_minutos_1 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " hora";
            } else if (item_horas == 2) {

                ListaDeClientes.item_horas_1 = ListaDeClientes.item_horas_1 + item_horas;
                ListaDeClientes.item_minutos_1 = ListaDeClientes.item_minutos_1 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            } else if (item_horas == 3) {

                ListaDeClientes.item_horas_1 = ListaDeClientes.item_horas_1 + item_horas;
                ListaDeClientes.item_minutos_1 = ListaDeClientes.item_minutos_1 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            }

            System.out.println("Hora final: " + ListaDeClientes.item_horas_1 + " horas con " + ListaDeClientes.item_minutos_1 + " minutos");
            String textoTiempoTotal = "Tiempo total-> " + ListaDeClientes.item_horas_1 + " : " + ListaDeClientes.item_minutos_1;
            ejecutarAgregarTexto(textoAOtorgar, textoTiempoTotal);
            this.setVisible(false);
        } else if (id == 2) {
            if (box_horas.getModel().getSelectedItem() == "Horas") {

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");

            } else if (item_minutos == 30) {
                System.out.println("Item horas lista: " + ListaDeClientes.item_horas_2);
                System.out.println("Item minutos lista: " + ListaDeClientes.item_minutos_2);

                if (ListaDeClientes.item_minutos_2 == 30) {
                    ListaDeClientes.item_horas_2 = ListaDeClientes.item_horas_2 + 1;
                    ListaDeClientes.item_minutos_2 = 0;
                } else {

//                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                    ListaDeClientes.item_minutos_2 = ListaDeClientes.item_minutos_2 + item_minutos;
                }
                textoAOtorgar = "Tiempo agregado: " + item_minutos + " minutos";
            } else if (item_horas == 1) {

                ListaDeClientes.item_horas_2 = ListaDeClientes.item_horas_2 + item_horas;
                ListaDeClientes.item_minutos_2 = ListaDeClientes.item_minutos_2 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " hora";
            } else if (item_horas == 2) {

                ListaDeClientes.item_horas_2 = ListaDeClientes.item_horas_2 + item_horas;
                ListaDeClientes.item_minutos_2 = ListaDeClientes.item_minutos_2 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            } else if (item_horas == 3) {

                ListaDeClientes.item_horas_2 = ListaDeClientes.item_horas_2 + item_horas;
                ListaDeClientes.item_minutos_2 = ListaDeClientes.item_minutos_2 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            }

            System.out.println("Hora final: " + ListaDeClientes.item_horas_2 + " horas con " + ListaDeClientes.item_minutos_2 + " minutos");
            String textoTiempoTotal = "Tiempo total-> " + ListaDeClientes.item_horas_2 + " : " + ListaDeClientes.item_minutos_2;
            ejecutarAgregarTexto(textoAOtorgar, textoTiempoTotal);
            this.setVisible(false);
        }else if(id==3){
            if (box_horas.getModel().getSelectedItem() == "Horas") {

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");

            } else if (item_minutos == 30) {
                System.out.println("Item horas lista: " + ListaDeClientes.item_horas_3);
                System.out.println("Item minutos lista: " + ListaDeClientes.item_minutos_3);

                if (ListaDeClientes.item_minutos_3 == 30) {
                    ListaDeClientes.item_horas_3 = ListaDeClientes.item_horas_3 + 1;
                    ListaDeClientes.item_minutos_3 = 0;
                } else {

//                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                    ListaDeClientes.item_minutos_3 = ListaDeClientes.item_minutos_3 + item_minutos;
                }
                textoAOtorgar = "Tiempo agregado: " + item_minutos + " minutos";
            } else if (item_horas == 1) {

                ListaDeClientes.item_horas_3 = ListaDeClientes.item_horas_3 + item_horas;
                ListaDeClientes.item_minutos_3 = ListaDeClientes.item_minutos_3 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " hora";
            } else if (item_horas == 2) {

                ListaDeClientes.item_horas_3 = ListaDeClientes.item_horas_3 + item_horas;
                ListaDeClientes.item_minutos_3 = ListaDeClientes.item_minutos_3 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            } else if (item_horas == 3) {

                ListaDeClientes.item_horas_3 = ListaDeClientes.item_horas_3 + item_horas;
                ListaDeClientes.item_minutos_3 = ListaDeClientes.item_minutos_3 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            }

            System.out.println("Hora final: " + ListaDeClientes.item_horas_3 + " horas con " + ListaDeClientes.item_minutos_3 + " minutos");
            String textoTiempoTotal = "Tiempo total-> " + ListaDeClientes.item_horas_3 + " : " + ListaDeClientes.item_minutos_3;
            ejecutarAgregarTexto(textoAOtorgar, textoTiempoTotal);
            this.setVisible(false);
        }else if(id==4){
            if (box_horas.getModel().getSelectedItem() == "Horas") {

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");

            } else if (item_minutos == 30) {
                System.out.println("Item horas lista: " + ListaDeClientes.item_horas_4);
                System.out.println("Item minutos lista: " + ListaDeClientes.item_minutos_4);

                if (ListaDeClientes.item_minutos_4 == 30) {
                    ListaDeClientes.item_horas_4 = ListaDeClientes.item_horas_4 + 1;
                    ListaDeClientes.item_minutos_4 = 0;
                } else {

//                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                    ListaDeClientes.item_minutos_4 = ListaDeClientes.item_minutos_4 + item_minutos;
                }
                textoAOtorgar = "Tiempo agregado: " + item_minutos + " minutos";
            } else if (item_horas == 1) {

                ListaDeClientes.item_horas_4 = ListaDeClientes.item_horas_4 + item_horas;
                ListaDeClientes.item_minutos_4 = ListaDeClientes.item_minutos_4 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " hora";
            } else if (item_horas == 2) {

                ListaDeClientes.item_horas_4 = ListaDeClientes.item_horas_4 + item_horas;
                ListaDeClientes.item_minutos_4 = ListaDeClientes.item_minutos_4 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            } else if (item_horas == 3) {

                ListaDeClientes.item_horas_4 = ListaDeClientes.item_horas_4 + item_horas;
                ListaDeClientes.item_minutos_4 = ListaDeClientes.item_minutos_4 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            }

            System.out.println("Hora final: " + ListaDeClientes.item_horas_4 + " horas con " + ListaDeClientes.item_minutos_4 + " minutos");
            String textoTiempoTotal = "Tiempo total-> " + ListaDeClientes.item_horas_4 + " : " + ListaDeClientes.item_minutos_4;
            ejecutarAgregarTexto(textoAOtorgar, textoTiempoTotal);
            this.setVisible(false);
        }else if(id==5){
            if (box_horas.getModel().getSelectedItem() == "Horas") {

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");

            } else if (item_minutos == 30) {
                System.out.println("Item horas lista: " + ListaDeClientes.item_horas_5);
                System.out.println("Item minutos lista: " + ListaDeClientes.item_minutos_5);

                if (ListaDeClientes.item_minutos_5 == 30) {
                    ListaDeClientes.item_horas_5 = ListaDeClientes.item_horas_5 + 1;
                    ListaDeClientes.item_minutos_5 = 0;
                } else {

//                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                    ListaDeClientes.item_minutos_5 = ListaDeClientes.item_minutos_5 + item_minutos;
                }
                textoAOtorgar = "Tiempo agregado: " + item_minutos + " minutos";
            } else if (item_horas == 1) {

                ListaDeClientes.item_horas_5 = ListaDeClientes.item_horas_5 + item_horas;
                ListaDeClientes.item_minutos_5 = ListaDeClientes.item_minutos_5 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " hora";
            } else if (item_horas == 2) {

                ListaDeClientes.item_horas_5 = ListaDeClientes.item_horas_5 + item_horas;
                ListaDeClientes.item_minutos_5 = ListaDeClientes.item_minutos_5 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            } else if (item_horas == 3) {

                ListaDeClientes.item_horas_5 = ListaDeClientes.item_horas_5 + item_horas;
                ListaDeClientes.item_minutos_5 = ListaDeClientes.item_minutos_5 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            }

            System.out.println("Hora final: " + ListaDeClientes.item_horas_5 + " horas con " + ListaDeClientes.item_minutos_5 + " minutos");
            String textoTiempoTotal = "Tiempo total-> " + ListaDeClientes.item_horas_5 + " : " + ListaDeClientes.item_minutos_5;
            ejecutarAgregarTexto(textoAOtorgar, textoTiempoTotal);
            this.setVisible(false);
        }else if(id==6){
            if (box_horas.getModel().getSelectedItem() == "Horas") {

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");

            } else if (item_minutos == 30) {
                System.out.println("Item horas lista: " + ListaDeClientes.item_horas_6);
                System.out.println("Item minutos lista: " + ListaDeClientes.item_minutos_6);

                if (ListaDeClientes.item_minutos_6 == 30) {
                    ListaDeClientes.item_horas_6 = ListaDeClientes.item_horas_6 + 1;
                    ListaDeClientes.item_minutos_6 = 0;
                } else {

//                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                    ListaDeClientes.item_minutos_6 = ListaDeClientes.item_minutos_6 + item_minutos;
                }
                textoAOtorgar = "Tiempo agregado: " + item_minutos + " minutos";
            } else if (item_horas == 1) {

                ListaDeClientes.item_horas_6 = ListaDeClientes.item_horas_6 + item_horas;
                ListaDeClientes.item_minutos_6 = ListaDeClientes.item_minutos_6 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " hora";
            } else if (item_horas == 2) {

                ListaDeClientes.item_horas_6 = ListaDeClientes.item_horas_6 + item_horas;
                ListaDeClientes.item_minutos_6 = ListaDeClientes.item_minutos_6 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            } else if (item_horas == 3) {

                ListaDeClientes.item_horas_6 = ListaDeClientes.item_horas_6 + item_horas;
                ListaDeClientes.item_minutos_6 = ListaDeClientes.item_minutos_6 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            }

            System.out.println("Hora final: " + ListaDeClientes.item_horas_6 + " horas con " + ListaDeClientes.item_minutos_6 + " minutos");
            String textoTiempoTotal = "Tiempo total-> " + ListaDeClientes.item_horas_6 + " : " + ListaDeClientes.item_minutos_6;
            ejecutarAgregarTexto(textoAOtorgar, textoTiempoTotal);
            this.setVisible(false);
        }else if(id==7){
            if (box_horas.getModel().getSelectedItem() == "Horas") {

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");

            } else if (item_minutos == 30) {
                System.out.println("Item horas lista: " + ListaDeClientes.item_horas_7);
                System.out.println("Item minutos lista: " + ListaDeClientes.item_minutos_7);

                if (ListaDeClientes.item_minutos_7 == 30) {
                    ListaDeClientes.item_horas_7 = ListaDeClientes.item_horas_7 + 1;
                    ListaDeClientes.item_minutos_7 = 0;
                } else {

//                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                    ListaDeClientes.item_minutos_7 = ListaDeClientes.item_minutos_7 + item_minutos;
                }
                textoAOtorgar = "Tiempo agregado: " + item_minutos + " minutos";
            } else if (item_horas == 1) {

                ListaDeClientes.item_horas_7 = ListaDeClientes.item_horas_7 + item_horas;
                ListaDeClientes.item_minutos_7 = ListaDeClientes.item_minutos_7 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " hora";
            } else if (item_horas == 2) {

                ListaDeClientes.item_horas_7 = ListaDeClientes.item_horas_7 + item_horas;
                ListaDeClientes.item_minutos_7 = ListaDeClientes.item_minutos_7 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            } else if (item_horas == 3) {

                ListaDeClientes.item_horas_7 = ListaDeClientes.item_horas_7 + item_horas;
                ListaDeClientes.item_minutos_7 = ListaDeClientes.item_minutos_7 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            }

            System.out.println("Hora final: " + ListaDeClientes.item_horas_7 + " horas con " + ListaDeClientes.item_minutos_7 + " minutos");
            String textoTiempoTotal = "Tiempo total-> " + ListaDeClientes.item_horas_7 + " : " + ListaDeClientes.item_minutos_7;
            ejecutarAgregarTexto(textoAOtorgar, textoTiempoTotal);
            this.setVisible(false);
        }else if(id==8){
            if (box_horas.getModel().getSelectedItem() == "Horas") {

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");

            } else if (item_minutos == 30) {
                System.out.println("Item horas lista: " + ListaDeClientes.item_horas_8);
                System.out.println("Item minutos lista: " + ListaDeClientes.item_minutos_8);

                if (ListaDeClientes.item_minutos_8 == 30) {
                    ListaDeClientes.item_horas_8 = ListaDeClientes.item_horas_8 + 1;
                    ListaDeClientes.item_minutos_8 = 0;
                } else {

//                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                    ListaDeClientes.item_minutos_8 = ListaDeClientes.item_minutos_8 + item_minutos;
                }
                textoAOtorgar = "Tiempo agregado: " + item_minutos + " minutos";
            } else if (item_horas == 1) {

                ListaDeClientes.item_horas_8 = ListaDeClientes.item_horas_8 + item_horas;
                ListaDeClientes.item_minutos_8 = ListaDeClientes.item_minutos_8 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " hora";
            } else if (item_horas == 2) {

                ListaDeClientes.item_horas_8 = ListaDeClientes.item_horas_8 + item_horas;
                ListaDeClientes.item_minutos_8 = ListaDeClientes.item_minutos_8 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            } else if (item_horas == 3) {

                ListaDeClientes.item_horas_8 = ListaDeClientes.item_horas_8 + item_horas;
                ListaDeClientes.item_minutos_8 = ListaDeClientes.item_minutos_8 + item_minutos;
                textoAOtorgar = "Tiempo agregado: " + item_horas + " horas";
            }

            System.out.println("Hora final: " + ListaDeClientes.item_horas_8 + " horas con " + ListaDeClientes.item_minutos_8 + " minutos");
            String textoTiempoTotal = "Tiempo total-> " + ListaDeClientes.item_horas_8 + " : " + ListaDeClientes.item_minutos_8;
            ejecutarAgregarTexto(textoAOtorgar, textoTiempoTotal);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btn_agregarMouseClicked

    private void box_horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_horasActionPerformed
        if (box_horas.getModel().getSelectedItem().equals("Horas")) {
            System.out.println("No se seleccionó ninguna hora!!");
        } else if (box_horas.getModel().getSelectedItem().equals("1/2")) {
            item_horas = 0;
            item_minutos = 30;

        } else if (box_horas.getModel().getSelectedItem().equals("1")) {
            item_minutos = 0;
            item_horas = 1;

        } else if (box_horas.getModel().getSelectedItem().equals("2")) {
            item_minutos = 0;
            item_horas = 2;
        } else if (box_horas.getModel().getSelectedItem().equals("3")) {
            item_minutos = 0;
            item_horas = 3;
        }
        System.out.println("Horas: " + item_horas);
        System.out.println("Minutos: " + item_minutos);
        System.out.println("");
    }//GEN-LAST:event_box_horasActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_tiempo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_horas;
    private javax.swing.JLabel btn_agregar;
    private javax.swing.JLabel contenedor;
    private javax.swing.JButton fondo_boton_agregar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_ingresar_tiempo_a_agregar;
    // End of variables declaration//GEN-END:variables
}
