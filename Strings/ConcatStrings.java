public class ConcatStrings {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide at least 2 arguments");
            return;
        }
        String w1 = args[0].toLowerCase();
        String w2 = args[1].toLowerCase();
        String w3;
        if (w1.charAt(w1.length() - 1) == w2.charAt(0)) {
            w3 = w1.substring(0, w1.length() - 1) + w2;
        }
        else {
            w3 = w1 + " " + w2;
        }

        System.out.println(w3);
    }
}
