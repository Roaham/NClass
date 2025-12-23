import java.util.Scanner;

public class pr13 {

    public static boolean validate(String a) {
        return a.matches("[6,7]\\d{8,8}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su número de teléfono");
        String num = sc.nextLine();
        
        if (validate(num)) {
            System.out.println("Este teléfono es válido");
        }
        else {
            System.out.println("Este teléfono no es válido");
        }
    }
}
