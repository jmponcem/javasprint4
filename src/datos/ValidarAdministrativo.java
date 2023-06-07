package datos;

import java.util.Scanner;

public class ValidarAdministrativo {
    public static String validarArea(Scanner entrada) {
        String area;
        while (true) {
            System.out.print("Ingrese area: ");
            area = entrada.nextLine();
            if (area.length() >= 5 || area.length() < 20) {
                return area;
            } else {
                System.out.println("Debe ingresar area entre 5 a 20 caracteres");
            }
        }
    }

    public static String validarExperiencia(Scanner entrada) {
        String experiencia;
        while (true) {
            System.out.print("Ingrese experiencia previa(maximo 100 caracteres): ");
            experiencia = entrada.nextLine();
            if(experiencia == ""){
                return experiencia;
            }
            if (experiencia.length() >= 0 || experiencia.length() < 100) {
                return experiencia;
            }
        }
    }
}
