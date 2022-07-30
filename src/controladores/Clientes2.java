
package controladores;

import conexion.Conector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Ubaldo
 */
public class Clientes2 {
    String mensaje = "Seleccione un nombre";
    int id = 1;
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
                modelo.addElement(new Clientes(Integer.parseInt(idCliente), nombreCliente));
                
            }

            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return modelo; 
    }
    
    public int getId(){
        return id;
    }
}
