package javaPackage;

public class Static7 {

	
	String a; // Declaring a variable
	int b; //Declaring a variable
	
	static int c = 4; //static variable
	
	public static void a() {
		
		System.out.println("Hello Static Method");
	}
	
	
	public static void main(String[] args) {
		
		Static7 s7 = new Static7();
		
		s7.a = "Selenium";
		s7.b = 2;
		
		c = 8;
		
		a();
		
		System.out.println(s7.a + " " + s7.b + " " + c);
		

		

	}

}
