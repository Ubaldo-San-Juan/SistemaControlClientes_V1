/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conexion.Conector;
import controladores.Controlador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ventanaPrincipal.Principal;

/**
 *
 * @author Ubaldo
 */
public class ActualizarContrasenia extends javax.swing.JFrame {
    public static String usuarioRecibido = "";
   
    Controlador controlador1 = new Controlador();
    
    public ActualizarContrasenia() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        btn_cambiar_contrasenia = new javax.swing.JLabel();
        campo_cambiar_contrasenia = new javax.swing.JButton();
        campo_ingresar_nueva_contrasenia = new javax.swing.JTextField();
        txt_ingresar_nueva_contrasenia = new javax.swing.JLabel();
        campo_ingresar_contrasenia = new javax.swing.JTextField();
        txt_ingresar_contrasenia = new javax.swing.JLabel();
        txt_cambiar_contrasenia = new javax.swing.JLabel();
        contenedor_04 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(239, 233, 233));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cambiar_contrasenia.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_cambiar_contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        btn_cambiar_contrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cambiar_contrasenia.setText("Cambiar contraseña");
        btn_cambiar_contrasenia.setToolTipText("");
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
        fondo.add(btn_cambiar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 364, 230, 50));

        campo_cambiar_contrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BotonCambiarContrasenia.png"))); // NOI18N
        campo_cambiar_contrasenia.setContentAreaFilled(false);
        fondo.add(campo_cambiar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 230, 60));

        campo_ingresar_nueva_contrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        campo_ingresar_nueva_contrasenia.setCaretColor(new java.awt.Color(112, 112, 112));
        fondo.add(campo_ingresar_nueva_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 280, 40));

        txt_ingresar_nueva_contrasenia.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        txt_ingresar_nueva_contrasenia.setForeground(new java.awt.Color(142, 50, 50));
        txt_ingresar_nueva_contrasenia.setText("Ingresa tu nueva contraseña");
        txt_ingresar_nueva_contrasenia.setToolTipText("");
        fondo.add(txt_ingresar_nueva_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        campo_ingresar_contrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        campo_ingresar_contrasenia.setCaretColor(new java.awt.Color(112, 112, 112));
        fondo.add(campo_ingresar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 40));

        txt_ingresar_contrasenia.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        txt_ingresar_contrasenia.setForeground(new java.awt.Color(142, 50, 50));
        txt_ingresar_contrasenia.setText("Ingresa tu contraseña");
        txt_ingresar_contrasenia.setToolTipText("");
        fondo.add(txt_ingresar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        txt_cambiar_contrasenia.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        txt_cambiar_contrasenia.setForeground(new java.awt.Color(36, 36, 36));
        txt_cambiar_contrasenia.setText("Cambiar contraseña");
        fondo.add(txt_cambiar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        contenedor_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenedores/Contenedor_04.png"))); // NOI18N
        fondo.add(contenedor_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 430, 450));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_cambiar_contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_contraseniaMouseClicked
        
        String contraseniaAnterior = campo_ingresar_contrasenia.getText();
        String nuevaContrasenia = campo_ingresar_nueva_contrasenia.getText();
        System.out.println("Actualizar Usuario recibido: " + usuarioRecibido);
        System.out.println("Contrasenia anterior: " + contraseniaAnterior);
        System.out.println("Nueva contraseña: " + nuevaContrasenia);
        
        
        controlador1.verificarContrasenia(usuarioRecibido, contraseniaAnterior, nuevaContrasenia);

            if (controlador1.isSiExiste()) {
                System.out.println("Contrasenia correcta");
                controlador1.actualizarContrasenia(nuevaContrasenia, usuarioRecibido);
                this.setVisible(false);
                this.dispose();
            }
        

        /*
            crearArchivo(); //Funcion que crear el archivo contrasenia.txt
            
            leerArchivo(); //Función para leer el archivo contrasenia.txt
            String contrasenia_anterior = campo_ingresar_contrasenia.getText();
            String nueva_contrasenia = campo_ingresar_nueva_contrasenia.getText();
            
            
            
            cambiarContrasenia(contrasenia_anterior, nueva_contrasenia); //Función para cambiar la contraseña
            
         */
    }//GEN-LAST:event_btn_cambiar_contraseniaMouseClicked

    private void btn_cambiar_contraseniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_contraseniaMouseEntered
        campo_cambiar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/botones/BotonCambiarContraseniaHover.png")));
    }//GEN-LAST:event_btn_cambiar_contraseniaMouseEntered

    private void btn_cambiar_contraseniaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_contraseniaMouseExited
        campo_cambiar_contrasenia.setIcon(new ImageIcon(getClass().getResource("/botones/BotonCambiarContrasenia.png")));
    }//GEN-LAST:event_btn_cambiar_contraseniaMouseExited

    
    public void crearArchivo() {

        try {

            File miArchivo = new File("contrasenia.txt");

            if (miArchivo.createNewFile()) {
                System.out.println("El archivo fue creado con el nombre de: " + miArchivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException x) {
            System.out.println("Un error ha ocurrido");
            x.printStackTrace();
        }
    }

    public void leerArchivo() {
        try {
            File myFile = new File("contrasenia.txt");

            //create the scanner object
            Scanner readFile = new Scanner(myFile);

            while (readFile.hasNextLine()) {
                String contrasenia_a_comprobar = readFile.nextLine();
                System.out.println(contrasenia_a_comprobar);
            }
            readFile.close();
        } catch (FileNotFoundException x) {
            System.out.println("Un error ha ocurrido");
            x.printStackTrace();
        }
    }

    public void cambiarContrasenia(String contrasenia_anterior, String nueva_contrasenia) {
        //Para obtener la contrasenia a comprobar, tenemos que leer la contrasenia dentro del archivo contrasenia.txt
        try {
            File myFile = new File("contrasenia.txt");

            Scanner readFile = new Scanner(myFile);
            //Leemos la contrasenia dentro del archivo contrasenia.txt
            while (readFile.hasNextLine()) {
                String contrasenia_a_comprobar = readFile.nextLine();
                System.out.println(contrasenia_a_comprobar);

                if (contrasenia_anterior.equals(contrasenia_a_comprobar)) {//Las contraseñas coincide
                    try {

                        FileWriter actualizarContrasenia = new FileWriter("contrasenia.txt");

                        //Agregar la contrasenia nueva a este archivo
                        actualizarContrasenia.write(nueva_contrasenia);

                        //Cerramos el archivo contrasenia.txt
                        actualizarContrasenia.close();
                        System.out.println("Contrasenia agregada");
                    } catch (IOException x) {
                        System.out.println("Un error ha ocurrido.");
                        x.printStackTrace();
                    }
                } else {//Las contraseñas no coinciden
                    JOptionPane.showMessageDialog(null, "Ingrese la contrasenia correcta");
                }
            }
            readFile.close();
        } catch (FileNotFoundException x) {
            System.out.println("Un error ha ocurrido");
            x.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(ActualizarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarContrasenia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cambiar_contrasenia;
    private javax.swing.JButton campo_cambiar_contrasenia;
    private javax.swing.JTextField campo_ingresar_contrasenia;
    private javax.swing.JTextField campo_ingresar_nueva_contrasenia;
    private javax.swing.JLabel contenedor_04;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel txt_cambiar_contrasenia;
    private javax.swing.JLabel txt_ingresar_contrasenia;
    private javax.swing.JLabel txt_ingresar_nueva_contrasenia;
    // End of variables declaration//GEN-END:variables
}
