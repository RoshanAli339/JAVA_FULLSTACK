import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int cnt = 0;
        while (num > 0){
            cnt++;
            num /= 10;
        }
        System.out.println("The number of digits is: " + cnt);
        sc.close();
    }
}
