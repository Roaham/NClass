import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        System.out.println("Introduce un número");
        int num2 = sc.nextInt();

        if (num > num2) {
            System.out.printf("%d es mayor que %d", num, num2);
        }

        else {
            System.out.printf("%d es mayor que %d", num2, num);
        }
    }
    
}
