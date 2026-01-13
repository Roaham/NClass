public class pr3 {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 7, 8, 10, 11};

        for (int numr:num) {
            if (numr % 2 == 0) {
                System.out.println("El número " + numr + " es par");
            }
            else {
                System.out.println("El número " + numr + " es impar");
            }
        }
    }
}