package javaPractices;

public class Exceptions {

	public static void main(String[] args) {


		String str = "akhilesh";
		
		
		try {
			
			System.out.println(str.toUpperCase());
			System.out.println("text is converted in Upper Case");
		}
		
		catch(NullPointerException e) {
			
			
			System.out.println("can't convert in uppercase");
			
			
			
			
		}
		
	}

}
