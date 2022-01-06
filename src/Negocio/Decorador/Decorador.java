package Negocio.Decorador;

/**
 *
 * @author Oni
 */
public abstract class Decorador implements ComponenteGarantia{
    protected ComponenteGarantia componente;

    public Decorador(ComponenteGarantia componente) {
        this.componente = componente;
    }
    
    @Override
    public String Detalle() {
        return componente.Detalle();
    }
    
}
