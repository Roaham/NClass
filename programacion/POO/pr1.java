import java.util.Scanner;

public class pr1 {

    enum meses {
        enero,
        febrero,
        marzo,
        abril,
        mayo,
        junio,
        julio,
        agosto,
        septiembre,
        octubre,
        noviembre,
        diciembre
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el mes:");
        String mesInput = sc.nextLine().toLowerCase();

        try {
            meses mes = meses.valueOf(mesInput);

            int num = switch (mes) {
                case enero -> 1;
                case febrero -> 2;
                case marzo -> 3;
                case abril -> 4;
                case mayo -> 5;
                case junio -> 6;
                case julio -> 7;
                case agosto -> 8;
                case septiembre -> 9;
                case octubre -> 10;
                case noviembre -> 11;
                case diciembre -> 12;
            };

            System.out.println("El número del mes " + mes + " es: " + num);

        } catch (IllegalArgumentException e) {
            System.out.println("Mes no válido.");
        }
    }
}
