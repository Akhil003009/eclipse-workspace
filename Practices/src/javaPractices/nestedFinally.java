package javaPractices;

public class nestedFinally {

	public static void main(String[] args) {
		
		try {
			
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException a)
		{
			System.out.println("This is ArithmeticExceptoin");
		}
		finally {
			
			
			
			try {
					
				System.out.println(9/3);
				String str = "Hello Akhilesh, How are you?";
				String substr = str.substring(6, 28); 
				System.out.println(substr);
			}
			catch(StringIndexOutOfBoundsException s)
			{
				System.out.println("There is excepton of "+s);
				
			}
			finally {
				
				System.out.println("This is inner finally block");
				
			}
			
		}
		
		System.out.println("Main method executed");

	}

}
