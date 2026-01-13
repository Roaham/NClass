import java.util.Arrays;

public class pr5 {
    public static void main(String[] args) {
        int[] ini = {2, 3, 4, 7, 8, 10, 11};

        int par = 0;
        int impar = 0;

        for (int num:ini) {
            if (num % 2 == 0) {
                par +=1;
            }
            else {
                impar +=1;
            }
        }

        int[] min6 = new int[par];
        int[] max6 = new int[impar];

        int minus = 0;
        int plus = 0;

        for (int num:ini) {
            if (num % 2 == 0) {
                min6[minus++] = num;
            } else {
                max6[plus++] = num;
            }
        }

        System.out.println(Arrays.toString(min6));
        System.out.println(Arrays.toString(max6));

    }
}
