import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = scanner.nextInt();
        while (i != 0) {
            sum = sum + i;
            i = scanner.nextInt();
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }
        System.out.println(sum);

    }
}