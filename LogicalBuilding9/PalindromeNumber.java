import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (rev == num) {
            System.out.println("It is a palindrome.");
        }
        else {
            System.out.println("It is not a palindrome.");
        }
        sc.close();
    }
}
