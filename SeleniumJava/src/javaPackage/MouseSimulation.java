package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\SeleniumJava\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,350)");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//double Click
		
//		WebElement doubleclick =  driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));		
//		Actions act = new Actions(driver);		
//		act.doubleClick(doubleclick).perform();
		
//		//right click action
//		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		Actions act = new Actions(driver);
//		act.contextClick(rightclick).perform();
		
		//click me
		
		WebElement clickMe = driver.findElement(By.linkText("Click Me"));
		Actions act = new Actions (driver);
		act.click(clickMe).perform();
		
		
		
		
	

	}

}
