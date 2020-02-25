import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = scanner.nextInt();
        while (number > 0) {
            number = scanner.nextInt();
            count++;
        }
        System.out.println(count);
    }
}