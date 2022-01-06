package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class Conexion {
    
    private EstrategiaConexion estrategia;
    
    private static Conexion instancia;
    
    public Conexion() {
        setEstrategia(new Postgresql());
    }
    
    public static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public void setEstrategia(EstrategiaConexion estrategia) {
        this.estrategia = estrategia;
    }
    
    public Connection conectar(){
        return this.estrategia.conectar();
    }
    
}
