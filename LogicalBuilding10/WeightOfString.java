import java.util.Scanner;

public class WeightOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("Include vowel?: ");
        int vowel = sc.nextInt();
        boolean addVowel = vowel == 1;
        int weight = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                boolean isVowel = switch (c) {
                    case 'a', 'e', 'i', 'o', 'u' -> true;
                    default -> false;
                };
                if (!isVowel || addVowel){
                    weight += (int)c - 96;
                }
            }
        }
        System.out.println("Weight of string: " + weight);
        sc.close();
    }
}
