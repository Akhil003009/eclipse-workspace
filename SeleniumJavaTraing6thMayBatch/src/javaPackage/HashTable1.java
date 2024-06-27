package javaPackage;

import java.util.HashMap;

public class HashTable1 {

	public static void main(String[] args) {


		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "January");
		hm.put(2, "February");
		hm.put(3, "March");
		hm.put(4, "April");

		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		

		HashMap<Double, String> hm1 = new HashMap<Double, String>();
		
		hm1.put(5.2, "Akhilesh");
		
		System.out.println(hm1.get(5.2));
	
		//Use for each loop with HashMap
		
		for (int i : hm.keySet()) {
			  System.out.println(i);
			}
		
		for (String i : hm.values()) {
			  System.out.println(i);
			}
		// Print keys and values
		
		for (int a : hm.keySet()) {
			
			System.out.println("key: " + a + ", " + "value: " + hm.get(a));
			
			
		}
	}

}
