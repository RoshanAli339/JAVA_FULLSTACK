import com.serial.Employee;

import java.io.*;
import java.util.Date;

public class ObjectSerialization {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Roshan");
        emp.setDateOfBirth(new Date());
        emp.setDepartment("CSE");
        emp.setDesignation("Student");
        emp.setSalary(2000.00);

        try {
            FileOutputStream fileOut = new FileOutputStream("data");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is stored in data");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        Employee emp2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("data");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp2 = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Deserialized data is: ");
        assert emp2 != null;
        System.out.println("Name: " + emp2.getName());
        System.out.println("Date of Birth: " + emp2.getDateOfBirth().toString());
        System.out.println("Department: " + emp2.getDepartment());
        System.out.println("Designation: " + emp2.getDesignation());
        System.out.println("Salary: " + emp2.getSalary());
    }
}
