package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {


		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		
		

	}

}
