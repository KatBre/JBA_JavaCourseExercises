import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean firstIsPositive = a > 0 && b <= 0 && c <= 0;
        boolean secondIsPositive = a <= 0 && b > 0 && c <= 0;
        boolean thirdIsPositive = a <= 0 && b <= 0 && c > 0;
        boolean result = firstIsPositive || secondIsPositive || thirdIsPositive;
        System.out.println(result);

    }
}