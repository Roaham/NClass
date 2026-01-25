import java.util.Scanner;

public class pr24b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] notes = new int[5][3]; // 5 alumnos, 3 notas

        // 1. Entrada de datos simplificada
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Introduzca las 3 notas del alumno número " + (i + 1));
            for (int j = 0; j < notes[i].length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notes[i][j] = sc.nextInt();
            }
        }

        // 2. Medias por alumno
        System.out.println("\n--- MEDIAS POR ALUMNO ---");
        for (int i = 0; i < notes.length; i++) {
            double sumaFila = 0;
            for (int j = 0; j < notes[i].length; j++) {
                sumaFila += notes[i][j];
            }
            double promedio = sumaFila / notes[i].length;
            System.out.println("Alumno " + (i + 1) + " - Media: " + promedio);
        }

        // 3. Promedio general
        double sumaTotal = 0;
        int totalNotas = 0;
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                sumaTotal += notes[i][j];
                totalNotas++;
            }
        }

        System.out.println("\nPromedio general de la clase: " + (sumaTotal / totalNotas));
        sc.close();
    }
}