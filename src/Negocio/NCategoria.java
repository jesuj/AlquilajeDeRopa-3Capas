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
    
    public void crear(String nombre, String descripcion){
        this.dcategoria.setNombre(nombre);
        this.dcategoria.setDescripcion(descripcion);
        this.dcategoria.crear();
    } 
    
    public ArrayList<Object[]> listar(){
        return this.dcategoria.listar();
    }
    
    public void editar(int id, String nombre,String descripcion){
        this.dcategoria.setId(id);
        this.dcategoria.setNombre(nombre);
        this.dcategoria.setDescripcion(descripcion);
        this.dcategoria.editar();
    }
    
    public void eliminar(int id){
        this.dcategoria.setId(id);
        this.dcategoria.eliminar();
    }
}
