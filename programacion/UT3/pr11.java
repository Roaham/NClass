import java.util.Scanner;

public class pr11 {
    public static String validate(String phrase) {
        phrase = phrase.toUpperCase();
        return phrase.replaceAll(" ", "");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String phrase = sc.nextLine();
        String real = validate(phrase);
        String check = "";

        for (int i = real.length() - 1; i >= 0; i--) {
            if (real.indexOf(i) == real.indexOf(real.length() - i)) {
                check += real.charAt(i);
            }
        }

        if (check.equals(real)) {
            System.out.println("Esta frase es palíndroma");
        }

        else {
            System.out.println("Esta frase no es palíndroma");
        }
    }
}
