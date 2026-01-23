import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr6a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String phrase = sc.nextLine();

        System.out.println("Introduce una palabra");
        String word = sc.nextLine();

        Pattern layer = Pattern.compile(word);
        Matcher finder = layer.matcher(phrase);
        int count = 0;

        while (finder.find()) {
            count++;
        }

        System.out.println();
        System.out.printf("La palabra %s aparece un total de %d veces" , word, count);
    }
}
