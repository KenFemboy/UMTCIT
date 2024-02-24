package ArrayListActivityFile;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListIntReversed {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        System.out.println("Integers: " + numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Integers: " + numbers);
    }
}
