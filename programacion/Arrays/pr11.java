import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        System.out.println("Introduce 3 números:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Introduce el número a buscar:");
        int number = sc.nextInt();

        int posicion = -1;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == number) {
                posicion = i;
                break;
            }
        }

        System.out.println(posicion);

        sc.close();
    }
}
