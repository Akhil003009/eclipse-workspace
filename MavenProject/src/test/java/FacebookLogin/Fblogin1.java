package FacebookLogin;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Fblogin1 {
  
	@Test //Loging to Facebook
	  public void LogintoFB() {
		
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Email/Phone");
		String un=sc.next();
		System.out.println("Please Enter your password");
		String pwd = sc.next();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\SeleniumJava\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement element =  driver.findElement(By.xpath("//button[@type='submit']"));
		boolean LogInButtonDisplayed = element.isEnabled();
		System.out.println("Submit button is: " + LogInButtonDisplayed);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.close();
		
		WebElement loginbutton =  driver.findElement(By.xpath("//button[@type='submit']"));
		
		loginbutton.click();
		


	
		  

		}

	@BeforeTest
  public void beforeTest() {
	  

  }

  @AfterTest
  public void afterTest() {
	
	  
	  
  }

}
