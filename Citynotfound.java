package garima;

import java.util.Scanner;
class CitynotfoundException extends Exception
{
	CitynotfoundException(String msg)
	{
		super(msg);
	}
}

public class Citynotfound {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter zipcode : ");
		int zip = scan.nextInt();
		
		int zipCodeOfAllCity[]= {121103,122343,123456};
		try {
			findCityByZipCode(zip,zipCodeOfAllCity);
		}
		catch(CitynotfoundException e)
		{
			e.printStackTrace();
		}
		scan.close();
	}

	
	static void findCityByZipCode(int zip, int zipCodeOfAllCity[]) throws CitynotfoundException
	{
		for(int i=0;i<3;i++)
		{
		if(zip!=zipCodeOfAllCity[i])
			{
			throw new CitynotfoundException("City Not Found exception");
			}
		else
		{
			System.out.println("City Found!!!");
		}
		}
	}
	
	
	}

