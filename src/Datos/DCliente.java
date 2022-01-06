package Datos;

import DB.Conexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Oni
 */
public class DCliente {

    private int id;
    private String nombre;
    private String ci;
    private String telefono;
    private String fecha_nacimiento;
    private String sexo;
    private String direccion;

    private Conexion con;

    public DCliente() {
        this.con = Conexion.getInstancia();
    }

    public boolean crear() {
        String query = "insert into clientes (nombre,ci,telefono,fecha_nacimiento,sexo,direccion) values(?,?,?,'"+this.fecha_nacimiento+"'," + this.sexo + ",?)";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setString(1, this.nombre);
            pre.setString(2, this.ci);
            pre.setString(3, this.telefono);
            pre.setString(4, this.direccion);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar db " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public ArrayList<Object[]> listar() {
        ArrayList<Object[]> clientes = new ArrayList<>();
        String query = "select * from clientes order by id ASC";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            ResultSet result = pre.executeQuery();
            while (result.next()) {
                clientes.add(new Object[]{result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getString(5),
                    result.getString(6), result.getString(7)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar " + e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return clientes;
    }

    public boolean editar() {
        String query = "update clientes set nombre = ?, ci = ?, telefono = ?, fecha_nacimiento = '"+this.fecha_nacimiento+"', sexo = " + this.sexo + ", direccion = ? where id = ? ";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setString(1, this.nombre);
            pre.setString(2, this.ci);
            pre.setString(3, this.telefono);
            pre.setString(4, this.direccion);
            pre.setInt(5, this.id);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean eliminar() {
        String query = "delete from clientes where id = ?";
        try {
            PreparedStatement pre = con.conectar().prepareStatement(query);
            pre.setInt(1, this.id);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e, "Error", JOptionPane.ERROR_MESSAGE);
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
