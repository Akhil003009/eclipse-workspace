package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {


		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000); // wait for 2 sec
		
		driver.findElement(By.xpath("//*[@data-testid= 'open-registration-form-button']")).click(); // click on create new account button


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Impalicit wait
		

		
		// We need to create list array for dropdown handling
		// //*[@id= 'month']/option
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//*[@id= 'month']/option"));
		
		dropdown.get(7).click();

		Thread.sleep(2000); // wait for 2 sec
		driver.findElement(By.xpath("//input[@value= '1']")).click();
		
		Thread.sleep(2000); // wait for 2 sec
		driver.findElement(By.xpath("//input[@value= '2']")).click();
		
		Thread.sleep(2000); // wait for 2 sec
		driver.findElement(By.xpath("//input[@value= '-1']")).click();
		
	}

}
