
package ventanas;

import controladores.Controlador;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import ventanaPrincipal.Principal;

/**
 *
 * @author Ubaldo
 * 
 */
public class Configuracion extends javax.swing.JFrame {
    public static String usuarioRecibido = "";  
    
    
    public Configuracion() {
        initComponents();
        this.setResizable(false);
    }
    
    public JPanel getFondo() {
        return fondo;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        btn_cambiar_contrasenia = new javax.swing.JLabel();
        fondo_btn_cambiar_contrasenia = new javax.swing.JButton();
        icono_contrasenia = new javax.swing.JLabel();
        txt_perfil_usuario = new javax.swing.JLabel();
        icono_usuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        titulo_sistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(239, 233, 233));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cambiar_contrasenia.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_cambiar_contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        btn_cambiar_contrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cambiar_contrasenia.setText("Cambiar contraseña");
        btn_cambiar_contrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cambiar_contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cambiar_contraseniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cambiar_contraseniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cambiar_contraseniaMouseExited(evt);
            }
        });
        fondo.add(btn_cambiar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 220, 50));

        fondo_btn_cambiar_contrasenia.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        fondo_btn_cambiar_contrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BotonCambiarContrasenia.png"))); // NOI18N
        fondo_btn_cambiar_contrasenia.setToolTipText("");
        fondo_btn_cambiar_contrasenia.setContentAreaFilled(false);
        fondo.add(fondo_btn_cambiar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 220, 50));

        icono_contrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/IconoPassword.png"))); // NOI18N
        fondo.add(icono_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 140, 140));

        txt_perfil_usuario.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        txt_perfil_usuario.setForeground(new java.awt.Color(157, 145, 145));
        txt_perfil_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_perfil_usuario.setText("U");
        txt_perfil_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_perfil_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txt_perfil_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_perfil_usuarioMouseClicked(evt);
            }
        });
        fondo.add(txt_perfil_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 110, 100));

        icono_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/IconoUsuario.png"))); // NOI18N
        fondo.add(icono_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 90, 90));

        jButton1.setText("Modo oscuro");
        fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 150, 40));

        titulo_sistema.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        titulo_sistema.setText("Sistema de control clientes");
        fondo.add(titulo_sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 67));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_perfil_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_perfil_usuarioMouseClicked

         
    }//GEN-LAST:event_txt_perfil_usuarioMouseClicked

    private void btn_cambiar_contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_contraseniaMouseClicked
        System.out.println("Configuracion usuario recibido: " + usuarioRecibido);
        ActualizarContrasenia actualizarContrasenia1 = new ActualizarContrasenia();   
        actualizarContrasenia1.usuarioRecibido = usuarioRecibido;
        //System.out.println("btn_cambiar_contraseniaMouseClicke Usuario recibido: " + usuario_recibido);
        /*
        actualizarContrasenia1.setUsuarioRecibido(usuarioRecibidoK);
        */
        
        
        actualizarContrasenia1.setVisible(true);
        if(actualizarContrasenia1.isShowing()){
            System.out.println("Está mostrado");
        }
        
    }//GEN-LAST:event_btn_cambiar_contraseniaMouseClicked

    private void btn_cambiar_contraseniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_contraseniaMouseEntered
        fondo_btn_cambiar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/botones/BotonCambiarContraseniaHover.png")));
    }//GEN-LAST:event_btn_cambiar_contraseniaMouseEntered

    private void btn_cambiar_contraseniaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_contraseniaMouseExited
        fondo_btn_cambiar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/botones/BotonCambiarContrasenia.png")));
    }//GEN-LAST:event_btn_cambiar_contraseniaMouseExited

    
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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cambiar_contrasenia;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton fondo_btn_cambiar_contrasenia;
    private javax.swing.JLabel icono_contrasenia;
    private javax.swing.JLabel icono_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel titulo_sistema;
    public javax.swing.JLabel txt_perfil_usuario;
    // End of variables declaration//GEN-END:variables
}
