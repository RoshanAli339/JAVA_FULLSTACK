class Question1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Two arguments are required!");
            return;
        }
        System.out.println(args[0] + " Technologies " + args[1]);
        return;
    }
}

class Question2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("1 argument required!");
            return;
        }
        System.out.println("Welcome " + args[0]);
        return;
    }
}

class Question3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Only 2 numbers are allowed to be given");
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        return;
    }
}
