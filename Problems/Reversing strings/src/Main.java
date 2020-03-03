import java.util.*;

public class Main {

    public static String[] reverse(String[] words) {
        Collections.reverse(Arrays.asList(words));
        return words.clone();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
    }
}