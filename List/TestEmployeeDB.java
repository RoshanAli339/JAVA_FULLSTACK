import emp.*;
import emp.Employee;

import java.util.*;

public class TestEmployeeDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDB empDB = new EmployeeDB();
        for (int i = 0; i < 3; i++) {
            int id;
            String name, email, gender;
            float salary;
            System.out.println("Enter details of employee " + (i+1) + ": ");
            System.out.print("Employee ID: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Gender: ");
            gender = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextFloat();
            if (empDB.addEmployee(new Employee(id, name, email, gender, salary))){
                System.out.println("Employee " + id + " successfully added");
            }
            else{
                System.out.println("Error creating employee");
            }
            System.out.println();
        }

        int searchId;
        System.out.println();
        System.out.print("Enter employee ID: ");
        searchId = sc.nextInt();
        String paySlip = empDB.showPaySlip(searchId);
        if (paySlip.isEmpty()){
            System.out.println("Employee ID not found");
        }
        else{
            System.out.println("Salary of employee " + searchId + " : " + paySlip);
        }
        sc.close();
    }
}
