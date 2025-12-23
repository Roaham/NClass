import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base de tu triangulo:");
        int size = sc.nextInt();

        int i;

        for(i = 0; i < size + 1; i++) {
            
            for(int j = size; j >= i; j--) {
                System.out.print(" ");
            }

            for(int k = 0; k < i; k++) {
            System.out.print("* ");
            }

            System.out.println();
        }
        
        sc.close();
    }
    
}
