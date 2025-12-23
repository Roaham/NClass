public class extra {
    public static void main(String[] args) {
        int filas = 15;
        int maxNum = calcularMaximo(filas);
        int ancho = contarDigitos(maxNum) + 1;

        int[] anterior = new int[1];
        anterior[0] = 1;

        imprimirEspacios((filas - 1) * ancho / 2);
        imprimirFila(anterior, ancho);

        for (int i = 1; i < filas; i++) {
            int[] actual = new int[i + 1];
            actual[0] = 1;
            actual[i] = 1;

            for (int j = 1; j < i; j++) {
                actual[j] = anterior[j - 1] + anterior[j];
            }

            imprimirEspacios((filas - 1 - i) * ancho / 2);
            imprimirFila(actual, ancho);

            anterior = actual;
        }
    }

    public static int calcularMaximo(int filas) {
        int[] fila = new int[filas];
        fila[0] = 1;
        for (int i = 1; i < filas; i++) {
            fila[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                fila[j] = fila[j - 1] + fila[j];
            }
        }
        return fila[filas / 2];
    }

    public static int contarDigitos(int n) {
        int c = 0;
        while (n > 0) {
            n /= 10;
            c++;
        }
        return c;
    }

    public static void imprimirFila(int[] fila, int ancho) {
        for (int x : fila) {
            String s = Integer.toString(x);
            for (int i = s.length(); i < ancho; i++) {
                System.out.print(" ");
            }
            System.out.print(s);
        }
        System.out.println();
    }

    public static void imprimirEspacios(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
}
