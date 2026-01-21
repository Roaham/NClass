import java.util.Random;
import java.util.Scanner;

public class pr17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numSecreto = new int[6];
        int[] num = new int[6];

        Random r = new Random();
        
        for (int i = 0; i < numSecreto.length; i++) {
            numSecreto[i] = r.nextInt(9);
        }

        System.out.println("Input numbers pls");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        } 

        for (int j = 0; j < num.length; j++) {
            if (num[j] != numSecreto[j]) {
                System.out.println("MOOOOOOOOC");
                break;
            }
            else {
                System.out.println("Sekaiiii!!!!");
                break;
            }
        }
    }
}
