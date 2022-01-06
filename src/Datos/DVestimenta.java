package Datos;

import DB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class DVestimenta {
    private int id;
    private String nombre;
    private int cantidad;
    private int precio;
    private int id_empleado;
    private int id_categoria;
    
    private Conexion con;

    public DVestimenta() {
        this.con = Conexion.getInstancia();
    }

    public int crear(){
        String query = "insert into vestimentas (nombre,cantidad,precio,id_empleado,id_categoria) values(?,?,?,?,?)";
        String query2 = "select id from vestimentas order by id DESC limit 1";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setString(1, this.nombre);
            pre.setInt(2, this.cantidad);
            pre.setInt(3, this.precio);
            pre.setInt(4, this.id_empleado);
            pre.setInt(5, this.id_categoria);
            pre.execute();
            
            pre = con.conectar().prepareStatement(query2);
            ResultSet result = pre.executeQuery();
            result.next();
            int id_vestimenta = result.getInt(1);
            pre.close();
            return id_vestimenta;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
    
    public ArrayList listar(){
        ArrayList<Object[]> vestimentas = new ArrayList<>();
        String query = "select vestimentas.id,vestimentas.nombre, vestimentas.cantidad,vestimentas.precio,vestimentas.id_empleado,empleados.nombre, vestimentas.id_categoria, categorias.nombre from vestimentas,categorias,empleados where id_empleado = empleados.id and id_categoria = categorias.id  order by id ASC";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            ResultSet result = pre.executeQuery();
            while(result.next()){
                vestimentas.add(new Object[]{result.getInt(1),result.getString(2),result.getInt(3),result.getInt(4),result.getInt(5)+"-"+result.getString(6),result.getInt(7)+"-"+result.getString(8)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar "+e,"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return vestimentas;
    }
    
    public boolean editar(){
        String query = "update vestimentas set nombre = ?, cantidad = ?, precio = ?, id_empleado = ?, id_categoria = ? where id = ? ";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setString(1, this.nombre);
            pre.setInt(2, this.cantidad);
            pre.setInt(3, this.precio);
            pre.setInt(4, this.id_empleado);
            pre.setInt(5, this.id_categoria);
            pre.setInt(6, this.id);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean eliminar(){
        String query = "delete from vestimentas where id = ?";
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
}
