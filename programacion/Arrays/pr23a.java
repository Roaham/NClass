import java.util.Arrays;
import java.util.Scanner;

public class pr23a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona el tamaño de la x");
        int sizeX = sc.nextInt();
        System.out.println("Selecciona el tamaño de la y");
        int sizeY = sc.nextInt();

        int[][] table1 = new int[sizeX][sizeY];
        int[][] table2 = new int[sizeX][sizeY];
        int[][] table3 = new int[sizeX][sizeY];

        System.out.println("Introduce los números de la primera tabla");
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[i].length; j++) {
                table1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Introduce los números de la segunda tabla");
        for (int i = 0; i < table2.length; i++) {
            for (int j = 0; j < table2[i].length; j++) {
                table2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < table3.length; i++) {
            for (int j = 0; j < table3[i].length; j++) {
                table3[i][j] = table1[i][j] + table2[i][j];
            }
        }

        for (int i = 0; i < table3.length; i++) {
            System.out.println(Arrays.toString(table3[i]));
        }
    }   
}
