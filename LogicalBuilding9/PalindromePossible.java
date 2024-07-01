import java.util.*;

public class PalindromePossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> st = new HashSet<>();
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int size = 0;
        while (temp != 0) {
            int digit = temp % 10;
            if (st.contains(digit)) {
                st.remove(digit);
            }
            else{
                st.add(digit);
            }
            temp /= 10;
            size++;
        }
        if (((size % 2 == 0) && (st.isEmpty())) ||((size % 2 == 1) && (st.size() == 1)) ) {
            System.out.println("Palindrome is possible");
        }
        else{
            System.out.println("Palindrome is not possible");
        }
        sc.close();
    }
}
