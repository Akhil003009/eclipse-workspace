package javaPackage;

public class Loop1 {

	public static void main(String[] args) {

//
//		// print the number 0 to 5
//		
		for (int i = 0; i<6; i++) {
			
			System.out.println(i);
		}
		
		System.out.println("Control came out of loop");
	
		
		//In the loop, when the value is "4", jump directly to the next value.

		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    
			continue;
			  }
			  System.out.println(i);
			}
	}
	}

	
	
