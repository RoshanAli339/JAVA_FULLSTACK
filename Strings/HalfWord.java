public class HalfWord {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a word");
            return;
        }
        String word = args[0];
        if (word.length() % 2 == 0)
            System.out.println(word.substring(0, word.length() / 2));
        else
            System.out.println("NULL");
    }
}
