package javaPackage;

public class TypeCastingNarrowing {

	public static void main(String[] args) {


		double b = 5.0;
		
		
		int a = (int) b; //Manual Casting From double to int
		
		System.out.println(b);
		
		System.out.println(a);
	
		// String to interger conversion
		
		String s = "10";
		
		int c = Integer.parseInt(s);
		
		System.out.println(c);
		
		System.out.println(s);
		
		//Interger to String
		
		int x = 20;
		
		String y = String.valueOf(x);
		
		System.out.println(y);

	}

}
