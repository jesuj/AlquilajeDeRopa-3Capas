package Negocio.Decorador;

/**
 *
 * @author Oni
 */
public class GarantiaBase implements ComponenteGarantia {
    String garantia = "";

    public GarantiaBase(String garantia) {
        this.garantia = garantia;
    }

    public GarantiaBase() {
    }
    
    @Override
    public String Detalle() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }
    
}
