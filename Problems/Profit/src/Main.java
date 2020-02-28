import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;

        while (m < k) {
            m *= (1 + p / 100);
            count++;
        }
        System.out.println(count);
    }
}