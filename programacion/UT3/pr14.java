import java.util.Scanner;

public class pr14 {

    public static boolean validate(String a) {
        return a.matches("\\d{8,8}[A-Z]{1,1}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su DNI");
        String num = sc.nextLine();
        
        if (validate(num)) {
            System.out.println("Este DNI es válido");
        }
        else {
            System.out.println("Este DNI no es válido");
        }
    }
}
