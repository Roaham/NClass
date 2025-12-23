import java.util.Scanner;

public class pr6 {

    public static boolean validate(String word) {
        
        if (word.length() < 2 || word.length() > 20) {
            System.out.println("Error, Tu frase es muy larga o muy corta");
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String phrase = sc.nextLine();
        System.out.println("Introduce una palabra");
        String word = sc.nextLine();
        int count = 0;

        if (validate(word)) {
            for (int i = 0; i < phrase.length(); i++) {
            int j = phrase.indexOf(word, i);

            if (j != -1) {
                count++;
            }
        }
        System.out.printf("Tu palabra aparece %d veces", count / word.length());
        }
    }
}