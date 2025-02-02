package Day1;

public class RightTriangleStarPattern {
	public static void right_triangle(int n)
	{
		int i, j;
		
		// outer loop is used to handle number of rows
		for(i=0; i<n; i++)
		{
			// inner loop is used to handle number of columns
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;  //Number of Rows
		right_triangle(n);
	}

}
