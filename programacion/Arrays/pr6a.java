import java.util.Arrays;

public class pr6a {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 7, 8, 10, 11};
        int[] num1 = new int[num.length * 2];

        for (int i = 0; i < num.length; i++) {
            num1[i * 2] = num[i];
            num1[i * 2 + 1] = 0;
        }

        System.out.println(Arrays.toString(num1));
    }
}