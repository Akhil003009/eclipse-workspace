package Arrays;

import java.util.Arrays;

//Sort subarray from index


public class SortArray2 {

	public static void main(String[] args) {


		int d[] = {9,3,6,8,4,7,1,2,5};
		
		Arrays.sort(d, 2,8); //6,8,4,7

		System.out.print(Arrays.toString(d));

	

	}

}
