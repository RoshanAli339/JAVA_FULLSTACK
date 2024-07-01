public class NumberSystem {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("One argument is required");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.println("Give Number: " + n);
        System.out.println("Binary equivalent: " + Integer.toBinaryString(n));
        System.out.println("Octal equivalent: " + Integer.toOctalString(n));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(n));
    }
}
