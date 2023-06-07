package datos;

import java.util.Scanner;

public class ValidarAccidente {
    public static String validarOrigen(Scanner entrada) {
        String origen;
        while (true) {
            System.out.print("ingrese origen: ");
            origen = entrada.nextLine();
            if (origen.length() <= 100) {
                return origen;
            } else {
                System.out.println("Debe ingresar el origen menor a 100 caracteres)");
            }
        }

    }

    public static String validarConsecuencia(Scanner entrada) {
        String consecuencia;
        while (true) {
            System.out.print("ingrese consecuencias: ");
            consecuencia = entrada.nextLine();
            if (consecuencia.length() <= 100) {
                return consecuencia;
            } else {
                System.out.println("Debe ingresar las consecuencias menor a 100 caracteres)");
            }
        }

    }
}
