
package controladores;

import conexion.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ubaldo
 */
public class ControladorInventario {
    public void agregarInventario(int idUsuario, int idCliente, int horas, int minutos, float ingreso, int diaNum, String diaNombre, String mesNombre, int anio){
        try {
            Conector conexion = new Conector();
            Connection cn = conexion.conectar();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO inventario(idUsuario, idCliente, horas, minutos, ingreso, diaNum, diaNombre, mesNombre, anio) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);");

            ps.setInt(1, idUsuario);
            ps.setInt(2, idCliente);
            ps.setInt(3, horas);
            ps.setInt(4, minutos);
            ps.setFloat(5, ingreso);
            ps.setInt(6, diaNum);
            ps.setString(7, diaNombre);
            ps.setString(8, mesNombre);
            ps.setInt(9, anio);
            ps.executeUpdate();

            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInventario.class.getName()).log(Level.ALL.SEVERE, null, ex);
        }
    }
}
