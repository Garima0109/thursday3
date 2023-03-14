package garima;

public class Array {
	
		public static void main(String[] args)
		{  
			String[] arr = {"Garima","Aditi","Kavya","Snehal"};   
			try {
				for(int i=0;i<=arr.length;i++) {
					System.out.println(arr[i]);
				}
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array Index is out of Bound");
				}
			  
		}  
	

}
