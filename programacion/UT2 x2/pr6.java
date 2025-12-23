import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el aforo máximo del local");
        int aforo = sc.nextInt();

        System.out.println("Introduce el número de entradas vendidas");
        int nEntradas = sc.nextInt();

        System.out.println("Introduce el precio de las entradas");
        int pEntradas = sc.nextInt();

        if ((nEntradas * 100) / aforo <= 20) {
            System.out.println("Aforo insuficiente, no restable");
        }

        else if (pEntradas < 0 || nEntradas < 0 || aforo < 0 ) {
            System.out.println("Numero menor que 0 no válido");
        }

        else {
            System.out.println("La recaudación total es de: " + (nEntradas * pEntradas));
        }
    }
}
