package datos;

import java.util.Scanner;

public class ValidarCliente {
    //Metodo valida cantidad de caracteres en nombres
    public static String validarNombresCliente(Scanner entrada) {
        String nombres = null;
        while (true) {
            System.out.print("Ingrese nombres (entre 10 y 50 caracteres): ");
            nombres = entrada.nextLine();
            if (nombres.length() >= 5 && nombres.length() <= 30) {
                return nombres;
            } else {
                System.out.println("Debe ingresar nombres entre 10 y 50 caracteres");
            }
        }
    }

    //Metodo valida cantidad de caracteres en apellidos
    public static String validarApellidosCliente(Scanner entrada) {
        String apellidos = null;
        while (true) {
            System.out.print("Ingrese apellidos (entre 10 y 50 caracteres): ");
            apellidos = entrada.nextLine();
            if (apellidos.length() >= 5 && apellidos.length() <= 30) {
                return apellidos;
            } else {
                System.out.println("Debe ingresar apellidos entre 10 y 50 caracteres");
            }
        }
    }

    public static String ingresarTelefono(Scanner entrada) {
        String telefono = null;
        while (true) {
            System.out.print("Ingrese telefono: ");
            telefono = entrada.nextLine();
            if (telefono != "") {
                return telefono;
            } else {
                System.out.println("Debe ingresar telefono");
            }
        }
    }

    public static String validarAfp(Scanner entrada) {
        String afp;
        while (true) {
            System.out.print("Ingrese afp: ");
            afp = entrada.nextLine();
            if (afp == "") {
                return afp;
            }
            if (afp.length() >= 4 && afp.length() <= 30) {
                return afp;
            } else {
                System.out.println("Debe ingresar afp entre 4 y 30 caracteres");
            }
        }
    }

    public static String validarSistemaSalud(Scanner entrada) {
        String sistema_salud;
        int op;
        while (true) {
            System.out.print("Ingrese sistema de salud (1 fonasa, 2 isapre): ");
            sistema_salud = entrada.nextLine();
            if (sistema_salud == "") {
                return sistema_salud;
            }
            if (esEntero(sistema_salud) == true) {
                op = Integer.parseInt(sistema_salud);
                if (op == 1) {
                    sistema_salud = "Fonasa";
                    return sistema_salud;
                }
                if (op == 2) {
                    sistema_salud = "Isapre";
                    return sistema_salud;
                }
            } else {
                System.out.println("El valor ingreasado debe ser 1 0 2");
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


    public static String validarDireccion(Scanner entrada) {
        String direccion;
        while (true) {
            System.out.print("Ingrese direccion (maximo 70 caracteres): ");
            direccion = entrada.nextLine();
            if (direccion == "") {
                return direccion;
            }
            if (direccion.length() <= 70) ;
            {
                return direccion;
            }
        }
    }

    public static String validarComuna(Scanner entrada) {
        String comuna;
        while (true) {
            System.out.print("Ingrese comuna (maximo 50 caracteres): ");
            comuna = entrada.nextLine();
            if (comuna == "") {
                return comuna;
            }
            if (comuna.length() <= 50) {
                return comuna;
            }
        }
    }

    public static int validarEdad(Scanner entrada) {
        int edad;
        while (true) {
            System.out.print("Ingrese edad mayor a 0 y menor 150: ");
            edad = entrada.nextInt();
            if (edad >= 0 || edad < 150) {
                return edad;
            } else {
                System.out.println("Debe ingresar una edad entre o y 150");
            }
        }
    }

}
