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
    
    public boolean crear(String nombre,String tipo, String descripcion){
        this.dprenda.setNombre(nombre);
        this.dprenda.setTipo(tipo);
        this.dprenda.setDescripcion(descripcion);
        return this.dprenda.crear();
    } 
    
    public ArrayList<Object[]> listar(){
        return this.dprenda.listar();
    }
    
    public boolean editar(int id, String nombre,String tipo,String descripcion){
        this.dprenda.setId(id);
        this.dprenda.setNombre(nombre);
        this.dprenda.setTipo(tipo);
        this.dprenda.setDescripcion(descripcion);
        return this.dprenda.editar();
    }
    
    public boolean eliminar(int id){
        this.dprenda.setId(id);
        return this.dprenda.eliminar();
    }

}
