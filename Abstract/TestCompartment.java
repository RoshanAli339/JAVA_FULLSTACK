abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is a First Class Compartment";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is a Ladies Compartment";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "This is a General Compartment";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is a Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * (4 - 1)) + 1;
            switch(random){
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }

    }
}
