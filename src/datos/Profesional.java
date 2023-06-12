package datos;

public class Profesional extends Usuario implements IAsesoria {
    private String titulo;
    private String fecha_ingreso;

    public Profesional() {
    }

    public Profesional(String nombre, String fecha, String rut, String titulo, String fecha_ingreso) {
        super(nombre, fecha, rut);
        this.titulo = titulo;
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "nombre='" + getNombre() + '\'' +
                ", fecha='" + getFecha() + '\'' +
                ", rut=" + getRut() + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fecha_ingreso='" + fecha_ingreso + '\'' +
                '}';
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        //System.out.println("El titulo es: " + titulo);
        //System.out.println("La fecha de ingreso es: " + fecha_ingreso);
    }
    public void analizarUsuario(String titulo, String fecha_ingreso) {
        super.analizarUsuario();
        System.out.println("El titulo es: " + titulo);
        System.out.println("La fecha de ingreso es: " + fecha_ingreso);
    }
}
