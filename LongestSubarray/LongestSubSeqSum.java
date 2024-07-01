import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubSeqSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n;
        System.out.print("Enter number of elements: ");
        n = scanner.nextInt();
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        int l = 0, r = 0, sum = 0;
        int maxLen = Integer.MIN_VALUE, maxSum = Integer.MIN_VALUE;

        while (r < arr.size()){
            if (arr.get(r) % 2 == 1){
                sum += arr.get(r);
                maxLen = Math.max(maxLen, r - l);
                maxSum = Math.max(maxSum, sum);
            }
            else{
                sum = 0;
                l = r;
            }
            r++;
        }
        System.out.println("Longest odd sub sequence is of length: " + maxLen);
        System.out.println("Longest odd sub sequence sum is: " + maxSum);
    }
}
