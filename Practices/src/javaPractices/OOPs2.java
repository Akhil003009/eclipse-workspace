package javaPractices;

public class OOPs2 {

	private String name;
	private int account_no;
	private float balance;
	
	// Default constructor
	
	public OOPs2(OOPs2 obj2) {
		
		name = null;
		account_no = 00000;
		balance = 0;
		
	}
	
	/* Parameterized constructor 1 with an extra variable to avoid confusion between the two parameterized constructors */
	
	public OOPs2(String n, int account, float b, float amt) {
		
		name = n;
		account_no = account;
		balance = b;		
		
	}
	
	// Parameterized constructor 2
	
	public OOPs2(String name, int account_no, float balance) {
		
		this.name = name;
		this.account_no = account_no;
		this.balance = balance;
				
	}
	
	private void deposite(float amt) {
		
		balance += amt;
		
	}
	
	private float calculateAmount(float principle, float rate, float time) {
		
		float simpleInterest = (principle * rate * time) / 100;
		float amount = principle + simpleInterest;
		return amount;
		
		
	}
	
	
	public void displayData() {
		
		System.out.println("Name:" +name);
		System.out.println("Account number:" +account_no);
		System.out.println("Balance:" +balance);
		
		
	}
	
	public static void main(String[] args) {
		
		OOPs2 obj1 = new OOPs2("Akhilesh", 587845, 5000);
		OOPs2 obj2 = new OOPs2("Nikhil", 12345, 5000, 2000);
		OOPs2 obj3 = new OOPs2("Ashok", 67890, 3000);
	
		
		obj1.deposite(2500);
		
		float amount = obj1.calculateAmount(2000, 8, 3);
		
		System.out.println("Amount is calculated for 2000 rs at interest rate of 8 % for 3 years is: " +amount);
		
		obj1.displayData();
		obj2.displayData();
		obj3.displayData();
		
		
	}
	
	
}
