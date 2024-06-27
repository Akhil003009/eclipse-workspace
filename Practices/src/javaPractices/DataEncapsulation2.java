package javaPractices;

public class DataEncapsulation2 {

	public static void main(String[] args) {
		
		DataEncapsulation1 DE = new DataEncapsulation1();
		
		DE.setNoOfItems(200);
		DE.shopNumber(300);
		
		
		System.out.println(DE.getNoOfItems());
		System.out.println(DE.getshopNumber());

	}

}
