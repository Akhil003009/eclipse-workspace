package javaPractices;

public class NestedTry {

	public static void main(String[] args) {


		try {
		

			try {
				
				int arr[] = {2,3,6,5,8};
				System.out.println(arr[1]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				
			}
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException f)
		{
			System.out.println(f);
		}
	
		System.out.println("This is last execution statement");

		
	}

}
