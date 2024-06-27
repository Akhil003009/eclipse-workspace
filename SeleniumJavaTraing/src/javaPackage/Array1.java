package javaPackage;

public class Array1 {

	public static void main(String[] args) {

		// We can create a array as below (Single Dimentional Array)
		
		int b[] = {1,2,3,4,5}; // Defining a interger array
		
		String s[] = {"Hello", "Java", "Selenium"}; // Defing a String array
		
		Object a[] = {1,2,3, "Java", 'a'};
		
		System.out.println(b.length);
		System.out.println(s.length);
		System.out.println(a.length);
		
		System.out.println(a[4]);
		System.out.println(s[0]);

		s[2] = "Automation";
		
		System.out.println(s[2]);
	}

}
