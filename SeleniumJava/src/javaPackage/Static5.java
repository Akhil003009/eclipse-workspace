package javaPackage;

public class Static5 {
	
	
	static int z = 5; //defining a static variable
	int y = 1; //defining a non static global variable
	
	//static method
	
	public static void a() {
		int z = 10;
		
		System.out.println(z);
	}
	
	//non static method
	public void b() {
		int z = 15;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		
		a();
		Static5 s5 = new Static5();
		
		s5.b();
		
	}

}
