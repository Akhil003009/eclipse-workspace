package javaPractices;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {


		int num, t1,  count=0, digit, sum=0, main;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		t1 = num;
		
		while(t1>0) {
			
			count = count+1;
			t1=t1/10;		
		}
		
		System.out.println("Count of Digit = " + count);
		
		int t2=num;	
		while(t2>0){
			
			digit=t2%10; int multi=1;
			
			for(int i=1; i<=count; i++){
				
				multi = multi*digit;					
			}
			
			t2=t2/10;
			sum=sum+multi;	
			
		}
		
		if(sum==num) {
			
			System.out.println("This is armstrong number");
						
		}else {
			
			System.out.println("This is not an armstrong number");
		}
		
			
			
			
		}
		
		
	}


