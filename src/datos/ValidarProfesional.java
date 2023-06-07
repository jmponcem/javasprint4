package datos;

import java.util.Scanner;

public class ValidarProfesional {
    public static String validarTitulo(Scanner entrada) {
        String titulo;
        while (true) {
            System.out.print("Ingrese titulo: ");
            titulo = entrada.nextLine();
            if (titulo.length() >= 10 && titulo.length() < 50) {
                return titulo;
            }else{
                System.out.println("Debe ingresar titulo entre 10 a 50 caracteres");
            }
        }
    }
}
