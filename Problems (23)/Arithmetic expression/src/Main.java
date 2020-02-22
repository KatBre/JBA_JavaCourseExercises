import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result = ((a + 1) * a + 2) * a + 3;
        System.out.println(result);
    }
}