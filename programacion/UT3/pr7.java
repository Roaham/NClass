import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String word = sc.nextLine();
        final String check = "[aeiouáéíóú]";

        System.out.println(word.replaceAll(check, ""));
    }
}
