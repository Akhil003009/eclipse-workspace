package javaPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;


public class SwitchtoWindow {

	public static void main(String[] args) {

		System.setProperty("web.driver.chromedriver","C:\\Users\\Akhilesh\\SeleniumJava\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(350,600);
		
		driver.manage().window().setSize(d);
		

		
	}

}
