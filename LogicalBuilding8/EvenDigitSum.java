import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            if ((digit & 1) == 0)
                sum += digit;
            num = num / 10;
        }
        System.out.println("The sum of even digits : " + sum);
        sc.close();
    }
}
