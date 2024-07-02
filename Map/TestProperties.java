import java.util.Iterator;
import java.util.Properties;
public class TestProperties {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("Andhra Pradesh", "Amaravathi");
        props.put("Telangana", "Hyderabad");
        props.put("Maharashtra", "Mumbai");
        props.put("Karnataka", "Bangalore");

        Iterator<Object> itr = props.keySet().iterator();
        while (itr.hasNext()) {
            String state = (String) itr.next();
            System.out.println(state + ":" + props.getProperty(state));
        }
    }

}
