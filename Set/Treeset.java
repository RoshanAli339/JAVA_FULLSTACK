import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Treeset {
    TreeSet<String> set;
    public Treeset() {
        set  = new TreeSet<>();
    }

    public NavigableSet<String> reverseSet(){
        return this.set.descendingSet();
    }

    public void printSet(){
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public boolean valueExists(String value){
        return this.set.contains(value);
    }
}
