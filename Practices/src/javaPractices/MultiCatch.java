package javaPractices;

import java.lang.reflect.Array;

public class MultiCatch {

	public static void main(String[] args) {


		try {
			
			int a=9,b=3,c;
			c=a/b;
			System.out.println(c);
			
			String str = null;
			System.out.println(str.toUpperCase());
			
			String arr[] = {"Akhil","Shri","Manish","Ankit"};
			System.out.println(arr[5]);
		}
		catch(NumberFormatException n)
		{
			System.out.println("This is NullPointerException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is ArithmeticException");
		}
		
		catch(ArrayIndexOutOfBoundsException m)
		{
			System.out.println("This is ArrayIndexOutOfBoundsException");
		}
		catch (Exception d)
		{

			System.out.println("This is Super Exception ");
		}
	}

}
