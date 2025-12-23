import java.util.Random;
import java.util.Scanner;

public class pr5ypr8 {

    public static boolean validate(String phrase) {

        if (!(phrase.equals("") || phrase.equals(" ") || phrase.length() < 1)) {
            return true;
        }

        else {

            do {
                Scanner sc = new Scanner(System.in);

                System.out.println("Error, asegurese de escribir una frase");
                phrase = sc.nextLine();

            }

            while (phrase.equals("") || phrase.equals(" ") || phrase.length() < 1);

            return true;
        }
    }

    private static String secretWord(int word) {
        return switch (word) {
            case 0 -> "galaxia";
            case 1 -> "quimera";
            case 2 -> "catacumba";
            case 3 -> "criptico";
            case 4 -> "laberinto";
            case 5 -> "enigmatico";
            case 6 -> "aurora";
            case 7 -> "vortex";
            case 8 -> "sintaxis";
            case 9 -> "paradoja";
            default -> "desconocida";
        };
    }

    private static final String[] image = {
    """
      +---+
      |   |
          |
          |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
          |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
      |   |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
     /|   |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
     /|\\  |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
     /|\\  |
     /    |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
     /|\\  |
     / \\  |
          |
    =========
    """
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                """

                          █████████   █████   █████    ███████    ███████████     █████████    █████████   ██████████      ███████
                         ███░░░░░███ ░░███   ░░███   ███░░░░░███ ░░███░░░░░███   ███░░░░░███  ███░░░░░███ ░░███░░░░███   ███░░░░░███
                         ░███    ░███  ░███    ░███  ███     ░░███ ░███    ░███  ███     ░░░  ░███    ░███  ░███   ░░███ ███     ░░███
                         ░███████████  ░███████████ ░███      ░███ ░██████████  ░███          ░███████████  ░███    ░███░███      ░███
                         ░███░░░░░███  ░███░░░░░███ ░███      ░███ ░███░░░░░███ ░███          ░███░░░░░███  ░███    ░███░███      ░███
                         ░███    ░███  ░███    ░███ ░░███     ███  ░███    ░███ ░░███     ███ ░███    ░███  ░███    ███ ░░███     ███
                         █████   █████ █████   █████ ░░░███████░   █████   █████ ░░█████████  █████   █████ ██████████   ░░░███████░
                        ░░░░░   ░░░░░ ░░░░░   ░░░░░    ░░░░░░░    ░░░░░   ░░░░░   ░░░░░░░░░  ░░░░░   ░░░░░ ░░░░░░░░░░      ░░░░░░░
                        The Best Game of The Year!
                        """);


        Random random = new Random();
        int indice = random.nextInt(10);
        String code = secretWord(indice);
        String check = "";
        String resp = "";
        int fails = 0;

        
        do {
            System.out.println("Introduzca una frase:");
            String letter = sc.nextLine().toLowerCase();

            if (validate(letter)) {

                if (check.indexOf(letter) == -1) {
                    for (int j = 0; j < letter.length(); j++) {
                        char d = letter.charAt(j);
                        check += d;
                        resp = "";
                        for (int i = 0; i < code.length(); i++) {
                            char c = code.charAt(i);
                            if (check.indexOf(c) != -1) {
                                resp += c;
                            } else {
                                resp += "x";
                            }
                        }

                        if (code.indexOf(d) == -1) {
                            fails++;
                        }
                    }

                    System.out.println(image[Math.min(fails, image.length - 1)]);

                    System.out.println(resp);

                } else {
                    for (int j = 0; j < letter.length(); j++) {
                        char d = letter.charAt(j);
                        if (check.indexOf(d) == -1) {
                            check += d;
                            if (code.indexOf(d) == -1) fails++;
                        } else {
                            System.out.println("Ya has introducido la letra" + d);
                        }
                    }
                }

            }

        } while (!code.equals(resp) && fails < image.length - 1);

        if (fails >= image.length - 1) {
            System.out.println("Has perdido, la palabra era: " + code);
        }
        else {
            System.out.println("Ha ganado, la palabra era: " + code);
        }

        sc.close();

    }
}
