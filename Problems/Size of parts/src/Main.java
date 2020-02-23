import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        int shipped = 0;
        int fixed = 0;
        int reject = 0;
        int parts;

        for (int i = 0; i < n; i++) {
            parts = scanner.nextInt();
            if (parts == 1) {
                shipped++;
            } else if (parts == -1) {
                fixed++;
            } else {
                reject++;
            }
        }
        System.out.println(reject + " " + shipped + " " + fixed);
    }
}