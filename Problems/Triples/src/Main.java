import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int counter = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] + 1 == array[i + 1] && array[i] - 1 == array[i - 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}