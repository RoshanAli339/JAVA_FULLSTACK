import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static Map<Integer, Integer> memoize;

    static {
        memoize = new HashMap<>();
        memoize.put(1, 0);
        memoize.put(2, 1);
    }

    static int fib(int n) {
        if (memoize.containsKey(n)) return memoize.get(n);
        memoize.put(n, fib(n - 1) + fib(n - 2));
        return memoize.get(n);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide an argument");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int fibonacci = fib(num);
        System.out.println(num + "th fibonacci is : " + fibonacci);
    }
}
