package controladores;

import com.sun.javafx.scene.layout.region.Margins;
import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
import ventanas.ActualizarContrasenia;
import ventanas.IniciarSesion;
import ventanas.ListaDeClientes;
import ventanas.Registro;

/**
 *
 * @author Ubaldo
 */
public class ControladorClientes {


    public DefaultComboBoxModel llenarComboboxClientes() {
       
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccionar cliente");
        try {

            Conector conexion = new Conector();
            
            Connection cn = conexion.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rst = st.executeQuery("SELECT id_cliente, nombre FROM clientes");
            
            while(rst.next()){
                
                String idCliente = rst.getString(1);
                String nombreCliente = rst.getString(2);
                String agregarAModelo = idCliente + ") "+ nombreCliente;
                System.out.println("Nombre de cliente: " + nombreCliente);
//                modelo.addElement(agregarAModelo);
                modelo.addElement(new Clientes(Integer.parseInt(idCliente), nombreCliente));
                
            }

            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return modelo; 
    }

    
    public DefaultTableModel llenarJTable(){
        
        //Evitar que las celdas puedan ser editadas
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int filas, int columnas){
                return false;
            }
        };
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        try {
            Conector conexion = new Conector();
            Connection cn = conexion.conectar();
            Statement st = cn.createStatement();
            ResultSet rst = st.executeQuery("SELECT * FROM clientes");
            while(rst.next()){
                Object dato [] = new Object[2];
                for(int i= 0; i<2; i++){
                    dato[i] = rst.getString(i+1); // dato contiene todos los datos de los clientes
                }
                modelo.addRow(dato);
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE, null, ex);            
        }
        return modelo;
    }
    
    
    public void agregarClienteNuevo(String nombreCliente){
        try {
            Conector conexion = new Conector();
            Connection cn = conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO clientes(nombre) VALUES(?);");
            ps.setString(1, nombreCliente);
            ps.executeUpdate();
            
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
