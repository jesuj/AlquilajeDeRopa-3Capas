package Negocio.State;

/**
 *
 * @author Oni
 */
public interface State {
    void reservar(Estado estado);
    void entregar(Estado estado);
    void revision(Estado estado);
    void devolucion(Estado estado);
}
