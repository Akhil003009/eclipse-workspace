package javaPractices;

public class FibonacciSeries {
	//In Fibonacci series, next number is the sum of previous two numbers
	//Input = First 10 numbes
	//Output = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
	
	public static void main(String[] args) {


		int a1 = 0, a2 = 1, a=10;
		
		for(int i=0; i<=a; i++) {
			
			System.out.print(a1 + ", ");
			int a3 = a2+a1;
			a1 = a2;
			a2 = a3;
			
			
		}
		

	}

}
