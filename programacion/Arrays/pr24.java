import java.util.Scanner;

public class pr24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] ram1 = new int[4][2];

        System.out.print("Introduce las notas del alumno 1");
        for (int i = 0; i < ram1.length; i++) {
            ram1[0][i] = sc.nextInt();
        }

        System.out.print("Introduce las notas del alumno 2");
        for (int i = 0; i < ram1.length; i++) {
            ram1[1][i] = sc.nextInt();
        }

        System.out.print("Introduce las notas del alumno 3");
        for (int i = 0; i < ram1.length; i++) {
            ram1[2][i] = sc.nextInt();
        }

        System.out.print("Introduce las notas del alumno 4");
        for (int i = 0; i < ram1.length; i++) {
            ram1[3][i] = sc.nextInt();
        }

        System.out.print("Introduce las notas del alumno 5");
        for (int i = 0; i < ram1.length; i++) {
            ram1[4][i] = sc.nextInt();
        }

        for (int i = 0, plus = 0; i < ram1[0].length; i++) {
            for (int j = 0; j < ram1.length; j++) {
                plus += 3 / ram1[i][j];

                System.out.println("La media del alumno " + (j+1) + " es " + plus);
            }
        }

        for (int i = 0, plus = 0; i < ram1[0].length; i++) {
            for (int j = 0; j < ram1.length; j++) {
                plus += 3/ ram1[j][i];
            }
            
            System.out.println("La media de las notas de la asignatura " + (i+1) + " es " + plus);
        }

        sc.close();
    }
}
