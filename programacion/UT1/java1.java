public class java1 {
    
    public static double volumen(int radio, int altura) {
        return 2.14 * radio * radio * altura;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
    public static void main(String[] args) {
        double a = 7;
        double b = 12;
        double c = 2;

        double raiz = Math.sqrt(b * b - 4 * a * c);

        double respx1 = b - raiz;
        double respx2 = b + raiz;

        System.out.println("La respuesta 1 es " + (respx1 / 2 * a));
        System.out.println("La respuesta 2 es " + (respx2 / 2 * a));

        /*byte
        short
        int
        long
        float
        double
        boolean
        char*/

        int miau = 2;
        long miau2 = miau;
        int miau3 = (int)miau2;
        System.out.println(miau3);

        System.out.println("es 5 un número par? " + esPar(5));

        System.out.println("El volumen de radio 18, altura 20 y pi 2.14 (sin decimales) es: " + volumen(18, 20));

    }
}