package Day1;
import java.util.Scanner;
public class FahrenheittoCelsius2 {
	double celsius(double f)
	{	
	return  (f-32)*5/9;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,c;
 	    Scanner sc=new Scanner(System.in);	   	 
System.out.println("Enter  Fahrenheit temperature");
       a=sc.nextDouble();
FahrenheittoCelsius fah=new FahrenheittoCelsius( );
double result=fah.celsius(a);	
System.out.println("Celsius temperature is = "+result);	

	}

}
