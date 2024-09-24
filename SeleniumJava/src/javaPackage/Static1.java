package javaPackage;

public class Static1 {

	int x = 500; // Defining a Global variable
	String s = "Selenium"; //Defining a Global Variable
	
	
	static int y = 100;  // Defining a static Variable
	
	// Static method
	public static void main(String[] args) {

		int x = 200;
		System.out.println(x);
		
		
		method2();	

	}
	
	public static void method2() {
		
		int i = 100; // Local Variable
		System.out.println(i);  // Calling i variable
		
		
		
	
	}
	

}
