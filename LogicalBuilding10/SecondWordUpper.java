import java.util.Scanner;

public class SecondWordUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ", 0);
        if (words.length < 2)
            System.out.println("LESS");
        else
            System.out.println(words[1].toUpperCase());
        sc.close();
    }
}
