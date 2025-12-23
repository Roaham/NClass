import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String phrase = sc.nextLine();

        System.out.println("Introduce el caracter a contabilizar");
        String character = sc.nextLine();

        if (character.length() != 1) {
            System.out.println("Error, introducido más de un caracter");
            sc.close();
            return;
        }

        char target = character.charAt(0);
        int total = 0;

        for (int i = 0;i < phrase.length(); i++) {

            if (phrase.charAt(i) == target) {
                total++;
            }
        }

        System.out.printf("hay un total de %d x %c", total, Character.toUpperCase(target));

        sc.close();

    }
}
