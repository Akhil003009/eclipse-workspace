package javaPractices;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {


		int num , count = 0, digit, sum=0;
		
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the number");
		num= sn.nextInt();
		
		int t1=num;

		
		while(t1 >0) {	
			count= count+1;	
			t1=t1/10;
		}
		System.out.println("Count of digit is " + count);
		
		int t2= num;
		
		while(t2>0) {
			digit= t2%10; int pro=1;
			
			for(int i=1; i<=3; i++){
			pro=pro*digit;
			}
			
			t2=t2/10;
			sum=sum+pro;
			
			
		}
		
		if(sum==num) {
			
			System.out.println("Number is Armstrong");		
		} else {
			
			System.out.println("Number is not Armstrong");
		}
		

	}

}
