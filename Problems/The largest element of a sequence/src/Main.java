import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentMax = 0;
        int number;

        do {
            number = scanner.nextInt();
            if (number > currentMax) {
                currentMax = number;
            }
        } while (number != 0);
        System.out.println(currentMax);
    }
}