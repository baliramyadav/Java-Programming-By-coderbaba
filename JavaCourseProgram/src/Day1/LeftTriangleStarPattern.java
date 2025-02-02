package Day1;

public class LeftTriangleStarPattern {
	public static void Star_left_Triangle(int n)
	{
		int i, j;

		// Outer loop to handle number of rows
		for (i = 0; i < n; i++) {

			// Loop to print spaces
			for (j = 2 * (n - i - 1); j >= 0; j--) {
				System.out.print(" ");
			}

			// Loop to print stars
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // Number of Rows
		Star_left_Triangle(n);
	}

}
