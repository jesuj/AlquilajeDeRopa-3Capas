package Negocio;

import Datos.DCategoria;
import java.util.ArrayList;

/**
 *
 * @author Oni
 */
public class NCategoria {
    private DCategoria dcategoria;

    public NCategoria() {
        this.dcategoria = new DCategoria();
    }
    
    public boolean crear(String nombre, String descripcion){
        this.dcategoria.setNombre(nombre);
        this.dcategoria.setDescripcion(descripcion);
        return this.dcategoria.crear();
    } 
    
    public ArrayList<Object[]> listar(){
        return this.dcategoria.listar();
    }
    
    public boolean editar(int id, String nombre,String descripcion){
        this.dcategoria.setId(id);
        this.dcategoria.setNombre(nombre);
        this.dcategoria.setDescripcion(descripcion);
        return this.dcategoria.editar();
    }
    
    public boolean eliminar(int id){
        this.dcategoria.setId(id);
        return this.dcategoria.eliminar();
    }
}
