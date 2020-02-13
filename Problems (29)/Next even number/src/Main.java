import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int nextEvenNumber = number - number % 2 + 2;
        System.out.println(nextEvenNumber);
    }
}