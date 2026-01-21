import java.util.Arrays;

public class pr22 {
    public static void main(String[] args) {
        int[][] ram = {
            {0,  1,  2,  3,  4},
            {0,  1,  2,  3,  4},
            {0,  1,  2,  3,  4},
            {0,  1,  2,  3,  4},
            {0,  1,  2,  3,  4}
        };

        for (int i[]:ram) {
            System.out.println(Arrays.toString(i));
        }
    }
}
