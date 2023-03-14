package garima;

public class array1 {
	public static void main(String args[])
	{
		int []arr= {44,2,5,1,42,15,56};
		int max= arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}