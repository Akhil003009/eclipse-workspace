package javaPractices;

public class Constructor {

	Constructor(){
		
		System.out.println("This is default Constructor");
		
	}
	
	String name;
	String address;
	
	Constructor(String a, String b){
		
		
		name=a;
		address=b;
		
		System.out.println(name +" "+ address);
	}
	
	
	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		Constructor c1 = new Constructor("Akhil", "Sangam Vihar");
		
		System.out.println(c1);
		

	}

}
