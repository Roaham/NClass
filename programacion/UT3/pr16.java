import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer resp = new StringBuffer();

        System.out.println("Introduce la clave 1:");
        String clave1 = sc.nextLine();
        System.out.println("Introduce la clave 2:");
        String clave2 = sc.nextLine();
        System.out.println("Introduce la palabra secreta:");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int pos = clave1.indexOf(c);

            if (pos != -1) {
                resp.append(clave2.charAt(pos));
            }
            else {
                resp.append(c);
            }
        }

        System.out.println(resp);
    }
}