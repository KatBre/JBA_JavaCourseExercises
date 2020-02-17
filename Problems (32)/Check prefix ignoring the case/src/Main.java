import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean result = word.toUpperCase().charAt(0) == 'J';
        System.out.println(result);
    }
}