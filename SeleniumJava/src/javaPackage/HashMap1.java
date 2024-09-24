package javaPackage;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {


		// Syntax hashMap
		// import the libraries ctrl+A then Ctrl+shift+O
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "January");
		hm.put(2, "February");
		hm.put(3, "March");
		hm.put(4, "April");

		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		
	}

}
