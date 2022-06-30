
package ventanas;

import controladores.ControladorTarifa;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ubaldo
 */
public class CambiarTarifa extends javax.swing.JFrame {

    ControladorTarifa controladorTarifa1 = new ControladorTarifa();
    
    
    public CambiarTarifa() {
        initComponents();
        setLocationRelativeTo(null);
        asignarTarifaActual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_tarifa_actual = new javax.swing.JLabel();
        txt_ingresar_tarifa_nueva = new javax.swing.JLabel();
        campo_tarifa_nueva = new javax.swing.JTextField();
        btn_cambiar_tarifa = new javax.swing.JLabel();
        campo_cambiar_tarifa = new javax.swing.JButton();
        Contenedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 233, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_tarifa_actual.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        txt_tarifa_actual.setForeground(new java.awt.Color(36, 36, 36));
        txt_tarifa_actual.setText("Tarifa actual: ");
        jPanel1.add(txt_tarifa_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 250, -1));

        txt_ingresar_tarifa_nueva.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        txt_ingresar_tarifa_nueva.setForeground(new java.awt.Color(142, 50, 50));
        txt_ingresar_tarifa_nueva.setText("Ingresa la tarifa nueva");
        txt_ingresar_tarifa_nueva.setToolTipText("");
        jPanel1.add(txt_ingresar_tarifa_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        campo_tarifa_nueva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_tarifa_nueva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_tarifa_nueva.setBorder(new javax.swing.border.MatteBorder(null));
        campo_tarifa_nueva.setCaretColor(new java.awt.Color(112, 112, 112));
        jPanel1.add(campo_tarifa_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 90, 40));

        btn_cambiar_tarifa.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_cambiar_tarifa.setForeground(new java.awt.Color(255, 255, 255));
        btn_cambiar_tarifa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cambiar_tarifa.setText("Cambiar tarifa");
        btn_cambiar_tarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cambiar_tarifa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cambiar_tarifaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cambiar_tarifaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cambiar_tarifaMouseExited(evt);
            }
        });
        jPanel1.add(btn_cambiar_tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, 60));

        campo_cambiar_tarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BotonCambiarContrasenia.png"))); // NOI18N
        campo_cambiar_tarifa.setContentAreaFilled(false);
        jPanel1.add(campo_cambiar_tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, 60));

        Contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_07.png"))); // NOI18N
        jPanel1.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cambiar_tarifaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_tarifaMouseClicked
        
        try {
            float tarifa =  Float.parseFloat(campo_tarifa_nueva.getText());
            System.out.println("Tarifa: " + tarifa);
            controladorTarifa1.cambiarTarifa(tarifa);
            asignarTarifaActual();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sólo se aceptan números");
        }
    }//GEN-LAST:event_btn_cambiar_tarifaMouseClicked

    public void asignarTarifaActual(){
        txt_tarifa_actual.setText("Tarifa actual: $" + controladorTarifa1.obtenerTarifa() + " pesos");
    }
    
    private void btn_cambiar_tarifaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_tarifaMouseEntered
        campo_cambiar_tarifa.setIcon(new ImageIcon(getClass().getResource("/botones/BotonCambiarContraseniaHover.png")));
    }//GEN-LAST:event_btn_cambiar_tarifaMouseEntered

    private void btn_cambiar_tarifaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_tarifaMouseExited
        campo_cambiar_tarifa.setIcon(new ImageIcon(getClass().getResource("/botones/BotonCambiarContrasenia.png")));
    }//GEN-LAST:event_btn_cambiar_tarifaMouseExited

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
            java.util.logging.Logger.getLogger(CambiarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarTarifa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contenedor;
    private javax.swing.JLabel btn_cambiar_tarifa;
    private javax.swing.JButton campo_cambiar_tarifa;
    private javax.swing.JTextField campo_tarifa_nueva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_ingresar_tarifa_nueva;
    private javax.swing.JLabel txt_tarifa_actual;
    // End of variables declaration//GEN-END:variables
}
