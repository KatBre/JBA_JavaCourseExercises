// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[] array = new int[a];
        boolean ascending = false;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > array[i + 1]) {
                ascending = true;
            }
        }
        System.out.println(ascending);
    }
}