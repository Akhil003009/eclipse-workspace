package javaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {


		int a = 10;
		int b = 10;
		
		System.out.println(a++); //10 // memory stored in the RAM is 11
		System.out.println(a++ + ++a); // 11, 12, 12 , 13 // 11+13 = 24		
		
		System.out.println(a + ++a); //13+14= 27
		
		
//		System.out.println(b++ + --b); //10+1=11 //11-1= 10 //10+10=20
		System.out.println(b++ + b--); //10+1=11 //11 //10+11
		System.out.println(b);
		
		

	}

}
