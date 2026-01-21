import java.util.Scanner;

public class pr15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Usamos StringBuilder para ir acumulando las palabras de forma eficiente
        StringBuilder fraseCompleta = new StringBuilder();
        String palabra;

        System.out.println("Introduce palabras una a una (escribe 'fin' para terminar):");

        while (true) {
            System.out.print("Palabra: ");
            palabra = sc.nextLine();

            // Comprobamos si es "fin" ignorando mayúsculas/minúsculas
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }

            // Si el StringBuilder no está vacío, añadimos un espacio antes de la nueva palabra
            if (fraseCompleta.length() > 0) {
                fraseCompleta.append(" ");
            }

            // Añadimos la palabra al constructor
            fraseCompleta.append(palabra);
        }

        // Mostramos el resultado final
        System.out.println("\nLa frase resultante es:");
        System.out.println(fraseCompleta.toString());
        
        sc.close();
    }
}