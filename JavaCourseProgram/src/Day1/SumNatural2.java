package Day1;

public class SumNatural2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
	}

}
