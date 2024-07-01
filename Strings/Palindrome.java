public class Palindrome {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Please provide an argument");
            return;
        }
        String word = args[0];
        boolean isPalindrome = true;

        for (int i = 0; i <= word.length()/2; i++){
            if (word.charAt(i) != word.charAt(word.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.println(word + " is a palindrome");
        }
        else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
