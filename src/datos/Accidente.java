package datos;

public class Accidente extends Capacitacion{
    String origen;
    String consecuencia;

    public Accidente() {
    }

    public Accidente(int identificador, String rut_cliente, String dia, String hora, String lugar, String duracion, int cantidad_asistentes, String origen, String consecuencia) {
        super(identificador, rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes);
        this.origen = origen;
        this.consecuencia = consecuencia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencia() {
        return consecuencia;
    }

    public void setConsecuencia(String consecuencia) {
        this.consecuencia = consecuencia;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "origen='" + origen + '\'' +
                ", consecuencia='" + consecuencia + '\'' +
                ", identificador=" + identificador +
                ", rut_cliente='" + rut_cliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidad_asistentes=" + cantidad_asistentes +
                '}';
    }
}
