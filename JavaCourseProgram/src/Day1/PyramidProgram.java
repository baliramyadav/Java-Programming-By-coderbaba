package Day1;

public class PyramidProgram {
	public static void print_pyramid(int n)
	{
		// outer loop is used to handle number of rows
		for (int i=0; i<n; i++)
		{
			// inner loop to handles the number of spaces
			
			for (int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}

			//This inner loop is used to handle number of columns
			for (int j=0; j<=i; j++ )
			{
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // Number of rows
		print_pyramid(n);
	}

}
