public class pr2 {
    public static void main(String[] args) {
        int[] num1 = {1, 3, 5, 7, 8};
        int[] num2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < num1.length; i++) {
            int resp = num1[i] + num2[i];
            System.out.println(resp);
        }
    }
}
