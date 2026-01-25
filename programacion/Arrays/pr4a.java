import java.util.Arrays;

public class pr4a {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 7, 8, 10, 11};
        int[] num1 = new int[7];
        int[] num2 = new int[7];
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] <= 6) {
                num1[i] += num[i];
            }
            else {
                num2[i] += num[i];
            }
        }

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }
}
