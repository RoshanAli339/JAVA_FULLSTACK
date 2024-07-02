import java.util.NavigableSet;

public class TestTreeset {
    public static void main(String[] args) {
        Treeset ts = new Treeset();
        ts.set.add("John");
        ts.set.add("Jake");
        ts.set.add("Mary");
        ts.set.add("Steven");

        System.out.println("Employee Names: ");
        ts.printSet();

        System.out.println("Employee Names in reverse order: ");
        NavigableSet<String> ns = ts.reverseSet();
        for (String name : ns) {
            System.out.println(name);
        }

        System.out.println("Checking if John is present: " + ts.valueExists("John"));
        System.out.println("Checking if Karen is present: " + ts.valueExists("Karen"));
    }
}
