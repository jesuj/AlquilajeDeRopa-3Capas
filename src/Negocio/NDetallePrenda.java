package Negocio;

import Datos.DDetallePrenda;
import java.util.ArrayList;

/**
 *
 * @author Oni
 */
public class NDetallePrenda {
    private int id_vestimentas;
    private int id_prenda;
    private int stock;
    private String color;
    
    private DDetallePrenda ddetalleprenda;
    
    
    public NDetallePrenda(int id_vestimentas, int id_prenda, int stock, String color) {
        this.id_vestimentas = id_vestimentas;
        this.id_prenda = id_prenda;
        this.stock = stock;
        this.color = color;
        ddetalleprenda = new DDetallePrenda();
    }
    
    public NDetallePrenda() {
        ddetalleprenda = new DDetallePrenda();
    }

    public boolean crear(ArrayList<NDetallePrenda> ndetallePrenda){
        boolean valor = true;
        for (NDetallePrenda detallePrenda : ndetallePrenda) {
            int id_prenda = detallePrenda.id_prenda;
            this.ddetalleprenda.setId_prenda(id_prenda);
            this.ddetalleprenda.setId_vestimentas(detallePrenda.id_vestimentas);
            this.ddetalleprenda.setStock(detallePrenda.stock);
            this.ddetalleprenda.setColor(detallePrenda.color);
            valor = valor && this.ddetalleprenda.crear();
        }
        return valor;
    } 
    
    public boolean eliminar(ArrayList<NDetallePrenda> ndetallePrenda){
        boolean valor = true;
        for (NDetallePrenda detallePrenda : ndetallePrenda) {
            int id_prenda = detallePrenda.id_prenda;
            this.ddetalleprenda.setId_prenda(id_prenda);
            this.ddetalleprenda.setId_vestimentas(detallePrenda.id_vestimentas);
            this.ddetalleprenda.setStock(detallePrenda.stock);
            this.ddetalleprenda.setColor(detallePrenda.color);
            valor = valor && this.ddetalleprenda.eliminar();
        }
        return valor;
    } 
    
    public ArrayList<Object[]> listar(){
        this.ddetalleprenda.setId_vestimentas(this.id_vestimentas);
        return this.ddetalleprenda.listar();
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
