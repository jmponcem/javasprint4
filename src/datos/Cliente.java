package datos;

public class Cliente extends Usuario implements IAsesoria {
    private String apellidos;
    private String telefono;
    private String afp;
    private String sistema_salud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String fecha, String rut, String apellidos, String telefono, String afp, String sistema_salud, String direccion, String comuna, int edad) {
        super(nombre, fecha, rut);
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistema_salud = sistema_salud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getSistema_salud() {
        return sistema_salud;
    }

    public void setSistema_salud(String sistema_salud) {
        this.sistema_salud = sistema_salud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombre() + '\'' +
                ", fecha='" + getFecha() + '\'' +
                ", rut=" + getRut() + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistema_salud=" + sistema_salud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        //System.out.println("La direccion: " + direccion);
        //System.out.println(" La comuna: " + comuna);
    }
    public void analizarUsuario(String direccion,String comuna) {
        super.analizarUsuario();
        System.out.println("La direccion: " + direccion);
        System.out.println(" La comuna: " + comuna);
    }

    public static String obtenerNombre(String nombre, String apellidos) {
        String nombrecompleto;
        nombrecompleto = "EL Nombre y el apellido: " + nombre + " " + apellidos;
        return nombrecompleto;
    }

    public static void obtenerSistemaSalud(String sistema_salud) {
        System.out.println("El sistema de salud es: " + sistema_salud);
    }
}
