package emp;

import emp.*;
import java.util.*;

public class EmployeeDB {
    ArrayList<Employee> employees = new ArrayList<>();

    public boolean addEmployee(Employee emp) {
        try{
            employees.add(emp);
        }
        catch(Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean deleteEmployee(Employee emp) {
        if (employees.contains(emp)) {
            employees.remove(emp);
            return true;
        }
        else{
            return false;
        }
    }

    public String showPaySlip(int empId) {
        String salary = "";
        for (Employee employee : employees) {
            if (employee.empId == empId) {
                salary = Float.toString(employee.salary);
                break;
            }
        }
        return salary;
    }
}
