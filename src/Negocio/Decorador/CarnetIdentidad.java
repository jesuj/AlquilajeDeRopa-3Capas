package Negocio.Decorador;

/**
 *
 * @author Oni
 */
public class CarnetIdentidad extends Decorador{
    
    public CarnetIdentidad(ComponenteGarantia componente) {
        super(componente);
    }

    @Override
    public String Detalle() {
        String s = super.Detalle();
        return s + " + carnetIdentidad";
    }
    
}
