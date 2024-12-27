package Day1;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// sample program to find or to calculate the area of a rectangle
		Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the length:");
        double l= s.nextDouble();
       System.out.println("Enter the breadth:");
        double b= s.nextDouble();
       
         
         double  area=l*b; //The formula to find out the area of the rectangle.
     System.out.println("Area of Rectangle is: " + area); 

	}

}
