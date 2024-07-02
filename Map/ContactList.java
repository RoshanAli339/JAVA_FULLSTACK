import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {
    HashMap<String, String> contacts;
    ContactList(){
        contacts = new HashMap<String, String>();
    }
    void addContact(String contactName, String phone){
        this.contacts.put(contactName, phone);
    }
    String getContact(String contactName){
        return this.contacts.get(contactName);
    }
    boolean checkContact(String contactName){
        return this.contacts.containsKey(contactName);
    }
    boolean checkPhone(String phone){
        return this.contacts.containsValue(phone);
    }
    void iterateMap(){
        Iterator<Map.Entry<String, String>> iterator = this.contacts.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ContactList obj = new ContactList();
        obj.addContact("John", "8867766");
        obj.addContact("James", "5674356");
        obj.addContact("Karen", "5343566");

        System.out.println("Does John exist: " + obj.checkContact("John"));
        System.out.println("Does 54968464 exist: " + obj.checkContact("54968464"));
        obj.iterateMap();
    }
}
