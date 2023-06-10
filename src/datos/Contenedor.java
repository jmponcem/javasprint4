package datos;

import java.util.*;

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
    List<IAsesoria> lista = new ArrayList<>();

    List<Capacitacion> listacap = new ArrayList<>();


    public void almacenarCliente() {
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

    public void almacenarProfesional() {
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

    public void almacenarAdministrativo() {
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

    public void almacenarCapacitacion() {
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

    public void listarUsuarios() {
        int contador = 1;
        for (IAsesoria l : lista) {
            System.out.println("usuario: " + contador);
            l.analizarUsuario();
            System.out.println("*******************");
            contador++;
        }
    }

    public void listarPorTipo(int op) {

        List<String> listapro = new ArrayList<>();
        List<String> listaadm = new ArrayList<>();
        List<String> listacli = new ArrayList<>();
        for (IAsesoria l : lista) {
            if (l instanceof Profesional) {
                listapro.add(l.toString());
            }
            if (l instanceof Administrativo) {
                listaadm.add(l.toString());
            }
            if (l instanceof Cliente) {
                listacli.add(l.toString());
            }
        }
        int contador = 1;
        if (op == 1) {
            for (String c : listacli) {
                System.out.println("Cliente:" + contador);
                System.out.println(c);
                contador++;
            }
        }

        if (op == 2) {
            for (String p : listapro) {
                System.out.println("profesional:" + contador);
                System.out.println(p);
                contador++;
            }
        }
        if (op == 3) {
            for (String a : listaadm) {
                System.out.println("Administrativo:" + contador);
                System.out.println(a);
                contador++;
            }
        }

    }

    public void listarCapacitacion() {
        String rut_cli = null;
        List<String> listacapcli = new ArrayList<>();
        for (Capacitacion capacitacion : listacap) {
            if (capacitacion != null) {
                System.out.println("Capacitacion");
                System.out.println(capacitacion);
                rut_cli = capacitacion.getRut_cliente();
                System.out.println("Cliente");
                buscarClientePorRun(rut_cli);
            }
        }

    }

    public void buscarClientePorRun(String rut_cli) {
        for (IAsesoria l : lista) {
            if (l instanceof Cliente) {
                Cliente cliente = (Cliente) l;
                if (cliente.getRut().equals(rut_cli)) {
                    System.out.println(cliente);
                }
            }
        }
    }

    public Usuario buscarRut(String rut) {
        for (IAsesoria l : lista) {
            if (l instanceof Usuario) {
                Usuario usuarioBuscar = (Usuario) l;
                if (usuarioBuscar.getRut().equals(rut)) {
                    return usuarioBuscar;
                }
            }
        }
        return null;
    }

    public void eliminarUsuario() {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        for (IAsesoria l : lista) {
            System.out.println("usuario: " + contador);
            System.out.println(l);
            System.out.println("*******************");
            contador++;
        }
        System.out.println("Ingrese el rut para eliminar:");
        String rut = entrada.nextLine();
        Usuario usuarioEliminar = buscarRut(rut);
        if (usuarioEliminar != null) {
            lista.remove(usuarioEliminar);
            System.out.println("usuario eliminado");
        }

        /*for (int i = 0; i < lista.toArray().length; i++) {
            String elemento = lista.get(i).toString();
            if (elemento.contains(rut)) {
                System.out.println(elemento);
                System.out.println("usuario eliminado");
                lista.remove(i);
            }
        }*/
        contador = 1;
        System.out.println("Nueva lista");
        for (IAsesoria l : lista) {
            System.out.println("usuario: " + contador);
            System.out.println(l);
            System.out.println("*******************");
            contador++;
        }
    }


}


