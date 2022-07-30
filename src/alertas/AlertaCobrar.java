
package alertas;

import java.text.DecimalFormat;

/**
 *
 * @author Ubaldo
 */
public class AlertaCobrar extends javax.swing.JFrame {
    
    public AlertaCobrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_aceptar = new javax.swing.JLabel();
        fondo_boton_aceptar = new javax.swing.JButton();
        icono_i = new javax.swing.JLabel();
        txt_aviso = new javax.swing.JLabel();
        contenedor_02 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 80, 115));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_aceptar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btn_aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 90, 30));

        fondo_boton_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Boton_aceptar.png"))); // NOI18N
        fondo_boton_aceptar.setContentAreaFilled(false);
        fondo_boton_aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(fondo_boton_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 90, 30));

        icono_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icono_I.png"))); // NOI18N
        jPanel1.add(icono_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 40));

        txt_aviso.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        txt_aviso.setForeground(new java.awt.Color(255, 255, 255));
        txt_aviso.setText("Cantidad a cobrar");
        txt_aviso.setToolTipText("");
        jPanel1.add(txt_aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 20));

        contenedor_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_02.png"))); // NOI18N
        jPanel1.add(contenedor_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 165));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptarMouseClicked
        this.dispose();
        
    }//GEN-LAST:event_btn_aceptarMouseClicked
    
    public void setPrecioTotal(float precioTotal){
        txt_aviso.setText("Cantidad a cobrar: " + precioTotal);
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
            java.util.logging.Logger.getLogger(AlertaCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlertaCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlertaCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlertaCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlertaCobrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_aceptar;
    private javax.swing.JLabel contenedor_02;
    private javax.swing.JButton fondo_boton_aceptar;
    private javax.swing.JLabel icono_i;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_aviso;
    // End of variables declaration//GEN-END:variables
}
