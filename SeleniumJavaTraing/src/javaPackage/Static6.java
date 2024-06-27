package javaPackage;

public class Static6 {
	
	int x = 10; // global variable
	static int y = 5; //static variable
	
	public void a() {
		
		int z = 20;
		System.out.println(z);
		
	}
	
	static int b = 100; //static variable


	public static void main(String[] args) {
		
		Static6 s6 = new Static6();
		
		s6.a();
		
		System.out.println(b);


	}

}
