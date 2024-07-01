public class Factorial {

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Please provide an argument");
            return;
        }
        int f = factorial(Integer.parseInt(args[0]));
        System.out.println(f);
    }
}
