package javaPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 0;
		
		//Logical Operator
		
		System.out.println(a < b && ++a < c); //False
		System.out.println(a);
		
		
		//Bitwise Operator
		
		System.out.println(a < b & ++a < c); // False but it read the second condition and ading pre incerasing the value of a
		System.out.println(a);

	}

}
