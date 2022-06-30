
package ventanas;

import controladores.ControladorClientes;
import javax.swing.ImageIcon;

/**
 *
 * @author Ubaldo
 */
public class AgregarClienteNuevo extends javax.swing.JFrame {

    /**
     * Creates new form AgregarClienteNuevo
     */
    public AgregarClienteNuevo() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/Icono.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar cliente nuevo");
    }
    ControladorClientes controladorCliente1 = new ControladorClientes();
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_ingresar_usuario_nuevo = new javax.swing.JLabel();
        txt_ingresar_contrasenia = new javax.swing.JLabel();
        campo_nombreCliente = new javax.swing.JTextField();
        btn_agregar_cliente_nuevo = new javax.swing.JLabel();
        campo_agregar_cliente_nuevo = new javax.swing.JButton();
        Contenedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 233, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_ingresar_usuario_nuevo.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        txt_ingresar_usuario_nuevo.setForeground(new java.awt.Color(36, 36, 36));
        txt_ingresar_usuario_nuevo.setText("Ingresar cliente nuevo");
        jPanel1.add(txt_ingresar_usuario_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        txt_ingresar_contrasenia.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        txt_ingresar_contrasenia.setForeground(new java.awt.Color(142, 50, 50));
        txt_ingresar_contrasenia.setText("Ingresa el nombre del cliente");
        txt_ingresar_contrasenia.setToolTipText("");
        jPanel1.add(txt_ingresar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        campo_nombreCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        campo_nombreCliente.setCaretColor(new java.awt.Color(112, 112, 112));
        jPanel1.add(campo_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 240, 40));

        btn_agregar_cliente_nuevo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_agregar_cliente_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar_cliente_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar_cliente_nuevo.setText("Agregar cliente nuevo");
        btn_agregar_cliente_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_cliente_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar_cliente_nuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregar_cliente_nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregar_cliente_nuevoMouseExited(evt);
            }
        });
        jPanel1.add(btn_agregar_cliente_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 230, 60));

        campo_agregar_cliente_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BotonCambiarContrasenia.png"))); // NOI18N
        campo_agregar_cliente_nuevo.setContentAreaFilled(false);
        jPanel1.add(campo_agregar_cliente_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 230, 60));

        Contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_07.png"))); // NOI18N
        jPanel1.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_cliente_nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_cliente_nuevoMouseEntered
        campo_agregar_cliente_nuevo.setIcon(new ImageIcon(getClass().getResource("/botones/BotonCambiarContraseniaHover.png")));
    }//GEN-LAST:event_btn_agregar_cliente_nuevoMouseEntered

    private void btn_agregar_cliente_nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_cliente_nuevoMouseExited
        campo_agregar_cliente_nuevo.setIcon(new ImageIcon(getClass().getResource("/botones/BotonCambiarContrasenia.png")));
    }//GEN-LAST:event_btn_agregar_cliente_nuevoMouseExited

    private void btn_agregar_cliente_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar_cliente_nuevoMouseClicked
        ListaDeClientes listaClientes1 = new ListaDeClientes();
        String nombreCliente = campo_nombreCliente.getText();
        controladorCliente1.agregarClienteNuevo(nombreCliente);

        this.dispose();
    }//GEN-LAST:event_btn_agregar_cliente_nuevoMouseClicked


    
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
            java.util.logging.Logger.getLogger(AgregarClienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarClienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarClienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarClienteNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarClienteNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contenedor;
    private javax.swing.JLabel btn_agregar_cliente_nuevo;
    private javax.swing.JButton campo_agregar_cliente_nuevo;
    private javax.swing.JTextField campo_nombreCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_ingresar_contrasenia;
    private javax.swing.JLabel txt_ingresar_usuario_nuevo;
    // End of variables declaration//GEN-END:variables
}
