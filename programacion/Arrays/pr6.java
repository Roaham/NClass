import java.util.Arrays;

public class pr6 {
    public static void main(String[] args) {
        int[] ini = {2, 3, 4, 7, 8, 10, 11};
        int[] resp = new int[ini.length];

        for (int i = 0; i < ini.length; i++) {
            if (i % 2 == 0) {
                resp[i] = ini[i];
            }
            else {
                resp[i] = 0;
            }
        }

        System.out.print(Arrays.toString(resp));
    }
}
