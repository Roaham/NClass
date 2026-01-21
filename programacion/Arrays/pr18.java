import java.util.Arrays;
import java.util.Scanner;

public class pr18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the array size");
        int size = sc.nextInt();

        int[] num = new int[size];
        int[] num2 = new int[size];
        int[] sec = new int[size];
        int count = 0;
        
        System.out.println("Input numbers pls");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            boolean loop = false; 
            for (int j = 0; j < sec.length; j++) {
                if (num[i] == sec[j]) {
                    loop = true;
                    break;
                }
            }
            if (!loop) {
                sec[count] = num[i];
                num2[count] = num[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(num2));
    }
}
