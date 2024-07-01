import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
    static void printAll(ArrayList<String> list){
        Iterator<String> iter = list.iterator();
        System.out.println("Array list: ");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        printAll(list);
    }
}
