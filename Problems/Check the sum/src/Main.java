import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean firstSum = (a + b) == 20;
        boolean secondSum = (a + c) == 20;
        boolean thirdSum = (b + c) == 20;
        boolean result = firstSum || secondSum || thirdSum;
        System.out.println(result);
    }
}