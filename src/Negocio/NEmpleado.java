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
    
    public void crear(String nombre,String ci,String telefono, String fecha_nacimiento,String sexo){
        this.dempleado.setNombre(nombre);
        this.dempleado.setCi(ci);
        this.dempleado.setTelefono(telefono);
        this.dempleado.setFecha_nacimiento(fecha_nacimiento);
        this.dempleado.setSexo(sexo);
        this.dempleado.crear();
    } 
    
    public ArrayList<Object[]> listar(){
        return this.dempleado.listar();
    }
    
    public void editar(int id,String nombre,String ci,String telefono, String fecha_nacimiento,String sexo){
        this.dempleado.setId(id);
        this.dempleado.setNombre(nombre);
        this.dempleado.setCi(ci);
        this.dempleado.setTelefono(telefono);
        this.dempleado.setFecha_nacimiento(fecha_nacimiento);
        this.dempleado.setSexo(sexo);
        this.dempleado.editar();
    }
    
    public void eliminar(int id){
        this.dempleado.setId(id);
        this.dempleado.eliminar();
    }
    
}
