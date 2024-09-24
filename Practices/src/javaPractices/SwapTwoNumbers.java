package javaPractices;

public class SwapTwoNumbers {

	public static void main(String[] args) {


		//input a = 100 , b = 200
		//output a = 200 ,b = 100
		
		int a = 100, b = 200;
		
//		int temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("After swap a = " + a + " After swap b = " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swap a=" +a+ " Aftter swap b=" +b);

	}

}
