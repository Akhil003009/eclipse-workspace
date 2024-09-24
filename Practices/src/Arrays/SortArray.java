package Arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {


		int a[] = {5,0,2,3,1,4};
		
		Arrays.sort(a);
		
		for(int b : a) {
			
			System.out.print(b + ",");
		}

	}

}
