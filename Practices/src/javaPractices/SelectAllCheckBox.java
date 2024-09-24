package javaPractices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBox {

	public static void main(String[] args) throws InterruptedException {


		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\SeleniumJava\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//Click on Electronic link
		
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_8']")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // wait
		
		

		//click on Check boxes
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
		
		System.out.println("Numbers of Tag: " + allcheckbox.size());
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current URLs is: " + currenturl);
		


		for(WebElement checkbox : allcheckbox){
			
			checkbox.click();
			
			WebElement clearbutton = driver.findElement(By.xpath("//span[@data-csa-c-content-id='p_n_is_private_label/16184648031']")); 
			boolean isSelected = clearbutton.isSelected();
			System.out.println("Clear button is : " + isSelected);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			if (isSelected = true) {
				
				driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item s-navigation-clear-link']")).click();
			}
			
			
			}
	

	 
			}
			



		

		
		
		
		}

		
		

