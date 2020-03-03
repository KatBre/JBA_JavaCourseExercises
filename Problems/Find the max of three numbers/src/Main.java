public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int number = 0;
        if (a >= b && a >= c) {
            number = 1;
        } else if (b >= a && b >= c) {
            number = 2;
        } else {
            number = 3;
        }
        return number;
    }
}