package Negocio.Decorador;

/**
 *
 * @author Oni
 */
public class Joya extends Decorador{
    
    public Joya(ComponenteGarantia componente) {
        super(componente);
    }

    @Override
    public String Detalle() {
        String s = super.Detalle();
        return s + " + joya";
    }
    
}
