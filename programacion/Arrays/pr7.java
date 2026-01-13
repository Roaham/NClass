import java.util.Arrays;

public class pr7 {
    public static void main(String[] args) {
        int[] ini = {2, 3, 4, 7, 8, 10, 11};
        int[] resp = new int[ini.length];

        for (int i = 0, incremento = 10; i < resp.length; i++, incremento*=10) {
            resp[i] = ini[i] * incremento;
        }

        System.out.println(Arrays.toString(resp));
    }
}
