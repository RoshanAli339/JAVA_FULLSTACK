import java.util.HashMap;
import java.util.Iterator;

public class TestHashmap {
    public static void main(String[] args) {
        HashMap<String, String> M1 = new HashMap<>();
        M1.put("Key1", "Value1");
        M1.put("Key2", "Value2");
        M1.put("Key3", "Value3");
        M1.put("Key4", "Value4");

        System.out.println("Checking if Value 2 present or not: " + M1.containsValue("Value2"));
        System.out.println("Checking if Key 5 present or not: " + M1.containsKey("Key5"));
        Iterator<String> it = M1.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
