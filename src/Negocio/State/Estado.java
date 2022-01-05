package Negocio.State;

/**
 *
 * @author Oni
 */
public class Estado {

    private State estado;
    private String nombre;
    private int valor;
    private String mensaje;

    public Estado() {
        this.nombre = "ENRESERVA";
        this.valor = 0;
        this.estado = new EnReserva();
    }

    public Estado(String nombre) {
        switch (nombre) {
            case "ENRESERVA":
                this.estado = new EnReserva();
                this.valor = 0;
                break;
            case "ENTREGADO":
                this.estado = new Entregado();
                this.valor = 1;
                break;
            case "REVISION":
                this.estado = new Revision();
                this.valor = 2;
                break;
            case "DEVUELTO":
                this.estado = new Devuelto();
                this.valor = 3;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
