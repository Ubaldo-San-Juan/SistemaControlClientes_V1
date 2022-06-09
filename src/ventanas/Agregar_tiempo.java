/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

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
    }
    static int item_horas = 0, item_minutos = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        box_horas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 80, 115));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agregar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_aceptar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, 30));

        box_horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas", "1/2", "1", "2", "3" }));
        jPanel1.add(box_horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 90, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar el tiempo a agregar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 270, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_02.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 165));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        if (box_horas.getModel().getSelectedItem() == "Horas") {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna hora!!");
        } else if (box_horas.getModel().getSelectedItem() == "1/2") {
            item_horas = 0;
            item_minutos = 30;
            
            if (ListaDeClientes.item_minutos == 30) {
                ListaDeClientes.item_horas = ListaDeClientes.item_horas + 1;
                ListaDeClientes.item_minutos = 0;
            } else {
                ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
                ListaDeClientes.item_minutos = ListaDeClientes.item_minutos + item_minutos;
            }
            
            ListaDeClientes.txt_tiempo_agregado.setText("Tiempo agregado: 30 minutos");
        } else if (box_horas.getModel().getSelectedItem() == "1") {
            item_minutos = 0;
            item_horas = 1;

            ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
            ListaDeClientes.item_minutos = ListaDeClientes.item_minutos + item_minutos;
            ListaDeClientes.txt_tiempo_agregado.setText("Tiempo agregado: 1 hora");
        } else if (box_horas.getModel().getSelectedItem() == "2") {
            item_minutos = 0;
            item_horas = 2;
            ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
            ListaDeClientes.item_minutos = ListaDeClientes.item_minutos + item_minutos;
            ListaDeClientes.txt_tiempo_agregado.setText("Tiempo agregado: 2 horas");
        } else if (box_horas.getModel().getSelectedItem() == "3") {
            item_minutos = 0;
            item_horas = 3;
            ListaDeClientes.item_horas = ListaDeClientes.item_horas + item_horas;
            ListaDeClientes.item_minutos = ListaDeClientes.item_minutos + item_minutos;
            ListaDeClientes.txt_tiempo_agregado.setText("Tiempo agregado: 3 horas");
        }

        System.out.println("itemHoras: " + ListaDeClientes.item_horas + " - itemMinutos: " + ListaDeClientes.item_minutos);

    }//GEN-LAST:event_jLabel3MouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
