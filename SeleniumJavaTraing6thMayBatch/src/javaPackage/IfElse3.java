package javaPackage;

public class IfElse3 {

	public static void main(String[] args) {

		int m = 302;
		int n = 301;
		
		if (m > n) {
			
			System.out.println("M is greater than N");
		} else if (n > m) {
			
			System.out.println("N is greater than M");
		} else if (m == n) {
			System.out.println("M and N are equal");
		} else {
			
			System.out.println("M and n are different");
			
		}
	}

}
