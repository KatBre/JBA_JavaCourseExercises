import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberM = scanner.nextLong();
        long result = 1;
        int n = 1;
        while (result <= numberM) {
            n++;
            result *= n;
        }
        System.out.println(n);
    }
}