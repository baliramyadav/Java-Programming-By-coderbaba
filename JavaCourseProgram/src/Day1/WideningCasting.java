package Day1;

public class WideningCasting {

	public static void main(String[] args) {
		// Widening casting is done automatically when passing a smaller size type to a larger size type.
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0

	}

}
