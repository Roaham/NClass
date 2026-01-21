import java.util.Scanner;

public class pr23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz (X*Y)");
        int x = sc.nextInt();
        System.out.print("*");
        int y = sc.nextInt();

        int[][] ram1 = new int[x][y];
        int[][] ram2 = new int[x][y];
        int[][] ram3 = new int[x][y];

        System.out.println("Introduce los valores de la matriz 1");
        for (int i = 0; i < ram1.length; i++) {
            for (int j = 0; j < ram1[i].length; j++) {
                ram1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Introduce los valores de la matriz 2");
        for (int i = 0; i < ram1.length; i++) {
            for (int j = 0; j < ram1[i].length; j++) {
                ram2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < ram1.length; i++) {
            for (int j = 0; j < ram1[i].length; j++) {
                ram3[i][j] = ram1[i][j] + ram2[i][j];
            }
        }

        for (int[] i:ram3) {
            for (int j:i) {
                System.out.println(j);
            }
        }

        sc.close();
    }
}
