/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int result = Integer.parseInt(args[1]);
        if ("MAX".equals(operator)) {
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) > result) {
                    result = Integer.parseInt(args[i]);
                }
            }
            System.out.println(result);
        } else if ("MIN".equals(operator)) {
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < result) {
                    result = Integer.parseInt(args[i]);
                }
            }
            System.out.println(result);
        } else if ("SUM".equals(operator)) {
            for (int i = 1; i < args.length; i++) {
                result += Integer.parseInt(args[i]);
                System.out.println(result);
            }
        } else {
            System.out.println("Unknown operator");
        }
    }
}