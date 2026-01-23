import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la contraseña: ");
        String passwd = sc.nextLine();

        do { 

            StringBuilder tr = new StringBuilder();

            System.out.println("Introduce una frase: ");
            String resp = sc.nextLine();

            for (int i = 0; i < passwd.length(); i++) {
                if (passwd.charAt(i) == resp.charAt(i)) {
                    tr.append(passwd.charAt(i));
                }
                else {
                    tr.append("*");
                }
            }

            if (tr.toString().equals(passwd)) {
                break;
            }

            System.out.println(tr);
        } while (true);

        System.out.println("Sekaiiiii!!!!!!!!");
    }
}
