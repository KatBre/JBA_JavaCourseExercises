import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentMax = 0;
        int number;
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            i++;
            number = scanner.nextInt();
            if (number % 4 == 0 && number > currentMax) {
                currentMax = number;
            }
        }
        System.out.println(currentMax);
    }
}