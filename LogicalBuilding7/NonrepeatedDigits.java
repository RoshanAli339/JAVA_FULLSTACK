import java.util.*;

public class NonrepeatedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> mp = new HashMap<>();
        int cnt = 0;
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        while (n > 0){
            int rem = n % 10;
            mp.put(rem, mp.getOrDefault(rem, 0) + 1);
            n /= 10;
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if (entry.getValue() == 1){
                cnt++;
            }
        }
        System.out.println("The number of non-repeated digits is: " + cnt);
        sc.close();
    }
}
