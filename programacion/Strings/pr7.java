import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la frase: ");
        String phrase = sc.nextLine();
        final String check = "[aeiou]";

        System.out.println(phrase.replaceAll(check, ""));
    }
}
