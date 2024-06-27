package EnquiryFormsScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ConsultationFormSubmit {

	public static void main(String[] args) {
		
	// Step1:- Open browser
		
		System.getProperty("C:\\Users\\Akhilesh\\SeleniumJavaTraingin\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions o = new ChromeOptions();
		
		o.addArguments("--incognito");
		
		DesiredCapabilities c = DesiredCapabilities.chrome();
		
		c.setCapability(ChromeOptions.CAPABILITY, o);
		
		
			
		WebDriver driver = new ChromeDriver(o);
		
		driver.get("https://www.studyin-canada.com"); // Open the website
		
		driver.manage().window().maximize(); // maximize the window
		
		driver.findElement(By.xpath("//*[@class= 'cont-button']//a[@href= '#']")).click(); // Click on "Enquire Now" button
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // wait for 3 sec
	
    
		driver.findElement(By.xpath("//input[@id= 'firstname']")).sendKeys("Test-Siuk");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // wait for 2 sec
		driver.findElement(By.xpath("//input[@id= 'familyname']")).sendKeys("Test-Siuk");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // wait for 2 sec
		driver.findElement(By.xpath("//input[@id= 'mobile']")).sendKeys("9874589658");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // wait for 2 sec
		driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("akhilesh+1344299035@studyin-uk.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // wait for 2 sec


		// Select Nationality
		List<WebElement> Nationality = driver.findElements(By.xpath("//select[@id= 'nationality']/option")); // Created List of WebElement
		
		Nationality.get(9).click(); 
		
		// Select Type of Study
		
		List<WebElement> TypeofStudy = driver.findElements(By.xpath("//select[@id= 'studytype']/option")); // Created List of WebElement
		
		TypeofStudy.get(2).click(); 
		
//		List<WebElement> Nationality = driver.findElements(By.xpath("//select[@id= 'nationality']/option")); // Created List of WebElement
//		
//		Nationality.get(9).click(); // select Anugulia Nationality
//		
//		
//		List<WebElement> Nationality = driver.findElements(By.xpath("//select[@id= 'nationality']/option")); // Created List of WebElement
//		
//		Nationality.get(9).click(); // select Anugulia Nationality
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
