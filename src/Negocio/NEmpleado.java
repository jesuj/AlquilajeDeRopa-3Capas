package Negocio;

import Datos.DEmpleado;
import java.util.ArrayList;

/**
 *
 * @author Oni
 */
public class NEmpleado {
    private DEmpleado dempleado;

    public NEmpleado() {
        this.dempleado = new DEmpleado();
    }
    
    public boolean crear(String nombre,String ci,String telefono, String fecha_nacimiento,String sexo){
        this.dempleado.setNombre(nombre);
        this.dempleado.setCi(ci);
        this.dempleado.setTelefono(telefono);
        this.dempleado.setFecha_nacimiento(fecha_nacimiento);
        this.dempleado.setSexo(sexo);
        return this.dempleado.crear();
    } 
    
    public ArrayList<Object[]> listar(){
        return this.dempleado.listar();
    }
    
    public boolean editar(int id,String nombre,String ci,String telefono, String fecha_nacimiento,String sexo){
        this.dempleado.setId(id);
        this.dempleado.setNombre(nombre);
        this.dempleado.setCi(ci);
        this.dempleado.setTelefono(telefono);
        this.dempleado.setFecha_nacimiento(fecha_nacimiento);
        this.dempleado.setSexo(sexo);
        return this.dempleado.editar();
    }
    
    public boolean eliminar(int id){
        this.dempleado.setId(id);
        return this.dempleado.eliminar();
    }
    
}
