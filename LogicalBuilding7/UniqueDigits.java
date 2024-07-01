import java.util.*;

public class UniqueDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        while(num > 0){
           int rem = num % 10;
           set.add(rem);
           num = num / 10;
        }
        System.out.println("The number of unique digits is: " + set.size());
        sc.close();
    }
}
