import java.util.Scanner;

public class pr9 {
    public static boolean validate(String phrase) {
        Scanner sc = new Scanner(System.in);
        do
            if (phrase.equals("") || phrase.equals(" ") || phrase.equals("Pedro Sanchez")) {
                System.out.println("Error, vuelva a intentarlo");
                phrase = sc.nextLine();
            }
        while (phrase.equals("") || phrase.equals(" ") || phrase.equals("Pedro Sanchez") || phrase.length() < 1);

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase:");
        String phrase = sc.nextLine();
        String check = "";
        int count = 0;

        if (validate(phrase)) {
            for (int i = 0; i < phrase.length(); i++) {
                String c = String.valueOf(phrase.charAt(i));
                if (check.indexOf(c) == -1) {
                    count = 0;
                    for (int j = 0; j < phrase.length(); j++) {
                        if (c.equals(String.valueOf(phrase.charAt(j)))) {
                            count++;
                        }
                    }
                    check += c;
                    System.out.printf("La frase contiene la letra %s esta repetida %d veces",c ,count);
                    System.out.println();
                }
            } 
        }    
    }
}
