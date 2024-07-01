class Fruit {
    String name, taste, size;

    void eat(){
        System.out.println("Name of the fruit " );
        System.out.println("Taste of the fruit ");
        System.out.println("Size of the fruit ");
    }
}

class Apple extends Fruit {
    Apple(){
        this.name = "Apple";
        this.size = "Medium";
        this.taste = "sweet";
    }

    @Override
    void eat(){
        System.out.println("Name : " + this.name);
        System.out.println("Size : " + this.size);
        System.out.println("Taste : " + this.taste);
    }
}

class Orange extends Fruit {
    Orange(){
        this.name = "Orange";
        this.size = "Medium";
        this.taste = "sour";
    }

    @Override
    void eat(){
        System.out.println("Name : " + this.name);
        System.out.println("Size : " + this.size);
        System.out.println("Taste : " + this.taste);
    }
}

public class TestFruit {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        apple.eat();
        orange.eat();
    }
}
