package javaPractices;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {


		int num, num1, count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter or Type the number");
		num=sc.nextInt();
		
		
		num1=num;
		
		while(num1>0) {
			
			num1=num1/10;
			count =count+1;
	
		}
		System.out.print("Count of Digit= " + count);
		

	}

}
