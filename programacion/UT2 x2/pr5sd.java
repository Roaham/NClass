import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 10000");
        int resp = sc.nextInt();
        
        if (resp > 10000 || resp < 1) {
            System.out.println("Se a introducido un número mayor o menor al estimado");
        }
        
        else {
            System.out.println("El número de cifras es de " + String.valueOf(resp).length());
        }
    }
}
