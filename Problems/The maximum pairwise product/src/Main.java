import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int result = 0;
        int temporary;
        for (int i = 0; i < array.length - 1; i++) {
            temporary = array[i] * array[i + 1];
            if (temporary >= result) {
                result = temporary;
            }
        }
        System.out.println(result);
    }
}