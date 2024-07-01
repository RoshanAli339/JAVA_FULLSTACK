import java.util.Iterator;
import java.util.Vector;
import emp.Employee;

public class VectorEmployee {
    public static void main(String[] args) {
        Vector<Employee> v = new Vector<>();
        v.add(new Employee(1234, "Roshan", "roshan@gmail.com", "male", 234.52f));
        v.add(new Employee(6567, "Karthik", "karthik@gmail.com", "male", 66345f));
        v.add(new Employee(5462, "Neeraj", "neeraj@gmail.com", "male", 9975.23f));

        Iterator<Employee> i = v.iterator();

        while (i.hasNext()) {
            i.next().GetEmployeeDetails();
            System.out.println();
        }
    }
}
