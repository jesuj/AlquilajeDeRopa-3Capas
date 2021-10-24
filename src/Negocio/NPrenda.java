package Negocio;

import Datos.DPrenda;
import java.util.ArrayList;

/**
 *
 * @author Oni
 */
public class NPrenda {

    private DPrenda dprenda;

    public NPrenda() {
        this.dprenda = new DPrenda();
    }
    
    public void crear(String nombre,String tipo, String descripcion){
        this.dprenda.setNombre(nombre);
        this.dprenda.setTipo(tipo);
        this.dprenda.setDescripcion(descripcion);
        this.dprenda.crear();
    } 
    
    public ArrayList<Object[]> listar(){
        return this.dprenda.listar();
    }
    
    public void editar(int id, String nombre,String tipo,String descripcion){
        this.dprenda.setId(id);
        this.dprenda.setNombre(nombre);
        this.dprenda.setTipo(tipo);
        this.dprenda.setDescripcion(descripcion);
        this.dprenda.editar();
    }
    
    public void eliminar(int id){
        this.dprenda.setId(id);
        this.dprenda.eliminar();
    }

}
