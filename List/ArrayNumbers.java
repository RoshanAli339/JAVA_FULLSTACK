import java.util.ArrayList;

public class ArrayNumbers {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<Number>();

        numberList.add(2);
        numberList.add(123.324);
        numberList.add(122.445f);

        System.out.println(numberList);
    }
}
