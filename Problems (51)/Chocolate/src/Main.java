import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (k <= m * n && n * m % 2 == 0 && n * m % k >= 1) {
            System.out.println("YES");
        } else if (k > n * m && n * m % 2 != 0 && n * m % k == 1) {
            System.out.println("NO");
        }
    }
}