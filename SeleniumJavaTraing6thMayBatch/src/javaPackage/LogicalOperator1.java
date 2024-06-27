package javaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {


		int a = 10;
		int b = 5;
		int c = 0;
		
		//logical Operator
		System.out.println(a<b && a>b); // false + true = false
		System.out.println(a>b && a>c); // true + true = true
		
		
		
		//bitwise operator
		
		System.out.println(a<b & a>b); // false + true = false
		System.out.println(a>c & a>b); // true + true = true
		

	}

}
