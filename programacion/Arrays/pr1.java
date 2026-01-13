import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        int resp = 0;
        int[] numbers = {1, 4, 6, 10, -3, 4, 6, -5};
        for (int edad:numbers) {
            resp += edad;
        }
        System.out.println(resp);
    }
}