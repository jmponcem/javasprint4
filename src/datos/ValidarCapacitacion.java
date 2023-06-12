package datos;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ValidarCapacitacion {
    public static int validarId(Scanner entrada) {
        int identificador = 0;
        String op;
        while (true) {
            System.out.print("ingrese id  capacitacion  numero entero: ");
            op = entrada.nextLine();
            if (op == "") {
                System.out.println("Debe ingresar un id entero");
            }
            if (esEntero(op) == true) {
                identificador = Integer.parseInt(op);
                if (identificador > 0) {
                    return identificador;
                } else {
                    System.out.println("Debe ingresar un id mayor a 0 ");
                }
            }
        }

    }

    //Validar si el string se pude convertir a entero

    public static boolean esEntero(String entrada) {
        boolean resultado;
        try {
            parseInt(entrada);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    public static String validarDia(Scanner entrada) {
        String dia;
        while (true) {
            System.out.print("ingrese dia (lunes,martes,miercoles,jueves,sabado,domingo): ");
            dia = entrada.nextLine().toLowerCase();
            if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves")
                    || dia.equals("viernes") || dia.equals("sabado") || dia.equals("domingo")) {
                return dia;
            } else {
                System.out.println("Debe ingresar un dia con el formato correcto");
            }
        }
    }

    public static String validarHora(Scanner entrada) {
        String hora;
        while (true) {
            System.out.print("ingrese hora en formato HH:MM((hora entre 0 a 23, minutos entre 0 y 59)): ");
            hora = entrada.nextLine();
            if (hora.matches("^([01]\\d|2[0-3]):([0-5]\\d)$")) {
                return hora;
            } else {
                System.out.println("Debe ingresar un hora en el formato correcto (HH:MM)");
            }
        }
    }

    public static String validarLugar(Scanner entrada) {
        String lugar;
        while (true) {
            System.out.print("ingrese lugar: ");
            lugar = entrada.nextLine();
            if (lugar != "" && lugar.length() >= 10 && lugar.length() <= 50) {
                return lugar;
            } else {
                System.out.println("Debe ingresar un lugar entre (10 y 40 caracteres)");
            }
        }
    }

    public static String validarOrigen(Scanner entrada){
        String origen;
        while (true){
            System.out.print("ingrese origen: ");
            origen = entrada.nextLine();
            if (origen.length() <= 100) {
                return origen;
            } else {
                System.out.println("Debe ingresar el origen menor a 100 caracteres");
            }
        }
    }

    public static String validarDuracion(Scanner entrada) {
        String duracion;
        while (true) {
            System.out.print("ingrese duracion: ");
            duracion = entrada.nextLine();
            if (duracion.length() <= 70) {
                return duracion;
            } else {
                System.out.println("Debe ingresar la duracion menor a 70 caracteres");
            }
        }
    }

    public static int validarCantAsist(Scanner entrada) {
        int cantidad_asistentes = 0;
        while (true) {
            System.out.print("ingrese cantidad de asistentes menor a 1000: ");
            cantidad_asistentes = entrada.nextInt();
            if (cantidad_asistentes != 0 && cantidad_asistentes < 1000) {
                return cantidad_asistentes;
            } else {
                System.out.println("Debe ingresar la cantidad de aistentes menor que 1000");
            }
        }
    }
}
