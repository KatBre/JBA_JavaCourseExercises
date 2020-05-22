import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
                result = i;
            }
        }
        System.out.println(result);
    }
}