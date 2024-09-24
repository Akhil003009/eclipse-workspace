package javaPackage;

public class Static4 {

	public static void main(String[] args) {
		
		Static3 s3 = new Static3 (1, "Akhilesh");
		Static3 s4 = new Static3 (2, "Divya");
		
		Static3.college = "Lucknow University";
		
		s3.getResult();
		s4.getResult();
	}

}
