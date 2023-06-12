package datos;

import java.util.Scanner;

import static datos.Cliente.obtenerNombre;
import static datos.Cliente.obtenerSistemaSalud;
import static datos.Usuario.mostrarEdad;
import static datos.ValidarCapacitacion.*;
import static datos.ValidarCapacitacion.validarCantAsist;
import static datos.ValidarCliente.*;
import static datos.ValidarUsuario.*;
import static datos.ValidarProfesional.*;
import static datos.ValidarAdministrativo.*;


public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Contenedor contenedor = new Contenedor();
        int opcion;
        int op;

        do {
            System.out.println("Menú:");
            System.out.println("1. Almacenar cliente");
            System.out.println("2. Almacenar profesional");
            System.out.println("3. Almacenar administrativo");
            System.out.println("4. Almacenar capacitacion");
            System.out.println("5. Eliminar usuarios");
            System.out.println("6. Listar usuarios");
            System.out.println("7. Listar por tipo");
            System.out.println("8. Listar Capacitacion");
            System.out.println("0. Salir y ejecutar metodos fuera del menu");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción 1.");
                    contenedor.almacenarCliente();
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2.");
                    contenedor.almacenarProfesional();
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3.");
                    contenedor.almacenarAdministrativo();
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción 4.");
                    contenedor.almacenarCapacitacion();
                    break;
                case 5:
                    System.out.println("Ha seleccionado la opción 5.");
                    contenedor.eliminarUsuario();
                    break;
                case 6:
                    System.out.println("Ha seleccionado la opción 6.");
                    contenedor.listarUsuarios();
                    break;
                case 7:
                    System.out.println("Ha seleccionado la opción 7.");
                    System.out.println("1. Listar Cliente");
                    System.out.println("2. Listar Administrativo");
                    System.out.println("3. Listar Profesional");
                    System.out.print("Ingrese una opción: ");
                    op = entrada.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Lista Clientes.");
                            contenedor.listarPorTipo(op);
                            break;
                        case 2:
                            System.out.println("Lista Administrativo.");
                            contenedor.listarPorTipo(op);
                            break;
                        case 3:
                            System.out.println("Lista Profesional.");
                            contenedor.listarPorTipo(op);
                            break;
                    }
                    break;
                case 8:
                    System.out.println("Ha seleccionado la opción 8.");
                    contenedor.listarCapacitacion();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
            System.out.println();
        } while (opcion != 0);


        //Metodos del usuario
        Usuario usuario = new Usuario();
        usuario.setNombre(validarNombreUsuario(entrada));
        usuario.setRut(validarRut(entrada));
        usuario.setFecha(validarFecha(entrada));
        mostrarEdad(usuario.getFecha());
        usuario.analizarUsuario(usuario.getNombre(), usuario.getRut());

        //Metodos del cliente
        Cliente cliente = new Cliente();
        cliente.setNombre(validarNombresCliente(entrada));
        cliente.setApellidos(validarApellidosCliente(entrada));
        cliente.setFecha(validarFecha(entrada));
        cliente.setSistema_salud(validarSistemaSalud(entrada));
        cliente.setRut(validarRut(entrada));
        cliente.setDireccion(validarDireccion(entrada));
        cliente.setComuna(validarComuna(entrada));
        System.out.println(obtenerNombre(cliente.getNombre(),cliente.getApellidos()));
        obtenerSistemaSalud(cliente.getSistema_salud());
        cliente.analizarUsuario(cliente.getDireccion(),cliente.getComuna());

        //Metodo del profesional
        Profesional profesional =new Profesional();
        profesional.setNombre(validarNombreUsuario(entrada));
        profesional.setFecha(validarFecha(entrada));
        profesional.setRut(validarRut(entrada));
        profesional.setTitulo(validarTitulo(entrada));
        profesional.setFecha_ingreso(validarFecha(entrada));
        profesional.analizarUsuario(profesional.getTitulo(), profesional.getFecha_ingreso());

        //Metodo del administrativo
        Administrativo administrativo = new Administrativo();
        administrativo.setNombre(validarNombreUsuario(entrada));
        administrativo.setFecha(validarFecha(entrada));
        administrativo.setRut(validarRut(entrada));
        administrativo.setArea(validarArea(entrada));
        administrativo.setExperiencia(validarExperiencia(entrada));
        administrativo.analizarUsuario(administrativo.getArea(),administrativo.getExperiencia());

        //Metodo de la capacitacion
        Capacitacion capacitacion = new Capacitacion();
        capacitacion.setIdentificador(validarId(entrada));
        capacitacion.setRut_cliente(validarRut(entrada));
        //formato dia diferente al resto
        capacitacion.setDia(validarDia(entrada));
        capacitacion.setHora(validarHora(entrada));
        capacitacion.setLugar(validarLugar(entrada));
        capacitacion.setDuracion(validarDuracion(entrada));
        capacitacion.setCantidad_asistentes(validarCantAsist(entrada));
        capacitacion.mostrarDetalle();

        entrada.close();

    }

}

