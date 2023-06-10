package datos;

import java.util.Scanner;


import static datos.Contenedor.*;
import static datos.ValidarCliente.*;
import static datos.ValidarUsuario.*;
import static datos.ValidarProfesional.*;
import static datos.ValidarAdministrativo.*;
import static datos.ValidarCapacitacion.*;

public class IngresarDatos {
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
            System.out.println("0. Salir");
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
                            contenedor.listarPorTipo( op);
                            break;
                        case 3:
                            System.out.println("Lista Profesional.");
                            contenedor.listarPorTipo(op);
                            break;
                    }break;
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

        //entrada.close();

        //Usuario usuario = new Usuario();
        //usuario.setNombre(validarNombreUsuario(entrada));
        //usuario.setFecha(validarFecha(entrada));
        //usuario.setRut(validarRut(entrada));

        //mostrarEdad(usuario.getFecha());
        //usuario.analizarUsuario(usuario.getNombre(),usuario.getRut());*/


        //System.out.println(obtenerNombre(cliente.getNombre(),cliente.getApellidos()));
        //obtenerSistemaSalud(cliente.getSistema_salud());
        //cliente.analizarUsuario(cliente.getDireccion(),cliente.getComuna());
        //almacenarCliente(cliente.getNombre(),cliente.getRut(),cliente.getDireccion(),cliente.getComuna());


        //profesional.analizarUsuario();

        //administrativo.analizarUsuario();

        //capacitacion.mostrarDetalle();

        Accidente accidente = new Accidente();
        //accidente.setIdentificador(validarId(entrada));
        //accidente.setRut_cliente(validarRut(entrada));
        //Mismo formato de fecha entre accidente y visita terreno
        //accidente.setDia(validarFecha(entrada));
        //accidente.setHora(validarHora(entrada));
        //accidente.setLugar(validarLugar(entrada));
        //accidente.setOrigen(validarOrigen(entrada));
        //accidente.setConsecuencia(validarConsecuencia(entrada));


        VisitaTerreno visitaTerreno = new VisitaTerreno();
        //visitaTerreno.setIdentificador(validarId(entrada));
        //visitaTerreno.setRut_cliente(validarRut(entrada));
        //Mismo formato de fecha entre accidente y visita terreno
        //visitaTerreno.setDia(validarFecha(entrada));
        //visitaTerreno.setHora(validarHora(entrada));
        //visitaTerreno.setLugar(validarLugar(entrada));
        //visitaTerreno.setComentario(validarConsecuencia(entrada));


        Revision revision = new Revision();
        //revision.setIdentificador_revision(validarIdRevision(entrada));
        //revision.setIdentificador_visita_terreno(validarIdVisitaTerreno(entrada));
        //revision.setNombre_revision(validarNombreRevision(entrada));
        //revision.setDetalle_revisar(validarDetalleRevision(entrada));
        //revision.setEstado(validarEstado(entrada));

    }

}

