import java.util.*;

public class product
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int customers = X * Y;
		
		System.out.println(customers);
	}
}