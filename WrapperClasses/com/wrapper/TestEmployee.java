package com.wrapper;

class Employee {
    String name;
    double salary;
    String empId;

    Employee(String n, double sal, String empId) {
        this.name = n;
        this.salary = sal;
        this.empId = empId;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Smith", 100.00, "johnsmith");
        System.out.println("Employee1 Name: " + e1.name);
        System.out.println("Employee1 Salary: " + e1.salary);
        System.out.println("Employee1 ID: " + e1.empId);
        Employee e2 = e1;
        System.out.println("Employee2 Name: " + e2.name);
        System.out.println("Employee2 Salary: " + e2.salary);
        System.out.println("Employee2 ID: " + e2.empId);
        System.out.println("Changing salary of Employee 1!");
        e1.salary = 200.00;
        System.out.println("Employee1 Salary: " + e1.salary);
        System.out.println("Employee2 Salary: " + e2.salary);
    }
}