package Day2.Javaprogram;
import java.util.Scanner;
public class RarrowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt();	 
	              System.out.print("Enter Symbol : ");
		
	              char c = sc.next().charAt(0);
	 
	 
	 
	    
	 
		for(int i=0;i<n;i++)
	               {
		        for(int j=0;j<n;j++)
	                
	                        {
	                              if(j<i)
	                               System.out.print("  ");
			else
	                    	
	                               System.out.print(c);
	 
	                        }
			 
	    
		 System.out.println();
		    
	               }            
	           for(int i=2;i<=n;i++)
	               {
		        for(int j=0;j<n;j++)
	                
	                        {
	                              if(j<n-i)
	                               System.out.print("  ");
			else
	                    	
	                               System.out.print(c);
	 
	                        }
			 
	    
		 System.out.println();
		    
	               }   

	}

}
