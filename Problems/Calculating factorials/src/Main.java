import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long result = 1;
        for (int factor = 2; factor <= n; factor++) {
            result *= factor;
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}