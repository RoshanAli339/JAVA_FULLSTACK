class Animal  {
    void eat()  {
        System.out.println("Animal eats");
    }

    void sleep()  {
        System.out.println("Animal sleeps");
    }
}

class Bird extends Animal  {
    @Override
    void eat()  {
        System.out.println("Bird eats");
    }

    @Override
    void sleep()  {
        System.out.println("Bird sleeps");
    }

    void fly()  {
        System.out.println("Bird flys");
    }
}

class Question1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();

        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}

