class Question1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Enter 2 arguments!");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if (num1 == 0 || num2 == 0) {
            System.out.println("3");
            return;
        }
        System.out.println((num1 % num2 == 0) ? 2 : 1);
    }
}

class Question2 {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Enter 5 arguments!");
            return;
        }
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if ((Integer.parseInt(args[i]) & 1) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class Question3 {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Enter 5 arguments!");
            return;
        }
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if ((Integer.parseInt(args[i]) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class Question4 {
    public static void main(String[] args) {
        if (args.length < 6) {
            System.out.println("Six arguments required");
            return;
        }
        boolean evenOdd = args[5].equals("even");
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if ((Integer.parseInt(args[i]) & 1) == (evenOdd ? 0 : 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
