package Day2.Javaprogram; 
import java.util.Scanner;
public class Squarestar2 {

	public static void main(String[] args) {
		// Using For Loop
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt();	 
	              System.out.print("Enter Symbol : ");
		
	        char c = sc.next().charAt(0);
	 
		for(int i=0;i<n;i++)
	               {
		
	                       for(int j=0;j<n;j++)
	                
	                       {
	                               System.out.print(c);
	                       }
	                     System.out.println();
	               }       

	}

}
