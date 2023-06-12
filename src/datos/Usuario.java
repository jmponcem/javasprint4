package datos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Usuario implements IAsesoria {
    private String nombre;
    private String fecha;
    private String rut;

    public Usuario() {
    }

    public Usuario(String nombre, String fecha, String rut) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", rut=" + rut +
                '}';
    }
    @Override
    public void analizarUsuario() {
        System.out.println("EL nombre es: "+this.nombre);
        System.out.println("La fecha es: "+this.fecha);
        System.out.println("EL rut es: "+this.rut);
    }


    public static void mostrarEdad(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaNacimiento.until(fechaActual).getYears();
        System.out.println("El usuario tiene: "+edad+" años");
    }

    public void analizarUsuario(String nombre, String rut) {
        System.out.println("El nombre es: "+nombre);
        System.out.println("El rut es :"+rut);
    }

}
