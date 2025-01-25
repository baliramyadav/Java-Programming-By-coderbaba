package SortAlgorithmInJava;
import java.util.ArrayList;
import java.util.Collections;
public class ShufflingUsingshuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sorted ArrayList: " + numbers);

        // Using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);
	}

}
