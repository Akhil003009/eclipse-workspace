package javaPackage;

public class Variable3 {

	int b = 10; // Global Variable
	static int c = 5; // Static Variable
	
	
	
	public static void main(String[] args) {

		int a = 6; // local variable
		
		Variable3 v3 = new Variable3 (); // Memory allocation for global variable 
		
		System.out.println(v3.b); // calling a global variable
		
		System.out.println(c);
		System.out.println(a);
		
		
		a();  //calling a method
		
		
		
		
	}

	// created a method
	public static void a () {
		
		int f = 15;  // local variable
		System.out.println(f);
	}
	
}
