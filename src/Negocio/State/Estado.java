package Negocio.State;

/**
 *
 * @author Oni
 */
public class Estado {

    private State estado;
    private String nombre;
    private String mensaje;

    public Estado() {
        this.nombre = "ENRESERVA";
        this.estado = new EnReserva();
    }

    public Estado(String nombre) {
        switch (nombre) {
            case "ENRESERVA":
                this.estado = new EnReserva();
                break;
            case "ENTREGADO":
                this.estado = new Entregado();
                break;
            case "REVISION":
                this.estado = new Revision();
                break;
            case "DEVUELTO":
                this.estado = new Devuelto();
                break;
        }
        this.nombre = nombre;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
