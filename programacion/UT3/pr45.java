import java.util.Scanner;

public class pr45 {

    public static boolean validate(String phrase) {
        return !(phrase.equals("") || phrase.equals(" "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String phrase = sc.nextLine();

        if (validate(phrase)) {

            phrase = phrase.toLowerCase();
            String checked = "";

            for (int i = 0; i < phrase.length(); i++) {
                char k = phrase.charAt(i);

                if (Character.isLetter(k) && checked.indexOf(k) == -1) {
                    int total = 0;

                    for (int j = 0; j < phrase.length(); j++) {
                        
                        if (phrase.charAt(j) == k) {
                            total++;
                        }
                    }

                    System.out.println(k + " aparece " + total + " veces");
                    checked += k;
                }
            }
        } 
        
        else {
            System.out.println("Esta frase no es válida");
        }

        sc.close();
    }
}
