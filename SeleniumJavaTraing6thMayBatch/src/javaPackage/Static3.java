package javaPackage;

public class Static3 {
	
	
	int roll; // declaring a global variable
	String name; // declaring a global variable
	static String college = "IIT Delhi"; // declaring a static variable
	
	
	// Constructor
	
	Static3(int r, String n) {
		
		roll = r;
		name = n;
		
	}
	
	public void getResult () {
		
		System.out.println(roll + " " + name + " " + college);
		
	}
	
	

}
