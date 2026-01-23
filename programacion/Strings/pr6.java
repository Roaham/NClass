import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Introduce la frase: ");
        String phrase = sc.nextLine();
        
        System.out.println("Introduce la palabra: ");
        String word = sc.nextLine();

        for (int i = 0; i < phrase.length(); i++) {
            int j = phrase.indexOf(word, i);

            if (j != -1) {
                count++;
                i = j + word.length() - 1;
            }
        }
        
        System.out.println("La palabra " + word + " aparece " + count + " veces");

    }
}
