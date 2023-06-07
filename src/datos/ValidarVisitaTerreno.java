package datos;

import java.util.Scanner;

public class ValidarVisitaTerreno {
    public static String validarComentario(Scanner entrada) {
        String comentario;
        while (true) {
            System.out.print("ingrese comentarios: ");
            comentario = entrada.nextLine();
            if (comentario.length() <= 100) {
                return comentario;
            } else {
                System.out.println("Debe ingresar los comentarios menores a 100 caracteres)");
            }
        }

    }
}
