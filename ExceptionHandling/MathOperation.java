public class MathOperation {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("5 arguments required");
            return;
        }
        int[] arr = new int[5];
        int sum = 0;
        double avg = 0.0;
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }
            avg = (double) sum / 5;
            System.out.println("Sum of elements in the array is: " + sum);
            System.out.println("Average of elements in the array is: " + avg);
        }
        catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
        catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException");
        }
    }
}
