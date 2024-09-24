package javaPractices;


public class StringReverse {

	public static void main(String[] args) {


		String s = "Madam";
		
		String reverse = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			reverse= reverse+s.charAt(i);			
		}
		if(s.equalsIgnoreCase(reverse)){
			
			System.out.print("This is Palandrome String");
					
			
		} else{
			
			System.out.print("This is not Palanmdrome String");
			
		}
		
	}

}
