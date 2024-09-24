package javaPractices;
public class Example {
   
public static void main(String[] args) {

	String str = "akhilesh";
	
	try {
		
		int a = Integer.parseInt(str);
		
		System.out.println(a);
		
	}
	
	catch(NumberFormatException e) {
		
//		System.out.println(e.getMessage());

//		System.out.println("String " +str+ " is cant be converted into Interger");
	}finally {
		System.out.println("Main method ended");
	}
	
	
	
}
}