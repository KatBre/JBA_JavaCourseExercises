import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = scanner.nextLine().endsWith("burg");
        System.out.println(result);
        // System.out.println(new Scanner(System.in).nextLine().endsWith("burg")); // other solution
    }
}