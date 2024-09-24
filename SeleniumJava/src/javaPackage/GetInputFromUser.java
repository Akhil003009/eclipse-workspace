package javaPackage;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
		int a;
		float b;
		String s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string");
		s = in.nextLine();
		System.out.println("You entered  string "+s);
		
		System.out.println("Enter an integer");
		a = in.nextInt();
		System.out.println("You entered an integer "+a);
		
		
		System.out.println("Enter a Float");
		b = in.nextFloat();
		System.out.println("You entered a Float "+b);
		
		

	}

}
