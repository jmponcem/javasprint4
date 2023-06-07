package datos;

public class VisitaTerreno extends Capacitacion {
    String comentario;

    public VisitaTerreno() {
    }

    public VisitaTerreno(int identificador, String rut_cliente, String dia, String hora, String lugar, String duracion, int cantidad_asistentes, String comentario) {
        super(identificador, rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes);
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "comentario='" + comentario + '\'' +
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
