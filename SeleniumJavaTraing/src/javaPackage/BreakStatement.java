package javaPackage;

public class BreakStatement {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(i);
			
			if (i == 8) {
				
				break;
				
			}
			
		}
		
		System.out.println("Control came out from loop");

	}

}
