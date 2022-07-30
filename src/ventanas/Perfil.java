
package ventanas;

import javax.swing.ImageIcon;
import ventanaPrincipal.Principal;

/**
 *
 * @author Ubaldo
 */
public class Perfil extends javax.swing.JFrame {

    
    /**
     * Creates new form Perfil
     */
    public Perfil() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/Icono.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Perfil");
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
        panel_01 = new javax.swing.JPanel();
        txt_valor_usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JLabel();
        separator_3 = new javax.swing.JSeparator();
        txt_valor_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        separator_2 = new javax.swing.JSeparator();
        txt_valor_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        separator_1 = new javax.swing.JSeparator();
        volver = new javax.swing.JLabel();
        txt_perfil_usuario = new javax.swing.JLabel();
        campo_contenedor = new javax.swing.JLabel();
        fondo_perfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(239, 233, 233));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_01.setBackground(new java.awt.Color(0, 80, 115));
        panel_01.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_valor_usuario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_valor_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_valor_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_valor_usuario.setText("Ubaldo69");
        panel_01.add(txt_valor_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 110, -1));

        txt_usuario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_usuario.setText("Usuario:");
        panel_01.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 70, -1));
        panel_01.add(separator_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 190, 10));

        txt_valor_nombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_valor_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_valor_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_valor_nombre.setText("Ubaldo SJ");
        panel_01.add(txt_valor_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 120, -1));

        txt_nombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_nombre.setText("Nombre:");
        panel_01.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 70, -1));
        panel_01.add(separator_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 10));

        txt_valor_id.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_valor_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_valor_id.setText("1");
        panel_01.add(txt_valor_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 60, -1));

        txt_id.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setText("ID:");
        panel_01.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));
        panel_01.add(separator_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, 10));

        volver.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(247, 238, 238));
        volver.setText("Volver");
        volver.setToolTipText("");
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        panel_01.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 60, 20));

        txt_perfil_usuario.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        txt_perfil_usuario.setForeground(new java.awt.Color(157, 145, 145));
        txt_perfil_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_perfil_usuario.setText("U");
        txt_perfil_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_perfil_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_01.add(txt_perfil_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 90, 90));

        campo_contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_03.png"))); // NOI18N
        panel_01.add(campo_contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 250, 230));

        fondo_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/IconoUsuario.png"))); // NOI18N
        panel_01.add(fondo_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 90, 90));

        fondo.add(panel_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 360, 460));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked

        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    public void setIdUsuario(int idUsuario){
        txt_valor_id.setText(String.valueOf(idUsuario));
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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campo_contenedor;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel fondo_perfil;
    private javax.swing.JPanel panel_01;
    private javax.swing.JSeparator separator_1;
    private javax.swing.JSeparator separator_2;
    private javax.swing.JSeparator separator_3;
    private javax.swing.JLabel txt_id;
    private javax.swing.JLabel txt_nombre;
    public javax.swing.JLabel txt_perfil_usuario;
    private javax.swing.JLabel txt_usuario;
    private javax.swing.JLabel txt_valor_id;
    public javax.swing.JLabel txt_valor_nombre;
    public javax.swing.JLabel txt_valor_usuario;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
