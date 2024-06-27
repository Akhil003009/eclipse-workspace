package javaPackage;

public class Variable1 {

	public static void main(String[] args) {

		String s = "Hello Selenium"; // Local Variable
		
		// Calculate the length of string parameter
		
		int lengthofSring = s.length();
		
		System.out.println(lengthofSring);
		
		// Object can hold all types of primitive data types inside the array
		
		Object c[]  = {1,2,3, "Java", "Selenium", 'a', 'c', 3 > 10 };
		
		System.out.println(c[3]);
		
		System.out.println(c[7]);
		
		java();
		

	}

	//User defined method
	
	public static void java () {
		
		int z = 10;
		System.out.println(z);
		
		
	}
	
}
