import java.util.Scanner;

public class pr15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actualWord = "";
        StringBuffer words = new StringBuffer();

        do {
            System.out.println("Introduce una palabra:");
            actualWord = sc.nextLine();

            if (!actualWord.equals("fin")) {
                words.append(actualWord);
                words.append(" ");
            }

        } while (!actualWord.equals("fin"));

        System.out.println("Las palabras introducidas son: " + words.toString().trim());
    }
}
