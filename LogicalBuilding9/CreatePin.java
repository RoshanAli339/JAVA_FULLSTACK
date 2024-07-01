import java.util.Scanner;

public class CreatePin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int dig1, dig2, dig3, dig4;
        dig1 = Math.min(n1%10, Math.min(n2%10, n3%10));
        dig2 = Math.min((n1/10)%10, Math.min((n2/10)%10, (n3/10)%10));
        dig3 = Math.min(n1/100, Math.min(n2/100, n3/100));
        dig4 = Integer.MIN_VALUE;
        while (n1 > 0){
            dig4 = Math.max(dig4, n1 % 10);
            n1 /= 10;
        }
        while (n2 > 0){
            dig4 = Math.max(dig4, n2 % 10);
            n2 /= 10;
        }
        while (n3 > 0){
            dig4 = Math.max(dig4, n3 % 10);
            n3 /= 10;
        }
        int pin = (dig4*1000) + (dig3 * 100) + (dig2*10) + dig1;
        System.out.println("The PIN is: " + pin);
        sc.close();
    }
}
