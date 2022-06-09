
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ubaldo
 */
public class Conector {
    Connection conectar = null;
    
    public Connection conectar(){
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:gestion_de_clientes.db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return conectar;
    }
    
    public void desconectar(){
        try {
            this.conectar.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
