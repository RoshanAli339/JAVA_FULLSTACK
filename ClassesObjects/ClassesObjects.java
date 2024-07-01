class Box{
    double width, depth, height;
    Box(double width, double height, double depth){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    double calculateVolume(){
        return this.width * this.height * this.depth;
    }
}

class Question1{
    public static void main(String[] args){
        double w = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double d = Double.parseDouble(args[2]);

        Box b1 = new Box(w, h, d);

        System.out.println("Volume of box : " + b1.calculateVolume());
    }
}

class Calculator{
    static int powerInt(int num1, int num2){
        return (int)Math.pow(num1, num2);
    }

    static double powerDouble(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println("powerInt(3, 4) : " + powerInt(3, 4));
        System.out.println("powerDouble(4.5, 3.0) : " + powerDouble(4.5, 3.0));
    }
}