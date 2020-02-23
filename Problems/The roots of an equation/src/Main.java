import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        int count = 0;

        for (long x = 0; x <= 1000 && count < 4; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
                count += 1;
            }
        }
    }
}