import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        long currentAscending = number;
        long currentDescending = number;
        boolean ordered = true;
        while (number != 0) {
            number = scanner.nextInt();
            if (number >= currentAscending) {
                currentAscending = number;
            } else if (number <= currentDescending) {
                currentDescending = number;
            } else {
              ordered = false;
            }
        }
        System.out.println(ordered);
    }
}