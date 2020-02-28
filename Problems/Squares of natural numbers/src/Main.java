import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int n = 1;
        int result;

        while ((result = n * n++) <= inputNumber) {
            System.out.println(result);
        }
    }
}