class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeCheck {
    void validateAge(int age) throws InvalidAgeException {
        if (age >= 18 && age < 60){
            System.out.println("Eligible");
        }
        else {
            throw new InvalidAgeException("Not Eligible");
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("2 arguments required");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        try{
            AgeCheck obj = new AgeCheck();
            obj.validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
