package Negocio;

import Datos.DVestimenta;
import java.util.ArrayList;

/**
 *
 * @author Oni
 */
public class NVestimenta {
    
    private DVestimenta dvestimenta;
    private ArrayList<NDetallePrenda> detallePrenda;
    private NDetallePrenda ndetallePrenda;

    public NVestimenta() {
        dvestimenta = new DVestimenta();
        detallePrenda =new ArrayList<>();
        ndetallePrenda = new NDetallePrenda();
    }
    
    
    public boolean crear(String nombre, int cantidad, int precio, int id_empleado, int id_categoria, ArrayList<Object[]> detallePrenda){
        this.dvestimenta.setNombre(nombre);
        this.dvestimenta.setCantidad(cantidad);
        this.dvestimenta.setPrecio(precio);
        this.dvestimenta.setId_empleado(id_empleado);
        this.dvestimenta.setId_categoria(id_categoria);
        
        int id_vestimenta =this.dvestimenta.crear(); 
        return guardarDetalle(detallePrenda, id_vestimenta);
    } 
    
    public ArrayList<Object[]> listar(){
        return this.dvestimenta.listar();
    }
    
    public boolean editar(int id, String nombre,int cantidad, int precio, int id_empleado, int id_categoria, ArrayList<Object[]> agregardetallePrenda, ArrayList<Object[]> eliminardetallePrenda){
        this.dvestimenta.setId(id);
        this.dvestimenta.setNombre(nombre);
        this.dvestimenta.setCantidad(cantidad);
        this.dvestimenta.setPrecio(precio);
        this.dvestimenta.setId_empleado(id_empleado);
        this.dvestimenta.setId_categoria(id_categoria);
        this.dvestimenta.editar();
        
        return editarDetallePrenda(id,agregardetallePrenda,eliminardetallePrenda);
    }
    
    public boolean eliminar(int id){
        this.dvestimenta.setId(id);
        return this.dvestimenta.eliminar();
    }

    private boolean guardarDetalle(ArrayList<Object[]> detallePrenda,int id_vestimenta) {
        this.detallePrenda.clear();
        for (Object[] detalle : detallePrenda) {          
            this.detallePrenda.add(new NDetallePrenda(id_vestimenta,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString()),
                    detalle[2].toString()));
        }
        return this.ndetallePrenda.crear(this.detallePrenda);
    }
    
    public ArrayList<Object[]> listarDetallePrenda(int id_vestimenta){
        ndetallePrenda.setId_vestimentas(id_vestimenta);
        return ndetallePrenda.listar();
    }

    private boolean editarDetallePrenda(int id_vestimenta, ArrayList<Object[]> agregardetallePrenda, ArrayList<Object[]> eliminardetallePrenda) {
        this.detallePrenda.clear();
        for (Object[] detalle : agregardetallePrenda) {          
            this.detallePrenda.add(new NDetallePrenda(id_vestimenta,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString()),
                    detalle[2].toString()));
        }
        boolean crear = this.ndetallePrenda.crear(detallePrenda);
        this.detallePrenda.clear();
        for (Object[] detalle : eliminardetallePrenda) {          
            this.detallePrenda.add(new NDetallePrenda(id_vestimenta,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString()),
                    detalle[2].toString()));
        }
        return crear && this.ndetallePrenda.eliminar(detallePrenda);
        
    }
}
