import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String a = sc.nextLine();

        System.out.println("Introduce una letra");
        String b = sc.nextLine();

        char c = b.charAt(0);
        int count = 0;

        if (b.length() == 1) {
            for (int i = 0; i < a.length(); i++) {
                if (c == a.charAt(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        else {
            System.out.println("MOOOOC");
        }

    }
}
