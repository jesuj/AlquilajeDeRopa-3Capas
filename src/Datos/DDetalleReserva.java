package Datos;
import DB.Conexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Oni
 */
public class DDetalleReserva {
    private int id_reserva;
    private int id_vestimentas;
    private int cantidad;
    
    private Conexion con;
    
    public DDetalleReserva() {
        this.con = Conexion.getInstancia();
    }
    
    public boolean crear(){
        String query = "insert into detalle_reserva values(?,?,?)";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setInt(1, this.id_reserva);
            pre.setInt(2, this.id_vestimentas);
            pre.setInt(3, this.cantidad);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean eliminar(){
        String query = "delete from detalle_reserva where id_reserva = ? and id_vestimenta = ? and cantidad = ? ";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setInt(1, this.id_reserva);
            pre.setInt(2, this.id_vestimentas);
            pre.setInt(3, this.cantidad);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public ArrayList<Object[]> listar(){
        ArrayList<Object[]> detalleprenda = new ArrayList<>();
        String query = "select detalle_reserva.id_vestimenta, vestimentas.nombre, detalle_reserva.cantidad from vestimentas, detalle_reserva where vestimentas.id = detalle_reserva.id_vestimenta and detalle_reserva.id_reserva = ?";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setInt(1, this.id_reserva);
            ResultSet result = pre.executeQuery();
            while(result.next()){
                detalleprenda.add(new Object[]{result.getInt(1)+"-"+result.getString(2),result.getInt(3)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar "+e,"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return detalleprenda;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_vestimentas() {
        return id_vestimentas;
    }

    public void setId_vestimentas(int id_vestimentas) {
        this.id_vestimentas = id_vestimentas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
