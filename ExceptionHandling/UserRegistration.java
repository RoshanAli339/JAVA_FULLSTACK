import java.util.Scanner;

class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {
    void registerUser(String username, String country) throws InvalidCountryException {
        if (country.equals("India")){
            System.out.println("User registration done successfully");
        }
        else{
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        String username = sc.nextLine();
        System.out.print("Enter country:");
        String country = sc.nextLine();
        UserRegistration reg = new UserRegistration();
        try{
            reg.registerUser(username, country);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
