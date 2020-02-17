import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        boolean areWordsEqual = firstWord.replaceAll(" ", "").equals(secondWord.replaceAll(" ", ""));
        System.out.println(areWordsEqual);
    }
}