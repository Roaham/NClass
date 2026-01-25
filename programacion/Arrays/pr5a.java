import java.util.Arrays;

public class pr5a {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 7, 8, 10, 11};
        int[] par = new int[num.length];
        int[] impar = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                par[i] += num[i];
            }
            else {
                impar[i] += num[i];
            }
        }

        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(impar));
    }
}
