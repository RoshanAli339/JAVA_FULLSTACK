public class Employee extends Person{
    Person p;
    private double annualSalary;
    private int yearOfStart;
    private String insuranceNumber;

    Employee(String name, double salary, int yearOfStart, String insuranceNumber){
        this.setName(name);
        this.setAnnualSalary(salary);
        this.setYearOfStart(yearOfStart);
        this.setInsuranceNumber(insuranceNumber);
    }

    void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }

    void setYearOfStart(int yearOfStart){
        this.yearOfStart = yearOfStart;
    }

    void setInsuranceNumber(String insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }

    double getAnnualSalary(){
        return this.annualSalary;
    }

    int getYearOfStart(){
        return this.yearOfStart;
    }

    String getInsuranceNumber(){
        return this.insuranceNumber;
    }
}
