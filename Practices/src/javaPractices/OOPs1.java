package javaPractices;

public class OOPs1 {
	
	private String name;
	private int account_no;
	private float balance;
	
	
	public void getData() {
		
		name = "Akhilesh";
		account_no = 30992;
		balance = 0;
	}

	private void deposit(float amount) {
		
		balance += amount; //balance = balance + amount
		
				
	}

	private float calculateAmount(float principle, float rate, int time) {
		
		float simpleInterest = (principle * rate * time) / 100;
		float amount = principle + simpleInterest;
		return amount;
		
	}

	public void displayData() {
		
		System.out.println("Name:" +name);
		System.out.println("Account No: " + account_no);
		System.out.println("Balance: " +balance);
	}

	public static void main(String[] args) {
		
		OOPs1 obj = new OOPs1();
		
		obj.getData();
		obj.deposit(2000);
		float amount = obj.calculateAmount(1000, 8, 2);
		System.out.println("Amount is calculated for Rs. 2000 at the Rate of 8% for 2 years is : "  +amount);
		obj.displayData();
		
		
		
	}
}


