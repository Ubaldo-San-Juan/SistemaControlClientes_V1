
package controladores;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ubaldo
 */
public class ControladorTarifa {
    
    public void cambiarTarifa(float tarifa){
        try {
            Conector conexion = new Conector();
            Connection cn = conexion.conectar();
            
            PreparedStatement ps = cn.prepareStatement("UPDATE tarifa SET tarifaPesos=?;");
            
            
            ps.setFloat(1, tarifa);
            ps.executeUpdate();
            
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTarifa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public float obtenerTarifa(){
        float tarifa = 0;
        
        try {
           Conector conexion = new Conector();
            
            Connection cn = conexion.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rst = st.executeQuery("SELECT tarifaPesos FROM tarifa");
            
            while(rst.next()){
                
                tarifa = rst.getFloat(1);  
                System.out.println("Nombre de cliente: " + tarifa);
                
            }

            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTarifa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return tarifa;
    }
}
