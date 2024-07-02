import java.util.Scanner;

public class FreqDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.println("Enter four numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        int[] digCount = new int[10];
        int maxFreq = -1;
        int maxFreqNum = -1;
        while (n1 > 0){
            int digit = n1 % 10;
            digCount[digit]++;
            if (digCount[digit] > maxFreq){
                maxFreq = digCount[digit];
                maxFreqNum = digit;
            }
            else if (digCount[digit] == maxFreq){
                maxFreqNum = Math.max(maxFreqNum, digit);
            }
            n1 /= 10;
        }
        while (n2 > 0){
            int digit = n2 % 10;
            digCount[digit]++;
            if (digCount[digit] > maxFreq){
                maxFreq = digCount[digit];
                maxFreqNum = digit;
            }
            else if (digCount[digit] == maxFreq){
                maxFreqNum = Math.max(maxFreqNum, digit);
            }
            n2 /= 10;
        }
        while (n3 > 0){
            int digit = n3 % 10;
            digCount[digit]++;
            if (digCount[digit] > maxFreq){
                maxFreq = digCount[digit];
                maxFreqNum = digit;
            }
            else if (digCount[digit] == maxFreq){
                maxFreqNum = Math.max(maxFreqNum, digit);
            }
            n3 /= 10;
        }
        while (n4 > 0){
            int digit = n4 % 10;
            digCount[digit]++;
            if (digCount[digit] > maxFreq){
                maxFreq = digCount[digit];
                maxFreqNum = digit;
            }
            else if (digCount[digit] == maxFreq){
                maxFreqNum = Math.max(maxFreqNum, digit);
            }
            n4 /= 10;
        }
        System.out.println("Maximum frequency digit: " + maxFreqNum);
        sc.close();
    }
}
