package javaPractices;

public class NestedCatch {

	public static void main(String[] args) {


		try {
			
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+ "Statement1");
			
			
			try {
				
				String str = "akhil";
				System.out.println(str.toLowerCase());
				
			}
			catch(NullPointerException f)
			{
				System.out.println(f + "Statement2");
			}
			
		}

		System.out.println("Statement3");
	}

}
