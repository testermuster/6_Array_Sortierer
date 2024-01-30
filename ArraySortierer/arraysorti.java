import java.util.Scanner;
import java.util.Arrays;

public class arraysorti {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Elemente ein: ");
        int anzahl = scanner.nextInt();
        int[] zahlen = new int[anzahl];

        System.out.println("Geben Sie " + anzahl + " Zahlen ein:");
        for (int i = 0; i < anzahl; i++) {
            zahlen[i] = scanner.nextInt();
        }

        Arrays.sort(zahlen);

        System.out.println("Sortiertes Array:");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }

        scanner.close();
    }
}
