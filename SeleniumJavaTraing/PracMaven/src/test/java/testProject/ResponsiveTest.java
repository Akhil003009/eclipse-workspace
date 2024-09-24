package testProject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ResponsiveTest  {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Akhilesh\\\\SeleniumJava\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("https://www.si-global.com/landing/global-study-conference/");
	
	
	}
	
	
	@DataProvider(name= "deviceSizes")
	
	public Object[][] deviceSizes(){
		
		return new Object[][] {
			
			{360, 640, "Mobile Portrait"}, 
			{375, 812, "iPhone X"},
			{412, 869, "Galaxy Note 10"},	
            {768, 1024, "iPad Mini"}, 
            {1024, 768, "Tablet Landscape"},
            {1024, 1366, "iPad Mini"},
            {1366, 768, "Desktop"},         
            {1920, 1080, "Large Desktop"}   
            
		};		
	}
	
	
	
	@Test(dataProvider  = "deviceSizes")
	
	public void responsiveLayout(int width , int height, String deviceName){
		
		driver.manage().window().setSize(new Dimension(width,height));
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println("Testing on device width: " + width + " and height: " + height + ", URL: " + currentURL);	
		
		 takeScreenshot(deviceName + "_" + width + "x" + height);
		
	}
	
	public void takeScreenshot(String fileName) {
		
        TakesScreenshot screenshot = (TakesScreenshot) driver;
         
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        
        // Set the directory for saving the screenshots
        String timestamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        String destDir = "C:\\Users\\Akhilesh\\Desktop\\sdfasd\\";
        
        // Create the screenshot file
        File destFile = new File(destDir + fileName + "_" + timestamp + ".png");
        try {
            // Save the screenshot file
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
	
	@AfterTest
	
	public void close() {
		
		if(driver != null) {
			
			driver.quit();
		}
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
