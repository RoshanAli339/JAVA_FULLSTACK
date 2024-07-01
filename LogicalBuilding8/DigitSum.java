import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean isNegative = n < 0;
        n = isNegative ? -n : n;
        while (n >= 10){
            System.out.println("N=" + n);
            int sum = 0;
            while (n > 0){
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        n = isNegative ? -n : n;
        System.out.println("Digits sum: " + n);
        sc.close();
    }
}
