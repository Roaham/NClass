import java.util.Scanner;

public class rombo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca anchura del rombo:");
        int size = sc.nextInt();

        for(int i = 1; i <= size; i++) {
            for(int j = size; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = size - 1; i >= 1; i--) {

            for(int j = size; j > i; j--) {
                System.out.print(" ");
            }
            
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}
