import java.util.Arrays;

public class pr7a {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 7, 8};
        int[] num1 = new int[num.length];
        int count = 10;

        for (int i = 0; i < num.length; i++) {
            num1[i] += num[i] * count;
            count *= 10;
        }

        System.out.println(Arrays.toString(num1));
    }
}