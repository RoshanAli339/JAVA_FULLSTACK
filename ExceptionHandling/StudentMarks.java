import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class ValueOutOfRangeException extends Exception {
    public ValueOutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarks {
    static double calculateAvg () throws NegativeNumberException, ValueOutOfRangeException, NumberFormatException {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < 3; i++){
            int v = Integer.parseInt(sc.nextLine());
            if (v < 0){
                throw new NegativeNumberException("Negative number not accepted");
            }
            if (v > 100){
                throw new ValueOutOfRangeException("Value out of range");
            }
            sum += v;
        }
        avg = (double) sum / 3;
        sc.close();
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter student 1 name : ");
            String student1 = sc.nextLine();
            System.out.print("Enter marks of " + student1 + ": ");
            double avg1 =  calculateAvg();
            System.out.println("Average marks of " + student1 + " is " + avg1);
            System.out.println("Enter student 2 name : ");
            String student2 = sc.nextLine();
            System.out.print("Enter marks of " + student2 + ": ");
            double avg2 =  calculateAvg();
            System.out.println("Average marks of " + student2 + " is " + avg2);
        }
        catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
        catch (NegativeNumberException e){
            System.out.println("NegativeNumberException: " + e.getMessage());
        }
        catch (ValueOutOfRangeException e){
            System.out.println("ValueOutOfRangeException: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
