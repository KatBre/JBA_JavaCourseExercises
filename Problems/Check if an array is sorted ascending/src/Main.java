import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[] array = new int[a];
        boolean ascending = true;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < array[i - 1]) {
                ascending = false;
            }
        }
        System.out.println(ascending);
    }
}