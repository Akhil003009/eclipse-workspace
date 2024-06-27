package javaPackage;

public class Constructor3 {
	
	Constructor3(){
		System.out.println("This is no argument constructor");
	}
	
	Constructor3(int a){
		System.out.println("This is interger constructor");
	}
	
	Constructor3(String b){
		System.out.println("This is String Constructor");
	}
	
	public static void main(String[] args) {
		
		Constructor3 c3 = new Constructor3();
		Constructor3 c4 = new Constructor3(3);
		Constructor3 c5 = new Constructor3("India");
		Constructor3 c6 = new Constructor3(4);
		Constructor3 c7 = new Constructor3("United Kingdom");
		

	}

}
