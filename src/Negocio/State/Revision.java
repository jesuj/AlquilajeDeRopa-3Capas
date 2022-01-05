package Negocio.State;

/**
 *
 * @author Oni
 */
public class Revision implements State {

    @Override
    public void reservar(Estado estado) {
        estado.setMensaje("El traje esta en Revision");
    }

    @Override
    public void entregar(Estado estado) {
        estado.setMensaje("El traje esta en Revision");
    }

    @Override
    public void revision(Estado estado) {
        estado.setMensaje("El traje esta en Revision");
    }

    @Override
    public void devolucion(Estado estado) {
        estado.setEstado(new Devuelto());
        estado.setMensaje("El traje devuelto exitosamente");
        estado.setNombre("DEVUELTO");
    }
    
}
