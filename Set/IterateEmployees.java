import java.util.HashSet;
import java.util.Iterator;

public class IterateEmployees {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("John");
        hs.add("Jane");
        hs.add("Bob");
        hs.add("Steven");

        Iterator<String> it = hs.iterator();

        System.out.println("Employee names using iterator: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
