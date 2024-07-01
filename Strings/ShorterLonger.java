public class ShorterLonger {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Please enter 2 arguments");
            return;
        }

        String w1 = args[0].length() < args[1].length() ? args[0] : args[1];
        String w2 = args[0].length() < args[1].length() ? args[1] : args[0];
        String w3 = w1 + w2 + w1;
        System.out.println(w3);
    }
}
