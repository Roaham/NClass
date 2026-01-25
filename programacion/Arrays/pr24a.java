import java.util.Scanner;

public class pr24a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] notes= new int[5][3];

        System.out.println("Introduzca las notas del alumno número 1");
        for (int i = 0; i < notes.length; i++) {
            notes[1][i] = sc.nextInt();
        }

        System.out.println("Introduzca las notas del alumno número 2");
        for (int i = 0; i < notes.length; i++) {
            notes[2][i] = sc.nextInt();
        }

        System.out.println("Introduzca las notas del alumno número 3");
        for (int i = 0; i < notes.length; i++) {
            notes[3][i] = sc.nextInt();
        }

        System.out.println("Introduzca las notas del alumno número 4");
        for (int i = 0; i < notes.length; i++) {
            notes[4][i] = sc.nextInt();
        }

        System.out.println("Introduzca las notas del alumno número 5");
        for (int i = 0; i < notes.length; i++) {
            notes[5][i] = sc.nextInt();
        }

        for (int i = 0; i < notes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notes[i].length; j++) {
                suma += notes[i][j];
                double promedio = suma / notes[i].length;
                System.out.println("La media del alumno " + j + " son " + promedio);
            }
        }

        double suma = 0;
        int count = 0;

        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                suma += notes[i][j];
                count++;
            }
        }

        double promedio = suma / count;
        System.out.println("El promedio general de toda la clase es: " + promedio); 
    }
}
