package javaPackage;

public class Constructor2 {

	//Default Constructor
	Constructor2(){
		System.out.println("Hello Constructor2");
	}
	
	String name; //defining a variable
	String address; // defining a string variable
	
	//Parameterized Constructor
	Constructor2(String n, String a){
		
		name = n;
		address = a;
		
		System.out.println(name+ " " +address);
		

	}
	
	
	public static void main(String[] args) {
		
		Constructor2 c2 = new Constructor2();
		Constructor2 c3 = new Constructor2("Akhilesh", "Sangam Vihar");
		Constructor2 c4 = new Constructor2("Nikhil", "Sangam Vihar");
		
		
		

	}

}
