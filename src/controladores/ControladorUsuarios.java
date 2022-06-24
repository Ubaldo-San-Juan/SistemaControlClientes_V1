package controladores;

import alertas.AlertaInicioFallidoLogin;
import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ventanaPrincipal.Principal;
import ventanas.ActualizarContrasenia;
import ventanas.IniciarSesion;
import ventanas.ListaDeClientes;
import ventanas.Perfil;
import ventanas.Registro;

/**
 *
 * @author Ubaldo
 */
public class ControladorUsuarios {

    boolean siExiste = false;
    String usuarioDeLaSesion = "";
    String primerCaracterUsuario = "";
    String nombreDelUsuario = "";

    Principal principal1 = new Principal();
    AlertaInicioFallidoLogin inicioFallido1 = new AlertaInicioFallidoLogin();
    Perfil perfil1 = new Perfil();
    
    public void iniciarSesion(String campoUsuario, String campoContrasenia) {

        try {

            Conector conexion = new Conector();
            Connection cn = conexion.conectar();

            Statement st = cn.createStatement();
            ResultSet rst = st.executeQuery("SELECT * FROM usuarios WHERE usuario='" + campoUsuario + "' AND contrasenia='" + campoContrasenia + "';");

            if (rst.next()) {
                this.usuarioDeLaSesion = rst.getString(1);
                this.nombreDelUsuario = rst.getString(2);
                this.siExiste = true;

                principal1.setVisible(true);
                principal1.txt_bienvenido.setText("Bienvenido " + usuarioDeLaSesion);

                primerCaracterUsuario = String.valueOf(usuarioDeLaSesion.charAt(0)).toUpperCase();
                principal1.txt_perfil_usuario.setText(primerCaracterUsuario);
                
                
                principal1.usuarioDeLaSesion = usuarioDeLaSesion;
                principal1.nombreDelUsuario = nombreDelUsuario;
                principal1.primerCaracterUsuario = primerCaracterUsuario;
                conexion.desconectar();
            } else {
                inicioFallido1.setVisible(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void otorgarDatosPerfil(){
        perfil1.txt_perfil_usuario.setText(primerCaracterUsuario);
        perfil1.txt_valor_nombre.setText(nombreDelUsuario);
        perfil1.txt_valor_usuario.setText(usuarioDeLaSesion);
    }
    
    public void guardarUsuarioNuevo(String campoUsuario, String campoNombre, String campoContrasenia) {

        try {
            Conector conexion = new Conector();
            Connection cn = conexion.conectar();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO usuarios VALUES(?, ?, ?);");

            ps.setString(1, campoUsuario);
            ps.setString(2, campoNombre);
            ps.setString(3, campoContrasenia);
            ps.executeUpdate();

            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void verificarContrasenia(String usuarioActualizar, String contraseniaAnterior, String nuevaContrasenia) {
        String usuarioActualizar_ = usuarioActualizar;
        String nuevaContrasenia_ = nuevaContrasenia;
        System.out.println("Usuario a actualizar: " + usuarioActualizar);
        System.out.println("Contrasenia: " + contraseniaAnterior);
        System.out.println("Nueva contrasenia: " + nuevaContrasenia);

        try {
            //String contraseniaAnterior = campoIngresarcontrasenia;
            Conector conexion = new Conector();
            
            Connection cn = conexion.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rst = st.executeQuery("SELECT contrasenia FROM usuarios WHERE usuario='" + usuarioActualizar + "'");
            
            String contraseniaDataBase = rst.getString(1);  
            conexion.desconectar();
            
            System.out.println("Contraseña en base de datos: " + contraseniaDataBase);

            if (contraseniaAnterior.equals(contraseniaDataBase)) {
                siExiste = true;
                //JOptionPane.showMessageDialog(null, "Contraseña correcta");
                   
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al ingresar la contraseña");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarContrasenia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarContrasenia(String nuevaContrasenia, String usuarioActualizar) {
        
        try {
            Conector conexion = new Conector();
            Connection cn = conexion.conectar();
            
            PreparedStatement ps = cn.prepareStatement("UPDATE usuarios SET contrasenia =? WHERE usuario =?;");
            
            
            ps.setString(1, nuevaContrasenia);
            ps.setString(2, usuarioActualizar);
            ps.executeUpdate();
            
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isSiExiste() {
        return siExiste;
    }

    public String getUsuarioDeLaSesion() {
        return usuarioDeLaSesion;
    }

}
