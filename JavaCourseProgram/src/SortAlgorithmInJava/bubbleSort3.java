package SortAlgorithmInJava;
import java.util.ArrayList;
import java.util.Collections;
public class bubbleSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
	}

}
