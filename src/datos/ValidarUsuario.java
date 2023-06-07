package datos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidarUsuario {

    //Metodo valida cantidad de caracteres nombre
    public static String validarNombreUsuario(Scanner entrada) {
        String nombre;
        while (true) {
            System.out.print("Ingrese nombre (entre 10 y 50 caracteres): ");
            nombre = entrada.nextLine();
            if (nombre.length() >= 10 && nombre.length() <= 50) {
                return nombre;
            } else {
                System.out.println("El nombre debe tener entre 10 y 50 caracteres");
            }
        }
    }

    //Metodo devuelve fecha validada
    public static String validarFecha(Scanner entrada) {
        String fecha;
        while (true) {
            System.out.print("Ingrese una fecha en formato DD/MM/AAAA: ");
            fecha = entrada.nextLine();
            if (formatoFecha(fecha) == true) {
                return fecha;
            } else {
                System.out.println("De ingresar una fecha con el formato DD/MM/AAAA");
            }
        }
    }

    //Metodo valida formato fecha
    static boolean formatoFecha(String fecha) {
        // Expresión regular para el formato DD/MM/AAAA
        String patron = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }

    public static String validarRut(Scanner entrada) {
        String rut;
        int rutSinDigito = 0;
        while (true) {
            System.out.print("Ingrese rut menor a 99.999.999: ");
            rut = entrada.nextLine();
            if (rut == "" || rut.contains("-") == false) {
                return rut;
            } else {
                // Eliminar puntos y guiones
                String rut_mod = rut.replace(".", "").replace("-", "");
                // Validar formato y longitud
                if (rut_mod.matches("[0-9]+") && rut_mod.length() <= 9) {
                    rutSinDigito = Integer.parseInt(rut_mod.substring(0, rut_mod.length() - 1));
                    break;
                } else {
                    System.out.println("debe ingresar un menor a 99.999.999");
                }
            }
        }
        return rut;
    }
}
