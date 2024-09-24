package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArryas {

	public static void main(String[] args) {


		String a[] = {"Akhilesh", "Shrikant", "Manish", "Ankit"};
		
		// Sorts arr[] in ascending order
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		// Sorts arr[] in desending order
		
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
	}

}
