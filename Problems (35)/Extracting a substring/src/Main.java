import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        int firstIndex = scanner1.nextInt();
        int secondIndex = scanner1.nextInt();
        String result = inputWord.substring(firstIndex, secondIndex + 1);
        System.out.println(result);

        // System.out.println(scanner.next().substring(scanner.nextInt(), scanner.nextInt() + 1)); // solution
    }
}