package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000); // wait for 2 sec
		
		driver.findElement(By.xpath("//*[@data-testid= 'open-registration-form-button']")).click(); // click on create new account button
		
		Thread.sleep(2000); // wait for 2 sec
		driver.findElement(By.xpath("//input[@value= '1']")).click();
		
		Thread.sleep(2000); // wait for 2 sec
		driver.findElement(By.xpath("//input[@value= '2']")).click();
		
		Thread.sleep(2000); // wait for 2 sec
		driver.findElement(By.xpath("//input[@value= '-1']")).click();

	}

}
