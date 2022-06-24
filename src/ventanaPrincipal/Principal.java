
package ventanaPrincipal;

import alertas.AlertaPreguntarSalida;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme;
import conexion.Conector;
import controladores.ControladorUsuarios;
import java.awt.Color;
import ventanas.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import ventanaPrincipal.Principal;
import ventanas.ListaDeClientes;

/**
 *
 * @author Ubaldo
 */
public class Principal extends javax.swing.JFrame {

    public static String usuarioDeLaSesion = "";
    public static String primerCaracterUsuario = "";
    public static String nombreDelUsuario = "";

    ListaDeClientes panel01 = new ListaDeClientes();
    Perfil perfil1 = new Perfil();
    AlertaPreguntarSalida preguntarSalida1 = new AlertaPreguntarSalida();
    ClientesRegistrados panel02 = new ClientesRegistrados();
    Configuracion configuracion1 = new Configuracion();

    public Principal() {

        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        showPanel(panel01.getFondo());

        this.fondo_btn_lista_clientes.setSelected(true);
        this.setTitle("Control de clientes");

    }

    private void showPanel(JPanel p) {
        p.setSize(930, 750);
        p.setLocation(0, 0);
        panel_principal.removeAll();
        panel_principal.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        panel_principal.revalidate();
        panel_principal.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        txt_perfil_usuario = new javax.swing.JLabel();
        perfil_usuario = new javax.swing.JLabel();
        txt_bienvenido = new javax.swing.JLabel();
        cerrar_sesion = new javax.swing.JLabel();
        btn_configuracion = new javax.swing.JLabel();
        fondo_btn_configuracion = new javax.swing.JButton();
        btn_usuarios_registrados = new javax.swing.JLabel();
        fondo_btn_usuarios_registrados = new javax.swing.JButton();
        btn_lista_clientes = new javax.swing.JLabel();
        fondo_btn_lista_clientes = new javax.swing.JButton();
        fondo_btn_estadisticas = new javax.swing.JButton();
        panel_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_fondo.setBackground(new java.awt.Color(239, 233, 233));
        panel_fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_fondoMouseClicked(evt);
            }
        });
        panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_menu.setBackground(new java.awt.Color(0, 80, 115));
        panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_perfil_usuario.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        txt_perfil_usuario.setForeground(new java.awt.Color(157, 145, 145));
        txt_perfil_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_perfil_usuario.setText("U");
        txt_perfil_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_perfil_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txt_perfil_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_perfil_usuarioMouseClicked(evt);
            }
        });
        panel_menu.add(txt_perfil_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 90));

        perfil_usuario.setBackground(new java.awt.Color(102, 204, 255));
        perfil_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/IconoUsuario.png"))); // NOI18N
        panel_menu.add(perfil_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 21, 90, 90));

        txt_bienvenido.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt_bienvenido.setForeground(new java.awt.Color(247, 238, 238));
        txt_bienvenido.setText("Bienvenido Ubaldo");
        panel_menu.add(txt_bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        cerrar_sesion.setBackground(new java.awt.Color(204, 204, 204));
        cerrar_sesion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        cerrar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrar_sesion.setText("Cerrar sesión");
        cerrar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_sesionMouseClicked(evt);
            }
        });
        panel_menu.add(cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 700, -1, 26));

        btn_configuracion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_configuracion.setForeground(new java.awt.Color(255, 255, 255));
        btn_configuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_configuracion.setText("Configuración");
        btn_configuracion.setAlignmentX(0.2F);
        btn_configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_configuracionMousePressed(evt);
            }
        });
        panel_menu.add(btn_configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, 60));

        fondo_btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png"))); // NOI18N
        fondo_btn_configuracion.setContentAreaFilled(false);
        panel_menu.add(fondo_btn_configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 240, 80));

        btn_usuarios_registrados.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_usuarios_registrados.setForeground(new java.awt.Color(255, 255, 255));
        btn_usuarios_registrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_usuarios_registrados.setText("Estadisticas");
        btn_usuarios_registrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuarios_registrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuarios_registradosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuarios_registradosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuarios_registradosMouseExited(evt);
            }
        });
        panel_menu.add(btn_usuarios_registrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, 60));

        fondo_btn_usuarios_registrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png"))); // NOI18N
        fondo_btn_usuarios_registrados.setContentAreaFilled(false);
        panel_menu.add(fondo_btn_usuarios_registrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 250, 80));

        btn_lista_clientes.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_lista_clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_lista_clientes.setText("Lista de clientes");
        btn_lista_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_lista_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_lista_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_lista_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_lista_clientesMouseExited(evt);
            }
        });
        panel_menu.add(btn_lista_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 60));

        fondo_btn_lista_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BotonMenu_habilitado.png"))); // NOI18N
        fondo_btn_lista_clientes.setContentAreaFilled(false);
        panel_menu.add(fondo_btn_lista_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 80));

        fondo_btn_estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png"))); // NOI18N
        fondo_btn_estadisticas.setContentAreaFilled(false);
        panel_menu.add(fondo_btn_estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, 80));

        panel_fondo.add(panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 750));

        panel_principal.setBackground(new java.awt.Color(239, 233, 233));

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        panel_fondo.add(panel_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 930, 750));

        getContentPane().add(panel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1211, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_fondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_fondoMouseClicked


    }//GEN-LAST:event_panel_fondoMouseClicked

    private void btn_usuarios_registradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarios_registradosMouseClicked
            this.fondo_btn_lista_clientes.setSelected(false);
            this.fondo_btn_usuarios_registrados.setSelected(true);
            this.fondo_btn_configuracion.setSelected(false);
//        if (new ListaDeClientes().getBandera()) {
//            JOptionPane.showMessageDialog(null, "Hay una sesion encendida");
//        } else {
//            
//        }

        if (fondo_btn_usuarios_registrados.isSelected()) {
            //Encendemos el boton usuarios registrados
            fondo_btn_usuarios_registrados.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_habilitado.png")));
            btn_usuarios_registrados.setForeground(new Color(82, 54, 54));
            //apagamos el boton lista clientes
            fondo_btn_lista_clientes.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
            btn_lista_clientes.setForeground(new Color(255, 255, 255));
            //apagamos el botón configuracion
            fondo_btn_configuracion.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
            btn_configuracion.setForeground(new Color(255, 255, 255));

            //Llamamos el panel usuarios registrados
            showPanel(panel02.getFondo());

        }

    }//GEN-LAST:event_btn_usuarios_registradosMouseClicked


    private void btn_lista_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lista_clientesMouseClicked

        this.fondo_btn_lista_clientes.setSelected(true);
        this.fondo_btn_usuarios_registrados.setSelected(false);
        this.fondo_btn_configuracion.setSelected(false);

        if (fondo_btn_lista_clientes.isSelected()) {
            //Encendemos el boton lista clientes
            fondo_btn_lista_clientes.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_habilitado.png")));
            btn_lista_clientes.setForeground(new Color(82, 54, 54));
            //Reiniciamos los colores a la grafica en clientes registrados
            
            //Apagamos el botón usuarios registrados
            fondo_btn_usuarios_registrados.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
            btn_usuarios_registrados.setForeground(new Color(255, 255, 255));
            //Apagamos el botón configuración
            fondo_btn_configuracion.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
            btn_configuracion.setForeground(new Color(255, 255, 255));

//            if (new ListaDeClientes().getBandera()) {
//                System.out.println("Hay una sesion en uso");
//            } else {
//                //Llamamos el panel lista de clientes
//
//            }
                showPanel(panel01.getFondo());

        }
        //Corregir boton on

    }//GEN-LAST:event_btn_lista_clientesMouseClicked

    private void btn_configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseClicked
            this.fondo_btn_lista_clientes.setSelected(false);
            this.fondo_btn_usuarios_registrados.setSelected(false);
            this.fondo_btn_configuracion.setSelected(true);

//        if (new ListaDeClientes().getBandera()) {
//            JOptionPane.showMessageDialog(null, "Hay una sesion encendida");
//        } else {
//        }

        if (fondo_btn_configuracion.isSelected()) {
            System.out.println("Principal Usuario de la sesion: " + usuarioDeLaSesion);
            configuracion1.usuarioRecibido = usuarioDeLaSesion;
            configuracion1.txt_perfil_usuario.setText(primerCaracterUsuario);
            //Encendemos el botón configuración
            fondo_btn_configuracion.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_habilitado.png")));
            btn_configuracion.setForeground(new Color(82, 54, 54));
            //Apagamos el botón lista clientes
            fondo_btn_lista_clientes.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
            btn_lista_clientes.setForeground(new Color(255, 255, 255));
            //Apagamos el botón usuarios registrados
            fondo_btn_usuarios_registrados.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
            btn_usuarios_registrados.setForeground(new Color(255, 255, 255));

            //Llamamos el panel configuracion
            showPanel(configuracion1.getFondo());
        }
    }//GEN-LAST:event_btn_configuracionMouseClicked

    private void btn_usuarios_registradosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarios_registradosMouseEntered
        if (fondo_btn_lista_clientes.isSelected() || fondo_btn_configuracion.isSelected()) {
            fondo_btn_usuarios_registrados.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_hover.png")));
        }
    }//GEN-LAST:event_btn_usuarios_registradosMouseEntered

    private void btn_usuarios_registradosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarios_registradosMouseExited
        if (fondo_btn_lista_clientes.isSelected() || fondo_btn_configuracion.isSelected()) {
            fondo_btn_usuarios_registrados.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
        }
    }//GEN-LAST:event_btn_usuarios_registradosMouseExited

    private void btn_configuracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseEntered
        if (fondo_btn_lista_clientes.isSelected() || fondo_btn_usuarios_registrados.isSelected()) {
            fondo_btn_configuracion.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_hover.png")));
        }

    }//GEN-LAST:event_btn_configuracionMouseEntered

    private void btn_configuracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseExited
        if (fondo_btn_lista_clientes.isSelected() || fondo_btn_usuarios_registrados.isSelected()) {
            fondo_btn_configuracion.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
        }

    }//GEN-LAST:event_btn_configuracionMouseExited

    private void btn_configuracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMousePressed


    }//GEN-LAST:event_btn_configuracionMousePressed

    private void btn_lista_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lista_clientesMouseEntered

        if (fondo_btn_usuarios_registrados.isSelected() || fondo_btn_configuracion.isSelected()) {
            fondo_btn_lista_clientes.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_hover.png")));
        }
    }//GEN-LAST:event_btn_lista_clientesMouseEntered

    private void btn_lista_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lista_clientesMouseExited
        if (fondo_btn_usuarios_registrados.isSelected() || fondo_btn_configuracion.isSelected()) {
            fondo_btn_lista_clientes.setIcon(new ImageIcon(getClass().getResource("/botones/BotonMenu_desabilitado.png")));
        }
    }//GEN-LAST:event_btn_lista_clientesMouseExited

    private void txt_perfil_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_perfil_usuarioMouseClicked

        perfil1.txt_perfil_usuario.setText(primerCaracterUsuario);
        perfil1.txt_valor_nombre.setText(nombreDelUsuario);
        perfil1.txt_valor_usuario.setText(usuarioDeLaSesion);
        perfil1.setVisible(true);

        if (perfil1.isShowing()) {
            System.out.println("Esta mostrado");
        }
    }//GEN-LAST:event_txt_perfil_usuarioMouseClicked

    private void cerrar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_sesionMouseClicked

        /*preguntarSalida1.setVisible(true);
        if(preguntarSalida1.isShowing()){
            System.out.println("Esta mostrado");   
        }*/
        int opc = JOptionPane.showConfirmDialog(null, "Desea cerrar sesión");
        System.out.println("Valor: " + opc);
        if (opc == 0) {
            this.dispose();
            new IniciarSesion().setVisible(true);
        }
    }//GEN-LAST:event_cerrar_sesionMouseClicked

    public void cerrarVentana() {
        this.dispose();
    }

    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());

        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        /* Set the Nimbus look and feel */
//
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_configuracion;
    private javax.swing.JLabel btn_lista_clientes;
    private javax.swing.JLabel btn_usuarios_registrados;
    private javax.swing.JLabel cerrar_sesion;
    private javax.swing.JButton fondo_btn_configuracion;
    private javax.swing.JButton fondo_btn_estadisticas;
    private javax.swing.JButton fondo_btn_lista_clientes;
    private javax.swing.JButton fondo_btn_usuarios_registrados;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JLabel perfil_usuario;
    public javax.swing.JLabel txt_bienvenido;
    public javax.swing.JLabel txt_perfil_usuario;
    // End of variables declaration//GEN-END:variables

}
