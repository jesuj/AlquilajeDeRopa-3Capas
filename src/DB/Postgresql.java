package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class Postgresql implements EstrategiaConexion {
    private final String db = "db_alquilaje";
    private final String user = "postgres";
    private final String password = "Angel41999";
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String driver = "org.postgresql.Driver";
    
    @Override
    public Connection conectar() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url+db,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
}
