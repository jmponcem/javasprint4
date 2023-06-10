package datos;

public class Administrativo extends Usuario implements IAsesoria {
    private String area;
    private String experiencia;

    public Administrativo() {
    }

    public Administrativo(String nombre, String fecha, String rut, String area, String experiencia) {
        super(nombre, fecha, rut);
        this.area = area;
        this.experiencia = experiencia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombre='" + getNombre() + '\'' +
                ", fecha='" + getFecha() + '\'' +
                ", rut=" + getRut() + '\'' +
                ", area='" + area + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }


    public void analizarUsuario() {
        super.analizarUsuario();
        //System.out.println("El area: " + area);
        //System.out.println("La experiencia: " + experiencia);
    }
}
