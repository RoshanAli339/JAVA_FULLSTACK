import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array");
            int n = Integer.parseInt(sc.nextLine());
            int[] arr = new int[n];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Enter the index of the element in the array you want to access");
            int x = Integer.parseInt(sc.nextLine());
            System.out.println("The array element at the index " + x + " = " + arr[x]);
            System.out.println("The array element accessed successfully");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
    }
}
