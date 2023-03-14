package garima;
import java.util.Scanner;
class NumberInvalidException extends Exception
{   
		   NumberInvalidException(String msg)
		   {
	    	 super (msg);
	    	 }
}

public class evnn{
	
	public static void main(String args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		try {
			val(num);
		}
		catch(NumberInvalidException e)
		{
			e.printStackTrace();
			}
		sc.close();
		
	}
	static void val(int num) throws NumberInvalidException
	{
		if(num<1 || num>1000)
		{
			throw new NumberInvalidException("Number invalid exception");
		}
		else
		{
			if(num%2==0)
			 System.out.println(num+" is even");
			else
				System.out.println(num+" is odd");
		}
		
	}
}