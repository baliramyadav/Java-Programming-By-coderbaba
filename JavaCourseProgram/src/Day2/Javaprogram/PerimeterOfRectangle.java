package Day2.Javaprogram;
import java.util.Scanner;
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// Find Perimeter Of Rectangle | 3 Ways
		Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the length of the Rectangle:");
        
	 double l= s.nextDouble();
	 
	 System.out.println("Enter the width of the Rectangle:");
        
	 double b= s.nextDouble();
         
        double  perimeter=2*(l+b);
     
	 System.out.println("perimeter of Rectangle is: " + perimeter);

	}

}
