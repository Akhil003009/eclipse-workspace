package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHanding {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\SeleniumJava\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/alerts");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("window.scrollBy(0,320)");	
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		//Accept the alert
//		driver.switchTo().alert().accept();

		//dismiss the alert
		driver.switchTo().alert().dismiss();
		

	}

}
