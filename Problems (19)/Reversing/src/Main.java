import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 100;
        int c = (a % 100) / 10;
        int d = a % 10;
        System.out.println(d + "" + c + "" + b);
    }
}