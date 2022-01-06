package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class Mysql implements EstrategiaConexion{
    private final String db = "db_alquilaje";
    private final String user = "root";
    private final String password = "Angel41999";
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    
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
