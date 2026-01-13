import java.util.Arrays;
import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the array size");
        int size = sc.nextInt();

        int[] num = new int[size];
        int number = 0;

        System.out.println("Input numbers pls");
        for (int i = num.length - 1; i >= 0; i--) {
            num[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(num));
    }
}
