package javaPractices;

import java.util.Hashtable;

public class HashMap1 {

	public static void main(String[] args) {



		Hashtable <Float, String> ht = new Hashtable <Float,String>();
		
		ht.put(5.2f, "Akhil");
		
		System.out.println(ht.get(5.2f));

	}

}
