package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUpDown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\SeleniumJava\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://siuk-thailand.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		js.executeScript("window.scrollBy(0,330)");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		js.executeScript("window.scrollBy(0,-250)");		
		driver.findElement(By.xpath("//img[@src='https://siuk-singapore.s3.amazonaws.com/static/original_images/GM-960X540-nw.webp']")).click();		


//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement scroll = driver.findElement(By.xpath("//img[@src='https://siuk-singapore.s3.amazonaws.com/static/original_images/GM-960X540-nw.webp']"));
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		js.executeScript("argument[0].scrollIntoView();", scroll);
//		scroll.click();		

		driver.close();
		
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		

		

	}

}
