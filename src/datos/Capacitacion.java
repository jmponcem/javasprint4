package datos;

public class Capacitacion {
    int identificador;
    String rut_cliente;
    String dia;
    String hora;
    String lugar;
    String duracion;
    int cantidad_asistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, String rut_cliente, String dia, String hora, String lugar, String duracion, int cantidad_asistentes) {
        this.identificador = identificador;
        this.rut_cliente = rut_cliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidad_asistentes = cantidad_asistentes;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidad_asistentes() {
        return cantidad_asistentes;
    }

    public void setCantidad_asistentes(int cantidad_asistentes) {
        this.cantidad_asistentes = cantidad_asistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rut_cliente='" + rut_cliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidad_asistentes=" + cantidad_asistentes +
                '}';
    }

    public void mostrarDetalle(){
        String hora_mod= hora.substring(0,2);
        String minuto = hora.substring(3,5);
        System.out.println("La capacitación sera en: "+lugar+" a las "+hora_mod+" del dia "+dia+
                " y durara "+minuto+ " minutos");
    }
}
