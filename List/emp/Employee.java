package emp;

public class Employee {
    int empId;
    String empName, email, gender;
    float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void GetEmployeeDetails(){
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Employee Email: " + this.email);
        System.out.println("Employee Gender: " + this.gender);
        System.out.println("Employee Salary: " + this.salary);
    }
}
