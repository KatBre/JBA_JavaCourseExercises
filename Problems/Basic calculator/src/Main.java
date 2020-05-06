class Problem {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[0].equals("+")) {
                System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
                return;
            } else if (args[0].equals("-")) {
                System.out.println(Integer.parseInt(args[1]) - Integer.parseInt(args[2]));
                return;
            } else if (args[0].equals("*")) {
                System.out.println(Integer.parseInt(args[1]) * Integer.parseInt(args[2]));
                return;
            }
        }
        System.out.println("Unknown operator");
    }
}