package datos;

import java.util.Scanner;

public class ValidarRevision {

    public static int validarIdRevision(Scanner entrada) {
        int identificador = 0;
        String op;
        while (true) {
            System.out.print("ingrese id  revision  numero entero: ");
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

    public static int validarIdVisitaTerreno(Scanner entrada) {
        int identificador = 0;
        String op;
        while (true) {
            System.out.print("ingrese id  visita terreno  numero entero: ");
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

    public static String validarNombreRevision(Scanner entrada) {
        String nombre_revision;
        while (true) {
            System.out.print("ingrese nombre revision: ");
            nombre_revision = entrada.nextLine();
            if (nombre_revision.length() >= 10 && nombre_revision.length() <= 50) {
                return nombre_revision;
            } else {
                System.out.println("Debe ingresar el nombre de la revision entre 10 y 50 caracteres)");
            }
        }

    }

    public static String validarDetalleRevision(Scanner entrada) {
        String detalle_revisar;
        while (true) {
            System.out.print("ingrese detalle revision: ");
            detalle_revisar = entrada.nextLine();
            if ( detalle_revisar.length() <= 100) {
                return detalle_revisar;
            } else {
                System.out.println("Debe ingresar el detalle de la revision menor a 100 caracteres)");
            }
        }

    }
    public static String validarEstado(Scanner entrada) {
        String estado;
        int op;
        while (true) {
            System.out.print("Ingrese estado (1:sin problemas, 2:con observaciones, 3:no aprueba): ");
            estado = entrada.nextLine();
            if (estado == "") {
                return estado;
            }
            if (esEntero(estado) == true) {
                op = Integer.parseInt(estado);
                if (op == 1) {
                    estado = "sin problemas";
                    return estado;
                }
                if (op == 2) {
                    estado = "con observaciones";
                    return estado;
                }
                if (op == 3) {
                    estado = "no aprueba";
                    return estado;
                }
            } else {
                System.out.println("El valor ingreasado debe ser 1,2,3");
            }
        }
    }
    //Validar si el string se pude convertir a entero

    public static boolean esEntero(String entrada) {
        boolean resultado;
        try {
            Integer.parseInt(entrada);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
}
