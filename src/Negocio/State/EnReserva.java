package Negocio.State;

/**
 *
 * @author Oni
 */
public class EnReserva implements State{

    @Override
    public void reservar(Estado estado) {
        estado.setMensaje("Esta en Reserva el traje");
    }

    @Override
    public void entregar(Estado estado) {
        estado.setEstado(new Entregado());
        estado.setMensaje("Entregando el Traje");
        estado.setValor(1);
        estado.setNombre("ENTREGADO");
    }

    @Override
    public void revision(Estado estado) {
        estado.setMensaje("Esta en Reserva el traje");
    }

    @Override
    public void devolucion(Estado estado) {
        estado.setMensaje("Esta en Reserva el traje");
    }
    
}
