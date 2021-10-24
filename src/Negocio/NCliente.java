package Negocio;

import Datos.DCliente;
import java.util.ArrayList;

/**
 *
 * @author Oni
 */
public class NCliente {

    private DCliente dcliente;

    public NCliente() {
        this.dcliente = new DCliente();
    }
    
    public void crear(String nombre,String ci,String telefono, String fecha_nacimiento,String sexo,String direccion ){
        this.dcliente.setNombre(nombre);
        this.dcliente.setCi(ci);
        this.dcliente.setTelefono(telefono);
        this.dcliente.setFecha_nacimiento(fecha_nacimiento);
        this.dcliente.setSexo(sexo);
        this.dcliente.setDireccion(direccion);
        this.dcliente.crear();
    } 
    
    public ArrayList<Object[]> listar(){
        return this.dcliente.listar();
    }
    
    public void editar(int id,String nombre,String ci,String telefono, String fecha_nacimiento,String sexo,String direccion ){
        this.dcliente.setId(id);
        this.dcliente.setNombre(nombre);
        this.dcliente.setCi(ci);
        this.dcliente.setTelefono(telefono);
        this.dcliente.setFecha_nacimiento(fecha_nacimiento);
        this.dcliente.setSexo(sexo);
        this.dcliente.setDireccion(direccion);
        this.dcliente.editar();
    }
    
    public void eliminar(int id){
        this.dcliente.setId(id);
        this.dcliente.eliminar();
    }
    
}
