class Question1{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        if ((n & 1) == 0)
            System.out.println("Even number");
        else
            System.out.println("Not even number");
    }
}

class Question2{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if ((n & 1) == 1)
            System.out.println("Odd number");
        else
            System.out.println("Not odd number");
    }
}

class Question3{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(Math.abs(n)%10);
    }
}

class Question4{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println((Math.abs(n)%100)/10);
    }
}

class Question5{
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println((Math.abs(n1)%10) + (Math.abs(n2) % 10));
    }
}