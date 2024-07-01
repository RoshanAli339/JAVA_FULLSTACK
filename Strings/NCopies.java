public class NCopies {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide an arguments");
            return;
        }

        int n = args[0].length();
        String first2Chars = args[0].substring(0, 2);
        String result = "";
        for (int i = 1; i <= n; i++){
            result += first2Chars;
        }
        System.out.println(result);
    }
}
