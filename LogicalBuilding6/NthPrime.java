public class NthPrime {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide an argument");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int count = 0, i = 2;
        while (count <= 1000){
            boolean isPrime = true;
            for (int j = 2; j <= (int)Math.sqrt(i); j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
            }
            if (count == n)
                break;
            i++;
        }
        System.out.println(n + "th prime number is " + i);
    }
}
