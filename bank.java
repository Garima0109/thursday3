package garima;


	import java.util.Scanner;
	class InsufficientblncException extends Exception
	{
		InsufficientblncException(String msg)
		{
			super(msg);
		}
	}

	public class bank {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a balance amount : ");
			int balance = scan.nextInt();
			int previous_b=30000;
			try {
				val(balance,previous_b);
			}
			catch(InsufficientblncException e)
			{
				e.printStackTrace();
			}
			scan.close();
		}

		
		static void val(int balance, int previous_b) throws InsufficientblncException
		{
			if((previous_b-balance) < 5000)
			{
				throw new InsufficientblncException("Insufficient Balance exception");
			}
			else
			{
				System.out.println("Remaining balance="+(previous_b-balance));
				
			}
		}
	}


