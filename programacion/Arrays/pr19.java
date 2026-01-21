import java.util.Arrays;
import java.util.Scanner;

public class pr19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the array size");
        int size = sc.nextInt();

        int[] num = new int[size];
        int[] num2 = new int[size + 1];

        System.out.println("Input numbers pls");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.printf("Choose the position [0-%d]", size);
        int position = sc.nextInt();

        System.out.println("Choose the number");
        int number = sc.nextInt();

        for (int i = 0; i < position; i++) {
            num2[i] = num[i];
        }

        num2[position] = number;

        for (int i = position + 1; i < num2.length; i++) {
            num2[i] = num[i - 1];
        }

        System.out.println(Arrays.toString(num2));
    }
}