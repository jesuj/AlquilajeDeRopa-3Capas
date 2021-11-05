package Datos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class DDetallePrenda {
    private int id_vestimentas;
    private int id_prenda;
    private int stock;
    private String color;
    
    private Connection con;
    
    public DDetallePrenda() {
        Conexion conn = new Conexion();
        con = conn.conectar();
    }
    
    public boolean crear(){
        String query = "insert into detalle_prenda values(?,?,?,?)";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setInt(1, this.id_vestimentas);
            pre.setInt(2, this.id_prenda);
            pre.setInt(3, this.stock);
            pre.setString(4, this.color);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar db "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean eliminar(){
        String query = "delete from detalle_prenda where id_vestimenta = ? and id_prenda = ? and stock = ? and color = ?";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setInt(1, this.id_vestimentas);
            pre.setInt(2, this.id_prenda);
            pre.setInt(3, this.stock);
            pre.setString(4, this.color);
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
        String query = "select detalle_prenda.id_prenda, prendas.nombre, detalle_prenda.stock, detalle_prenda.color from prendas, detalle_prenda where prendas.id = detalle_prenda.id_prenda and detalle_prenda.id_vestimenta = ? order by id ASC";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setInt(1, this.id_vestimentas);
            ResultSet result = pre.executeQuery();
            while(result.next()){
                detalleprenda.add(new Object[]{result.getInt(1)+"-"+result.getString(2),result.getInt(3),result.getString(4)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar "+e,"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return detalleprenda;
    }

    public int getId_vestimentas() {
        return id_vestimentas;
    }

    public void setId_vestimentas(int id_vestimentas) {
        this.id_vestimentas = id_vestimentas;
    }

    public int getId_prenda() {
        return id_prenda;
    }

    public void setId_prenda(int id_prenda) {
        this.id_prenda = id_prenda;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
