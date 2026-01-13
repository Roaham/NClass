import java.util.Arrays;

public class pr4 {
    public static void main(String[] args) {
        int[] ini = {2, 3, 4, 7, 8, 10, 11};

        int min = 0;
        int max = 0;

        for (int num:ini) {
            if (num < 6) {
                min +=1;
            }
            else {
                max +=1;
            }
        }

        int[] min6 = new int[min];
        int[] max6 = new int[max];

        int minus = 0;
        int plus = 0;

        for (int num:ini) {
            if (num < 6) {
                min6[minus++] = num;
            } else if (num > 6) {
                max6[plus++] = num;
            }
        }

        System.out.println(Arrays.toString(min6));
        System.out.println(Arrays.toString(max6));

    }
}
