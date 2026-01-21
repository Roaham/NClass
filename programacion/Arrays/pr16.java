import java.util.Arrays;
import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the array size");
        int size = sc.nextInt();

        int[] num = new int[size];
        boolean loop;
        
        System.out.println("Input numbers pls");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        do {
            loop = false;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) {
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    
                    loop = true;
                }
            }
        } while (loop);

        System.out.println(Arrays.toString(num));

        sc.close();
    }
}
