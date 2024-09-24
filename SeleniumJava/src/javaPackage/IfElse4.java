package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {


		int age = 17; // defining a local variable
		int weight = 40; // defining a local variable
		
		if (age > 18) {
			
			if (weight > 45) {
				
				System.out.println("Eligible");
			} else {
				
				System.out.println("Not Eligible");
			}
		} else {
			
			System.out.println("age and weight does not match");
		}

	}

}
