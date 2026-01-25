
public class pr1a {
    public static void main(String[] args) {
        int[] table = {1, 4, 6, 10, -3, 4, 6, -5};
        int resp = 0;

        for (int i = 0; i < table.length; i++) {
            resp += table[i]; 
        }

        System.out.println(resp);
    }
}
