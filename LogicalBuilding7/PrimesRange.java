import java.util.Scanner;

public class PrimesRange {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int cnt = 0;
        for (int i = n1; i <= n2; i++){
            boolean isPrime = true;
            for (int j = 2; j <= (int)Math.sqrt(i); j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                cnt++;
            }
        }
        System.out.println("The number of primes is: " + cnt);
    }
}
