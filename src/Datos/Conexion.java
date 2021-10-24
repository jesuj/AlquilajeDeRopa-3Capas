package Datos;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class Conexion {
    
    private Connection con = null;
    
    private String db;
    private String user = "postgres";
    private String password = "Angel41999";
    private String url = "jdbc:postgresql://localhost:5432/db_alquilaje";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
}
