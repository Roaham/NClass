import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String phrase = sc.nextLine();

        System.out.println(phrase.trim().length());
        
        sc.close();
    }
}
