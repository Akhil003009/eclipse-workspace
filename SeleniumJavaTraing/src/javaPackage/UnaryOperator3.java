package javaPackage;

public class UnaryOperator3 {

	public static void main(String[] args) {


		int x = 5;
		int y = 6;
		
		System.out.println(x++); //5
		System.out.println(++x); //1+6=7
		
		System.out.println(x++ + ++x); //7+1=8, 8+1=9 // 16
		
		
		System.out.println(y++); //6
		System.out.println(++y); //1+7 = 8
		
		System.out.println(y++ + ++y); // 8,9 ,10 ,10  // 8+10=18
		

	}

}
