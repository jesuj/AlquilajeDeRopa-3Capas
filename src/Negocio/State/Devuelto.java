package Negocio.State;

/**
 *
 * @author Oni
 */
public class Devuelto implements State {

    @Override
    public void reservar(Estado estado) {
        estado.setMensaje("El traje esta devuelto");
    }

    @Override
    public void entregar(Estado estado) {
        estado.setMensaje("El traje esta devuelto");
    }

    @Override
    public void revision(Estado estado) {
        estado.setMensaje("El traje esta devuelto");
    }

    @Override
    public void devolucion(Estado estado) {
        estado.setMensaje("El traje esta devuelto");
    }
    
}
