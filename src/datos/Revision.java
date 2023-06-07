package datos;

public class Revision {
    int identificador_revision;

    int identificador_visita_terreno;

    String nombre_revision;

    String detalle_revisar;

    String estado;

    public Revision() {
    }

    public Revision(int identificador_revision, int identificador_visita_terreno, String nombre_revision, String detalle_revisar, String estado) {
        this.identificador_revision = identificador_revision;
        this.identificador_visita_terreno = identificador_visita_terreno;
        this.nombre_revision = nombre_revision;
        this.detalle_revisar = detalle_revisar;
        this.estado = estado;
    }

    public int getIdentificador_revision() {
        return identificador_revision;
    }

    public void setIdentificador_revision(int identificador_revision) {
        this.identificador_revision = identificador_revision;
    }

    public int getIdentificador_visita_terreno() {
        return identificador_visita_terreno;
    }

    public void setIdentificador_visita_terreno(int identificador_visita_terreno) {
        this.identificador_visita_terreno = identificador_visita_terreno;
    }

    public String getNombre_revision() {
        return nombre_revision;
    }

    public void setNombre_revision(String nombre_revision) {
        this.nombre_revision = nombre_revision;
    }

    public String getDetalle_revisar() {
        return detalle_revisar;
    }

    public void setDetalle_revisar(String detalle_revisar) {
        this.detalle_revisar = detalle_revisar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "identificador_revision=" + identificador_revision +
                ", identificador_visita_terreno=" + identificador_visita_terreno +
                ", nombre_revision='" + nombre_revision + '\'' +
                ", detalle_revisar='" + detalle_revisar + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
