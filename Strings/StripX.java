public class StripX {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a word ");
            return;
        }
        String word = args[0];
        if (word.charAt(0) == 'x')
            word = word.substring(1);
        if (word.charAt(word.length() - 1) == 'x')
            word = word.substring(0, word.length() - 1);
        System.out.println(word);
    }
}
