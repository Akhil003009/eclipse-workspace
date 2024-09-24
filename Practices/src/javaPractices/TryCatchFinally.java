package javaPractices;

public class TryCatchFinally {

	public static void main(String[] args) {


		
		
		try {
			System.out.println("First Statement");
			int a=10, b=2,c;
			c=a/b;
			System.out.println(c + " Second Statement");
			System.out.println("Third statement");
		}
		catch(NullPointerException e) {
			int x=10, y=0,z;
			z=x/y;
			System.out.println(z + " Second Statement");
			System.out.println("Fourth Statement");
		}
		finally {
			
			System.out.println("Finally Statement");
		}
		
		System.out.println("Main method");
	}
	

}
