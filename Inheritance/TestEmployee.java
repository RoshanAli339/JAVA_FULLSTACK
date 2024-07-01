public class TestEmployee {

    public static void main(String[] args) {
        String name = "John Grisham";
        double annualSalary = 50000.0;
        int yearOfStart = 2017;
        String insuranceNumber = "534534634563";

        Employee e = new Employee(name, annualSalary, yearOfStart, insuranceNumber);

        System.out.println("Employee name : " + e.getName());
        System.out.println("Employee annual salary : " + e.getAnnualSalary());
        System.out.println("Employee year of start : " + e.getYearOfStart());
        System.out.println("Employee insurance number : " + e.getInsuranceNumber());
    }
}
