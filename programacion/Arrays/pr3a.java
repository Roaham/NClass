public class pr3a {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 7, 8, 10, 11};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("Es par" + num[i]);
            }
            else {
                System.out.println("Es impar" + num[i]);
            }
        }
    }
}
