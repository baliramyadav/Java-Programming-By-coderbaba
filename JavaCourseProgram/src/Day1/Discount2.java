
package Day1;

import java.util.Scanner;

public class Discount2 {

	public static void main(String[] args) {
		// Taking inputs through scanner class, with sample output.
		double  dis,amount,markedprice,s;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter markedprice ");	
			           
			markedprice=sc.nextDouble();
 
			    System.out.println("enter discount percentage ");	
			           
			dis=sc.nextDouble();
		}
		
		s=100-dis;
	 
		amount= (s*markedprice)/100;
	 
		System.out.println("amount after discount="+amount);

	}

}
