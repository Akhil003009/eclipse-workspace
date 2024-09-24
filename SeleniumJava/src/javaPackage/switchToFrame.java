package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class switchToFrame {

	public static void main(String[] args) {


		System.setProperty("web.driver.chromedriver", "C:\\Users\\Akhilesh\\SeleniumJava\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		WebElement frametext = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frametext.getText());
		
		

	}

}
