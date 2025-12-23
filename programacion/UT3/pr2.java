public class pr2 {
    public static void main(String[] args) {
        final char pi = '\u03C0';
        boolean isM = (Character.isUpperCase(pi));

        if (isM == true) {
            System.out.println(pi + " es mayúscula");
        }

        else {
            System.out.println(pi + " no es mayúscula");
            System.out.println("la mayúscula es: " + (Character.toUpperCase(pi)));
        }

    }
}
