import java.util.Scanner;

public class WeightHill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int levels, head, weightIncr;
        System.out.println("Enter the values: ");
        levels = sc.nextInt();
        head = sc.nextInt();
        weightIncr = sc.nextInt();
        int totalWeight = 0;
        for (int level = 1; level <= levels; level++, head += weightIncr) {
            totalWeight += head * level;
        }
        System.out.println("Total weight is " + totalWeight);
        sc.close();
    }
}
