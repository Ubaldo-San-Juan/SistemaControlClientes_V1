
package ventanas;

import conexion.Conector;
import controladores.ControladorUsuarios;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author Ubaldo
 */
public class Registro extends javax.swing.JFrame {

    
    ControladorUsuarios controlador1 = new ControladorUsuarios();
    
    
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Registrarse");
        campo_contrasenia.setEchoChar((char) 0);
        icono_mostra_ocultar_contrasenia.setEnabled(false);
        campo_confirmar_contrasenia.setEchoChar((char) 0);
        icono_mostra_ocultar_confirmar_contrasenia.setEnabled(false);
    }

    boolean selected; //En uso

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        txt_mostrar_ocultar_confirmar_contrasenia = new javax.swing.JLabel();
        icono_mostra_ocultar_contrasenia = new javax.swing.JToggleButton();
        txt_mostrar_ocultar_contrasenia = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        campo_contrasenia = new javax.swing.JPasswordField();
        txt_volver = new javax.swing.JLabel();
        txt_confirmar_contrasenia = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        icono_mostra_ocultar_confirmar_contrasenia = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        Icono_user = new javax.swing.JLabel();
        panel_boton = new javax.swing.JPanel();
        btn_registrarse = new javax.swing.JButton();
        campo_confirmar_contrasenia = new javax.swing.JPasswordField();
        campo_usuario = new javax.swing.JTextField();
        txt_contrasenia = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_usuario = new javax.swing.JLabel();
        txt_registrarse = new javax.swing.JLabel();
        contenedor_01 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_fondo.setBackground(new java.awt.Color(239, 233, 233));
        panel_fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_fondoMouseClicked(evt);
            }
        });
        panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_mostrar_ocultar_confirmar_contrasenia.setForeground(new java.awt.Color(153, 153, 153));
        txt_mostrar_ocultar_confirmar_contrasenia.setText("Mostrar");
        panel_fondo.add(txt_mostrar_ocultar_confirmar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, 20));

        icono_mostra_ocultar_contrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/IconoMostrarContrasenia.png"))); // NOI18N
        icono_mostra_ocultar_contrasenia.setContentAreaFilled(false);
        icono_mostra_ocultar_contrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono_mostra_ocultar_contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icono_mostra_ocultar_contraseniaMouseClicked(evt);
            }
        });
        icono_mostra_ocultar_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono_mostra_ocultar_contraseniaActionPerformed(evt);
            }
        });
        panel_fondo.add(icono_mostra_ocultar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 40, 30));

        txt_mostrar_ocultar_contrasenia.setForeground(new java.awt.Color(153, 153, 153));
        txt_mostrar_ocultar_contrasenia.setText("Mostrar");
        panel_fondo.add(txt_mostrar_ocultar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, 20));

        jSeparator3.setBackground(new java.awt.Color(122, 122, 122));
        panel_fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 230, 10));

        campo_contrasenia.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        campo_contrasenia.setForeground(new java.awt.Color(153, 153, 153));
        campo_contrasenia.setText("Ingresa tu contraseña");
        campo_contrasenia.setBorder(null);
        campo_contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_contraseniaMouseClicked(evt);
            }
        });
        campo_contrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_contraseniaKeyTyped(evt);
            }
        });
        panel_fondo.add(campo_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 230, 40));

        txt_volver.setBackground(new java.awt.Color(0, 80, 115));
        txt_volver.setFont(new java.awt.Font("Calisto MT", 0, 17)); // NOI18N
        txt_volver.setForeground(new java.awt.Color(0, 80, 115));
        txt_volver.setText("Volver");
        txt_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_volverMouseClicked(evt);
            }
        });
        panel_fondo.add(txt_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        txt_confirmar_contrasenia.setFont(new java.awt.Font("Calisto MT", 0, 20)); // NOI18N
        txt_confirmar_contrasenia.setText("Confirmar contraseña");
        panel_fondo.add(txt_confirmar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        campo_nombre.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(153, 153, 153));
        campo_nombre.setText("Ingresa tu nombre");
        campo_nombre.setBorder(null);
        campo_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_nombreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campo_nombreMouseExited(evt);
            }
        });
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });
        campo_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_nombreKeyTyped(evt);
            }
        });
        panel_fondo.add(campo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 230, 40));

        txt_nombre.setFont(new java.awt.Font("Calisto MT", 0, 20)); // NOI18N
        txt_nombre.setText("Nombre");
        panel_fondo.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(122, 122, 122));
        panel_fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 230, 10));

        icono_mostra_ocultar_confirmar_contrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/IconoMostrarContrasenia.png"))); // NOI18N
        icono_mostra_ocultar_confirmar_contrasenia.setContentAreaFilled(false);
        icono_mostra_ocultar_confirmar_contrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono_mostra_ocultar_confirmar_contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icono_mostra_ocultar_confirmar_contraseniaMouseClicked(evt);
            }
        });
        icono_mostra_ocultar_confirmar_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono_mostra_ocultar_confirmar_contraseniaActionPerformed(evt);
            }
        });
        panel_fondo.add(icono_mostra_ocultar_confirmar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 40, 30));

        jSeparator1.setBackground(new java.awt.Color(122, 122, 122));
        panel_fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 230, 10));

        Icono_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/IconoUser.png"))); // NOI18N
        panel_fondo.add(Icono_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 230, 230));

        panel_boton.setBackground(new java.awt.Color(0, 80, 115));
        panel_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_botonMouseEntered(evt);
            }
        });

        btn_registrarse.setBackground(new java.awt.Color(153, 153, 255));
        btn_registrarse.setFont(new java.awt.Font("Nirmala UI", 1, 22)); // NOI18N
        btn_registrarse.setForeground(new java.awt.Color(254, 254, 254));
        btn_registrarse.setText("Registrarse");
        btn_registrarse.setBorderPainted(false);
        btn_registrarse.setContentAreaFilled(false);
        btn_registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrarse.setDefaultCapable(false);
        btn_registrarse.setFocusPainted(false);
        btn_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrarseMouseExited(evt);
            }
        });
        btn_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonLayout = new javax.swing.GroupLayout(panel_boton);
        panel_boton.setLayout(panel_botonLayout);
        panel_botonLayout.setHorizontalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_botonLayout.setVerticalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_fondo.add(panel_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 230, 50));

        campo_confirmar_contrasenia.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        campo_confirmar_contrasenia.setForeground(new java.awt.Color(153, 153, 153));
        campo_confirmar_contrasenia.setText("Confirma tu contraseña");
        campo_confirmar_contrasenia.setBorder(null);
        campo_confirmar_contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_confirmar_contraseniaMouseClicked(evt);
            }
        });
        campo_confirmar_contrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_confirmar_contraseniaKeyTyped(evt);
            }
        });
        panel_fondo.add(campo_confirmar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 230, 40));

        campo_usuario.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        campo_usuario.setForeground(new java.awt.Color(153, 153, 153));
        campo_usuario.setText("Ingresa tu nombre de usuario");
        campo_usuario.setBorder(null);
        campo_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_usuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campo_usuarioMouseExited(evt);
            }
        });
        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });
        campo_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_usuarioKeyTyped(evt);
            }
        });
        panel_fondo.add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 230, 40));

        txt_contrasenia.setFont(new java.awt.Font("Calisto MT", 0, 20)); // NOI18N
        txt_contrasenia.setText("Contraseña");
        panel_fondo.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(122, 122, 122));
        panel_fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 230, 10));

        txt_usuario.setFont(new java.awt.Font("Calisto MT", 0, 20)); // NOI18N
        txt_usuario.setText("Usuario");
        panel_fondo.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        txt_registrarse.setFont(new java.awt.Font("Nirmala UI", 1, 25)); // NOI18N
        txt_registrarse.setText("Registrarse");
        panel_fondo.add(txt_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        contenedor_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_01.png"))); // NOI18N
        contenedor_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contenedor_01MouseClicked(evt);
            }
        });
        contenedor_01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contenedor_01KeyPressed(evt);
            }
        });
        panel_fondo.add(contenedor_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 810, 535));

        getContentPane().add(panel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1211, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_usuarioMouseClicked
        if (campo_usuario.getText().equals("Ingresa tu nombre de usuario")) {
            campo_usuario.setText("");
        }
        if (campo_nombre.getText().equals("")) {
            campo_nombre.setText("Ingresa tu nombre");
        }
        if (campo_contrasenia.getText().equals("")) {
            campo_contrasenia.setEchoChar((char) 0);
            campo_contrasenia.setText("Ingresa tu contraseña");
        }
        if (campo_confirmar_contrasenia.getText().equals("")) {
            campo_confirmar_contrasenia.setEchoChar((char) 0);
            campo_confirmar_contrasenia.setText("Confirma tu contraseña");
        }

        /*
        if(campo_nombre.getText().equals("Ingresa tu nombre")){
            campo_nombre.setText("");
        }
        if(campo_usuario.getText().equals("")){
            campo_usuario.setText("Ingresa tu nombre de usuario");
        }
        if(campo_contrasenia.getText().equals("")){
            campo_contrasenia.setEchoChar((char)0);
            campo_contrasenia.setText("Ingresa tu contraseña");
        }
        if(campo_confirmar_contrasenia.getText().equals("")){
            campo_confirmar_contrasenia.setEchoChar((char)0);
            campo_confirmar_contrasenia.setText("Ingresa tu contraseña");
        }*/
    }//GEN-LAST:event_campo_usuarioMouseClicked

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_usuarioActionPerformed

    private void campo_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_usuarioMouseExited

    }//GEN-LAST:event_campo_usuarioMouseExited

    private void campo_confirmar_contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_confirmar_contraseniaMouseClicked

        if (campo_confirmar_contrasenia.getText().equals("Confirma tu contraseña")) {
            campo_confirmar_contrasenia.setEchoChar('*');
            campo_confirmar_contrasenia.setText("");
        }
        if (campo_nombre.getText().equals("")) {
            campo_nombre.setText("Ingresa tu nombre");
        }
        if (campo_usuario.getText().equals("")) {
            campo_usuario.setText("Ingresa tu nombre de usuario");
        }
        if (campo_contrasenia.getText().equals("")) {
            campo_contrasenia.setEchoChar((char) 0);
            campo_contrasenia.setText("Ingresa tu contraseña");
        }
        if (!campo_usuario.getText().equals("") && campo_confirmar_contrasenia.getText().equals("")) {
            mostrarIconoContrasenia();
        }
    }//GEN-LAST:event_campo_confirmar_contraseniaMouseClicked

    private void panel_botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonMouseEntered

    }//GEN-LAST:event_panel_botonMouseEntered

    private void btn_registrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarseMouseEntered
        panel_boton.setBackground(new Color(0, 80, 80));
    }//GEN-LAST:event_btn_registrarseMouseEntered

    private void btn_registrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarseMouseExited
        panel_boton.setBackground(new Color(0, 80, 115));
    }//GEN-LAST:event_btn_registrarseMouseExited

    private void contenedor_01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contenedor_01KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_contenedor_01KeyPressed

    private void contenedor_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedor_01MouseClicked

        if (campo_usuario.getText().equals("")) {
            campo_usuario.setText("Ingresa tu nombre de usuario");
        }
        if (campo_confirmar_contrasenia.getText().equals("")) {
            campo_confirmar_contrasenia.setEchoChar((char) 0);
            campo_confirmar_contrasenia.setText("Ingresa tu contraseña");
        }
    }//GEN-LAST:event_contenedor_01MouseClicked

    private void panel_fondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_fondoMouseClicked

        if (campo_usuario.getText().equals("")) {
            campo_usuario.setText("Ingresa tu nombre de usuario");
        }
        if (campo_confirmar_contrasenia.getText().equals("")) {
            campo_confirmar_contrasenia.setEchoChar((char) 0);
            campo_confirmar_contrasenia.setText("Ingresa tu contraseña");
        }
    }//GEN-LAST:event_panel_fondoMouseClicked

    private void campo_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_usuarioKeyTyped
        if (campo_usuario.getText().equals("Ingresa tu nombre de usuario")) {
            campo_usuario.setText("");
        }
    }//GEN-LAST:event_campo_usuarioKeyTyped

    private void campo_confirmar_contraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_confirmar_contraseniaKeyTyped

        int cantidad_caracteres = campo_confirmar_contrasenia.getText().length();
        if (cantidad_caracteres >= 1) {
            System.out.println("Entro aqui");
            icono_mostra_ocultar_confirmar_contrasenia.setEnabled(true);
            System.out.println("Mayor o igual a 1");
            txt_mostrar_ocultar_confirmar_contrasenia.setForeground(new Color(0, 0, 0));
        }
        if (cantidad_caracteres <= 0) {
            icono_mostra_ocultar_confirmar_contrasenia.setEnabled(false);
            System.out.println("Menor o igual a 0");
            txt_mostrar_ocultar_confirmar_contrasenia.setForeground(new Color(153, 153, 153));
        }
        if (campo_confirmar_contrasenia.getText().equals("Confirma tu contraseña")) {
            icono_mostra_ocultar_confirmar_contrasenia.setEnabled(false);
            campo_confirmar_contrasenia.setText("");
            txt_mostrar_ocultar_confirmar_contrasenia.setForeground(new Color(153, 153, 153));
        }
        if (campo_confirmar_contrasenia.getText().equals("")) {
            mostrarIconoContrasenia();
            txt_mostrar_ocultar_confirmar_contrasenia.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_campo_confirmar_contraseniaKeyTyped

    private void icono_mostra_ocultar_confirmar_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono_mostra_ocultar_confirmar_contraseniaActionPerformed
        selected = icono_mostra_ocultar_confirmar_contrasenia.getModel().isSelected();
        System.out.println("Selected = " + selected);
        if (selected == true) {
            String password = new String(campo_confirmar_contrasenia.getPassword());
            campo_confirmar_contrasenia.setText(password);
            ocultarIconoContrasenia();
        } else {
            mostrarIconoContrasenia();
        }
    }//GEN-LAST:event_icono_mostra_ocultar_confirmar_contraseniaActionPerformed

    public void mostrarIconoContrasenia() {
        icono_mostra_ocultar_confirmar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/iconos/IconoMostrarContrasenia.png")));
        campo_confirmar_contrasenia.setEchoChar('*');
        txt_mostrar_ocultar_confirmar_contrasenia.setText("Mostrar");
    }

    public void ocultarIconoContrasenia() {
        icono_mostra_ocultar_confirmar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/iconos/IconoOcultarContrasenia.png")));
        campo_confirmar_contrasenia.setEchoChar((char) 0);
        txt_mostrar_ocultar_confirmar_contrasenia.setText("Ocultar");
    }
    private void icono_mostra_ocultar_confirmar_contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icono_mostra_ocultar_confirmar_contraseniaMouseClicked

    }//GEN-LAST:event_icono_mostra_ocultar_confirmar_contraseniaMouseClicked

    private void btn_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarseActionPerformed

    private void campo_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_nombreMouseClicked
        if (campo_nombre.getText().equals("Ingresa tu nombre")) {
            campo_nombre.setText("");
        }
        if (campo_usuario.getText().equals("")) {
            campo_usuario.setText("Ingresa tu nombre de usuario");
        }
        if (campo_contrasenia.getText().equals("")) {
            campo_contrasenia.setEchoChar((char) 0);
            campo_contrasenia.setText("Ingresa tu contraseña");
        }
        if (campo_confirmar_contrasenia.getText().equals("")) {
            campo_confirmar_contrasenia.setEchoChar((char) 0);
            campo_confirmar_contrasenia.setText("Ingresa tu contraseña");
        }
    }//GEN-LAST:event_campo_nombreMouseClicked

    private void campo_nombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_nombreMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreMouseExited

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void campo_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_nombreKeyTyped
        if (campo_nombre.getText().equals("Ingresa tu nombre")) {
            campo_nombre.setText("");
        }
    }//GEN-LAST:event_campo_nombreKeyTyped

    private void campo_contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_contraseniaMouseClicked
        if (campo_contrasenia.getText().equals("Ingresa tu contraseña")) {
            campo_contrasenia.setEchoChar('*');
            campo_contrasenia.setText("");
        }
        if (campo_nombre.getText().equals("")) {
            campo_nombre.setText("Ingresa tu nombre");
        }
        if (campo_usuario.getText().equals("")) {
            campo_usuario.setText("Ingresa tu nombre de usuario");
        }
        if (campo_confirmar_contrasenia.getText().equals("")) {
            campo_confirmar_contrasenia.setEchoChar((char) 0);
            campo_confirmar_contrasenia.setText("Confirma tu contraseña");
        }
    }//GEN-LAST:event_campo_contraseniaMouseClicked

    private void campo_contraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_contraseniaKeyTyped
        int cantidad_caracteres = campo_contrasenia.getText().length();
        if (cantidad_caracteres >= 1) {
            icono_mostra_ocultar_contrasenia.setEnabled(true);
            txt_mostrar_ocultar_contrasenia.setForeground(new Color(0, 0, 0)); //Texto de color oscuro
        }
        if (cantidad_caracteres <= 0) {
            icono_mostra_ocultar_contrasenia.setEnabled(false);
            txt_mostrar_ocultar_contrasenia.setForeground(new Color(153, 153, 153)); //Texto de color claro
        }
        if (campo_contrasenia.getText().equals("Ingresa tu contraseña")) {
            icono_mostra_ocultar_contrasenia.setEnabled(false);
            campo_contrasenia.setText("");
            txt_mostrar_ocultar_contrasenia.setForeground(new Color(153, 153, 153));
        }
        if (campo_contrasenia.getText().equals("")) {
            icono_mostra_ocultar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/iconos/IconoMostrarContrasenia.png")));
            campo_contrasenia.setEchoChar('*');
            txt_mostrar_ocultar_contrasenia.setText("Mostrar");
        }
    }//GEN-LAST:event_campo_contraseniaKeyTyped

    private void icono_mostra_ocultar_contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icono_mostra_ocultar_contraseniaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icono_mostra_ocultar_contraseniaMouseClicked

    private void icono_mostra_ocultar_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono_mostra_ocultar_contraseniaActionPerformed
        // TODO add your handling code here:
        selected = icono_mostra_ocultar_contrasenia.getModel().isSelected();
        if (selected == true) {
            String password = new String(campo_contrasenia.getPassword());
            campo_contrasenia.setText(password);
            icono_mostra_ocultar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/iconos/IconoOcultarContrasenia.png")));
            campo_contrasenia.setEchoChar((char) 0);
            txt_mostrar_ocultar_contrasenia.setText("Ocultar");
        } else {
            icono_mostra_ocultar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/iconos/IconoMostrarContrasenia.png")));
            campo_contrasenia.setEchoChar('*');
            txt_mostrar_ocultar_contrasenia.setText("Mostrar");
        }
    }//GEN-LAST:event_icono_mostra_ocultar_contraseniaActionPerformed

    private void btn_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarseMouseClicked

        String campoUsuario = campo_usuario.getText();
        String campoNombre = campo_nombre.getText();
        String campoContrasenia = campo_contrasenia.getText();
        String campoConfirmarContrasenia = campo_confirmar_contrasenia.getText();

        System.out.println(campoContrasenia);
        System.out.println(campoConfirmarContrasenia);
        if (campoContrasenia.equals(campoConfirmarContrasenia)) {
            System.out.println("Contraseñas correctas");
            controlador1.guardarUsuarioNuevo(campoUsuario, campoNombre, campoContrasenia);
            this.dispose();
            new IniciarSesion().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }

    }//GEN-LAST:event_btn_registrarseMouseClicked

    private void txt_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_volverMouseClicked
        this.dispose();
        new IniciarSesion().setVisible(true);
    }//GEN-LAST:event_txt_volverMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_user;
    private javax.swing.JButton btn_registrarse;
    private javax.swing.JPasswordField campo_confirmar_contrasenia;
    private javax.swing.JPasswordField campo_contrasenia;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel contenedor_01;
    private javax.swing.JToggleButton icono_mostra_ocultar_confirmar_contrasenia;
    private javax.swing.JToggleButton icono_mostra_ocultar_contrasenia;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panel_boton;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JLabel txt_confirmar_contrasenia;
    private javax.swing.JLabel txt_contrasenia;
    private javax.swing.JLabel txt_mostrar_ocultar_confirmar_contrasenia;
    private javax.swing.JLabel txt_mostrar_ocultar_contrasenia;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_registrarse;
    private javax.swing.JLabel txt_usuario;
    private javax.swing.JLabel txt_volver;
    // End of variables declaration//GEN-END:variables

    
}
