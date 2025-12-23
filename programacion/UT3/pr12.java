import java.util.Scanner;

public class pr12 {
    public static boolean validate(String clave1, String clave2, String frase) {
        if (clave1.length() != clave2.length()) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce clave 1: ");
        String clave1 = sc.nextLine();
        System.out.println("Introduce clave 2: ");
        String clave2 = sc.nextLine();
        System.out.println("Introduce frase a codificar: ");
        String frase = sc.nextLine();
        String check = "";
        String resp = frase;

        if (validate(clave1, clave2, frase)) {
            for (int i = 0; i < frase.length(); i++) {
                for (int j = 0; j < clave1.length(); j++) {
                    if (clave1.charAt(j) == frase.charAt(i)) {
                        check += clave1.charAt(j);
                    }
                }
            }

            for (int k = 0; k < frase.length(); k++) {
                if (check.indexOf(frase.charAt(k)) != -1) {
                    char original = frase.charAt(k);
                    int pos = clave1.indexOf(original);
                    char reemplazo = clave2.charAt(pos);

                    resp = resp.replace(original, reemplazo);
                }
            }

            System.out.printf("La clave cifrada es: %s",resp);

        }

        else {
            System.out.println("Este input no es válido");
        }
    }
}
