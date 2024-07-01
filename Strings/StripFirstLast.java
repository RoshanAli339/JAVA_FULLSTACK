public class StripFirstLast {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Please enter a word");
            return;
        }

        String word = args[0];
        System.out.println(word.substring(1, word.length()-1));
    }
}
