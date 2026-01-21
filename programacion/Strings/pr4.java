import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        int[] conteo = new int[256]; // caracteres ASCII

        // Contar caracteres
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            conteo[c]++;
        }

        // Mostrar resultados
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                if ((char) i == ' ') {
                    System.out.println("Espacio: " + conteo[i]);
                } else {
                    System.out.println("'" + (char) i + "': " + conteo[i]);
                }
            }
        }

        sc.close();
    }
}
