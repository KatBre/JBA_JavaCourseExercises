import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[] array = new int[a];
        boolean ascending = true;
        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i - 1] > array[i]) {
                ascending = false;
                break;
            }
        }
        System.out.println(ascending);
    }
}