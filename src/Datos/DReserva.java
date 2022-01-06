package Datos;
import DB.Conexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class DReserva {
    private int id;
    private String titulo;
    private String garantia;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    
    private int id_cliente;
    
    private Conexion con;

    public DReserva() {
        this.con = Conexion.getInstancia();
    }

    public int crear(){
        String query = "insert into reservas (id_cliente,titulo,garantia,fecha_inicio,fecha_fin,estado) values(?,?,?,'"+this.fechaInicio+"','"+this.fechaFin+"',?)";
        String query2 = "select id from reservas order by id DESC limit 1";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setInt(1, this.id_cliente);
            pre.setString(2, this.titulo);
            pre.setString(3, this.garantia);
            pre.setString(4, this.estado);
            pre.execute();
            
            pre = con.conectar().prepareStatement(query2);
            ResultSet result = pre.executeQuery();
            result.next();
            int id_reserva = result.getInt(1);
            pre.close();
            return id_reserva;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
    
    public ArrayList listar(){
        ArrayList<Object[]> vestimentas = new ArrayList<>();
        String query = "select reservas.id,reservas.id_cliente, clientes.nombre, reservas.titulo, reservas.garantia, reservas.fecha_inicio, reservas.fecha_fin,reservas.estado from clientes,reservas where clientes.id = reservas.id_cliente order by id ASC";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            ResultSet result = pre.executeQuery();
            while(result.next()){
                vestimentas.add(new Object[]{result.getInt(1),result.getInt(2)+"-"+result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar "+e,"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return vestimentas;
    }
    
    public boolean editar(){
        String query = "update reservas set titulo = ?, garantia = ?, fecha_inicio = '"+this.fechaInicio+"', fecha_fin = '"+this.fechaFin+"', estado = ?, id_cliente = ? where id = ? ";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setString(1, this.titulo);
            pre.setString(2, this.garantia);
            pre.setString(3, this.estado);
            pre.setInt(4, this.id_cliente);
            pre.setInt(5, this.id);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean eliminar(){
        String query = "delete from reservas where id = ?";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setInt(1, this.id);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}
