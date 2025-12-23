import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0");
        System.out.println("cuanto vale la a?");
        int a = sc.nextInt();
        System.out.println("cuanto vale la b?");
        int b = sc.nextInt();
        System.out.println("cuanto vale la c?");
        int c = sc.nextInt();

        double raiz = Math.sqrt(b * b - 4 * a * c);

        System.out.println("el resultado es positivamente: " + (-b + raiz / 2 * a));
        System.out.println("el resultado es negativamente: " + (-b - raiz / 2 * a));
    }
}
