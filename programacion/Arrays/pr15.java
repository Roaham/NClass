import java.util.Arrays;
import java.util.Scanner;

public class pr15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the array size");
        int size = sc.nextInt();

        int[] num = new int[size];
        int[] num2 = new int[size];

        System.out.println("Input numbers pls");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                num2[i] = num[i] * 2;
            }
            else {
                num2[i] = num[i] * 3;
            }
        }

        System.out.println(Arrays.toString(num2));
    }
}
