package Negocio.State;

/**
 *
 * @author Oni
 */
public class Entregado implements State {

    @Override
    public void reservar(Estado estado) {
        estado.setMensaje("Esta en Tregado el Traje");
    }

    @Override
    public void entregar(Estado estado) {
        estado.setMensaje("Esta en Tregado el Traje");
    }

    @Override
    public void revision(Estado estado) {
        estado.setEstado(new Revision());
        estado.setMensaje("El traje estara en Revision");
        estado.setValor(2);
        estado.setNombre("REVISION");
    }

    @Override
    public void devolucion(Estado estado) {
        estado.setEstado(new Devuelto());
        estado.setMensaje("Traje Devuelto Exitosamente");
        estado.setValor(3);
        estado.setNombre("DEVUELTO");
    }
    
}
