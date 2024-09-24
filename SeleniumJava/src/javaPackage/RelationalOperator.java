package javaPackage;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int a = 300; // Local Variable
		int b = 300; // Local Variable
		
		//comparing two integers
		if (a != b) {
			System.out.println("a is not equals to b");
		
		} else {

			System.out.println("a is equals to b");

			}
		
		//comapare two Strings in = 1st way
		// == is use to comapre two integers
		String c = "Hello";
		String d = "hello";
		
		if (c == d) {
			
			System.out.println("c and d are equals in 1st way");
		} else {
			
			System.out.println("c and d are not equals in 1st way");
		}
		
		//Compare two Strings in = 2st way
		
		if (c.equals(d)) {
			
			System.out.println("c and d are equals in 2nd way");
		} else {
			
			System.out.println("c and d are not equals in 2nd way");
			
		}
		
		//Compare two Strings in = 3rd way : correct way
		
		if (c.equalsIgnoreCase(d)) {
			
			System.out.println("c and d are equals in 3rd way");
		} else {
			
			System.out.println("c and d are not equals in 3rd way");
		}
		

	}

}
