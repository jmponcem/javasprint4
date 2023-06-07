package datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static datos.ValidarAdministrativo.validarArea;
import static datos.ValidarAdministrativo.validarExperiencia;
import static datos.ValidarCapacitacion.*;
import static datos.ValidarCapacitacion.validarCantAsist;
import static datos.ValidarCliente.*;
import static datos.ValidarCliente.validarEdad;
import static datos.ValidarProfesional.validarTitulo;
import static datos.ValidarUsuario.*;
import static datos.ValidarUsuario.validarFecha;

public class Contenedor {
    static List<IAsesoria> lista = new ArrayList<>();

    static List<Capacitacion> listacap = new ArrayList<>();

    public static void almacenarCliente() {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.setNombre(validarNombresCliente(entrada));
        cliente.setFecha(validarFecha(entrada));
        cliente.setRut(validarRut(entrada));
        cliente.setApellidos(validarApellidosCliente(entrada));
        cliente.setTelefono(ingresarTelefono(entrada));
        cliente.setAfp(validarAfp(entrada));
        cliente.setSistema_salud(validarSistemaSalud(entrada));
        cliente.setDireccion(validarDireccion(entrada));
        cliente.setComuna(validarComuna(entrada));
        cliente.setEdad(validarEdad(entrada));
        lista.add(new Cliente(cliente.getNombre(), cliente.getFecha(), cliente.getRut(),
                cliente.getApellidos(), cliente.getTelefono(), cliente.getAfp(),
                cliente.getSistema_salud(), cliente.getDireccion(), cliente.getComuna(), cliente.getEdad()));
    }

    public static void almacenarProfesional() {
        Scanner entrada = new Scanner(System.in);
        Profesional profesional = new Profesional();
        profesional.setNombre(validarNombreUsuario(entrada));
        profesional.setFecha(validarFecha(entrada));
        profesional.setRut(validarRut(entrada));
        profesional.setTitulo(validarTitulo(entrada));
        profesional.setFecha_ingreso(validarFecha(entrada));
        lista.add(new Profesional(profesional.getNombre(), profesional.getFecha(), profesional.getRut(),
                profesional.getTitulo(), profesional.getFecha()));
    }

    public static void almacenarAdministrativo() {
        Scanner entrada = new Scanner(System.in);
        Administrativo administrativo = new Administrativo();
        administrativo.setNombre(validarNombreUsuario(entrada));
        administrativo.setFecha(validarFecha(entrada));
        administrativo.setRut(validarRut(entrada));
        administrativo.setArea(validarArea(entrada));
        administrativo.setExperiencia(validarExperiencia(entrada));
        lista.add(new Administrativo(administrativo.getNombre(), administrativo.getFecha(),
                administrativo.getRut(), administrativo.getArea(), administrativo.getExperiencia()));
    }

    public static void almacenarCapacitacion() {
        Scanner entrada = new Scanner(System.in);
        Capacitacion capacitacion = new Capacitacion();
        capacitacion.setIdentificador(validarId(entrada));
        capacitacion.setRut_cliente(validarRut(entrada));
        //formato dia diferente al resto
        capacitacion.setDia(validarDia(entrada));
        capacitacion.setHora(validarHora(entrada));
        capacitacion.setLugar(validarLugar(entrada));
        capacitacion.setDuracion(validarDuracion(entrada));
        capacitacion.setCantidad_asistentes(validarCantAsist(entrada));
        listacap.add(new Capacitacion(capacitacion.getIdentificador(), capacitacion.getRut_cliente(),
                capacitacion.getDia(), capacitacion.getHora(), capacitacion.getLugar(),
                capacitacion.getDuracion(), capacitacion.getCantidad_asistentes()));
    }

    public static void listarUsuarios() {
        for (IAsesoria l : lista) {
            l.analizarUsuario();
        }
    }

    public static void listarPorTipo() {
        for (IAsesoria profesional : lista) {
            System.out.println(profesional);
        }
    }

    public static void listarCapacitacion() {
        for (Capacitacion capacitacion : listacap) {
            System.out.println(capacitacion);
        }
    }

}
