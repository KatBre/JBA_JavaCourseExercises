import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHours = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();
        int secondHours = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();
        int numberOfSeconds = (secondHours - firstHours) * 3600 + (secondMinutes - firstMinutes) * 60 + (secondSeconds - firstSeconds);
        System.out.println(numberOfSeconds);
    }
}