import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notes = new double[5];
        int counter = 0;
        double resp = 0;

        do {
            System.out.println("Introduce una nota:");
            String note = sc.nextLine();
            notes[counter] = Double.parseDouble(note);
            counter++;
        } while (counter < notes.length);

        for (int i = 0; i < notes.length; i++) {
            resp += notes[i];
        }

        double average = resp / notes.length;

        System.out.println(average);
    }
}
