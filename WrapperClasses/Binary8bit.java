public class Binary8bit {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("One argument required!");
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.println(String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
    }
}
