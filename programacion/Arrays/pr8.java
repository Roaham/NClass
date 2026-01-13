import java.util.Arrays;

public class pr8 {
    public static void main(String[] args) {
        int[] num1 = {1, 3, 5, 7, 9};
        int[] num2 = {6, 4, 2, 1, 3};
        double[] num3 = new double[num2.length];
        double resp = 0;

        for (int i = 0; i < num2.length; i++) {
            resp = num1[i] * num2[i];
            num3[i] = resp / 10;
        }

        System.out.print(Arrays.toString(num3));
    }
}

