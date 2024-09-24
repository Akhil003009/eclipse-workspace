package javaPractices;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestNg {

	

	@Test 
	
	public static void a() {
		
		AssertJUnit.assertTrue(10>9);
		System.out.println("X is greather than Y");	
	}
	
	@Test (dependsOnMethods = "a")
	public static void b() {		
		System.out.println("Y is greather than X");	
	}
		
//	@Test
//	public static void c() {
//	
//	int x = 10, y = 15;
//	
//	if(x>y) {
//		
//		a();	
//		
//	} else {
//		
//		b();
//	}
	
//	}
	
}
