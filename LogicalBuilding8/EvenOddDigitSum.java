import java.util.Scanner;

public class EvenOddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String numberType;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.print("Enter the type of number(even or odd): ");
        numberType = sc.next();
        int check = numberType.equals("even") ? 0 : 1;
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            if ((digit & 1) == check){
                sum += digit;
            }
            n /= 10;
        }
        System.out.println("The sum of digits: " + sum);
        sc.close();
    }
}
