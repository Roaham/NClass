import java.util.Scanner;

public class pr21 {
    public static boolean validator(String dni) {

        if (dni.equals("^[0-9]{8}[A-Z]$")) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el DNI");
        String dni = sc.nextLine();

        char[] dniA = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (validator(dni)) {
            int numero = Integer.parseInt(dni.substring(0, 8));
            char letter = dniA[numero % 23];

            if (dni.charAt(8) == letter) {
                System.out.println("Sekai!!!");
            }

        }
        else {
            System.out.println("El DNI no es valido.");
        }
    }
}
