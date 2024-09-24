package javaPackage;

public class TypeCastingNarrowing1 {

	public static void main(String[] args) {


		// Set the maximum possible score in the game 500
		
		int maxScore = 500;

		// Acual score of User
		int userScore = 430;
		
		// Calculate the percentage of User score in relation of Max Score
		
		// Convert userScore to float to make sure that the divison is accurate
		
		double percentage =  (double) userScore / maxScore * 100.0f;
		
	System.out.println("User's score percentage: " +percentage);

	String s =  "home";
	
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	
	}

}
