package javaPackage;

public class Array2 {

	public static void main(String[] args) {


		// Defining multi dimentional array
		
		int a[][] = {{1,2,3,4}, {6,7,8,9}, {0,0,0,0}};
		
		int row = a.length;
		
		System.out.println("The Total numbers of rows is: " +row);
		
		int column = a[0].length;
		
		System.out.println("The Total number of Colun is: " +column);
		
		// Print all data
		
		for (int r = 0; r < row; r++) {
			
			
			for (int c = 0; c < column; c++) {
				
				System.out.print(a[r][c] + " ");
			}
			
			System.out.println();
		}

		

		Object k[] = {1,2,3,};
		
		System.out.println(a.length);
		
	}

}
