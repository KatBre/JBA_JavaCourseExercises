import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            }
        int[] result = new int[a];
        result[0] = array[array.length - 1];
        System.out.print(result[0] + " ");
        for (int i = 1; i < result.length; i++) {
            result[i] = array[i - 1];
            System.out.print(result[i] + " ");
        }
    }
}