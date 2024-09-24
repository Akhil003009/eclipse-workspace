package javaPractices;

public class SubstringExample {
	

	public static boolean isSubstring(String s, String sub) {
		
		return s.contains(sub);		
	}
	
	
	public static void main (String[] arg) {
		
		
		String s = "Akhilesh Somnath";
		String sub = "Somnath";
		
		System.out.println(isSubstring(s,sub));
				
		
	}
	
	
	
	}
