package Datos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class DCategoria {
    private int id;
    private String nombre;
    private String descripcion;

    private Connection con;

    public DCategoria() {
        Conexion conn = new Conexion();
        con = conn.conectar();
    }
    
    public boolean crear(){
        String query = "insert into categorias (nombre,descripcion) values(?,?)";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, this.nombre);
            pre.setString(2, this.descripcion);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public ArrayList listar(){
        ArrayList<Object[]> categorias = new ArrayList<>();
        String query = "select * from categorias order by id ASC";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            ResultSet result = pre.executeQuery();
            while(result.next()){
                categorias.add(new Object[]{result.getInt(1),result.getString(2),result.getString(3)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar "+e,"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return categorias;
    }
    
    public boolean editar(){
        String query = "update categorias set nombre = ?, descripcion = ? where id = ? ";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, this.nombre);
            pre.setString(2, this.descripcion);
            pre.setInt(3, this.id);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean eliminar(){
        String query = "delete from categorias where id = ?";
        try {
            PreparedStatement pre = con.prepareStatement(query);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }  
}
