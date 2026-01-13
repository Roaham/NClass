import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class pr12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the array size");
        int size = sc.nextInt();

        int[] num = new int[size];

        Random r = new Random();

        for (int i = 0; i < size; i++) {
            num[i] = r.nextInt(100);
        }
        
        System.out.println(Arrays.toString(num));
    }
}
