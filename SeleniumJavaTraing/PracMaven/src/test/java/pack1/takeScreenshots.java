package pack1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class takeScreenshots {

    public static void main(String[] args) {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh\\SeleniumJava\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the URL
            driver.get("https://www.si-global.com/landing/university-fair-nigeria/");
            System.out.println("Page opened: " + driver.getCurrentUrl());
            
            driver.manage().window().maximize();

            // Take a screenshot of the initial page 
            takeScreenshot(driver, "Home Page");



            // Wait for 3 seconds to observe the behavior
            Thread.sleep(3000);

            // You can add more actions, verifications, and screenshots here as needed
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after the test
            driver.quit();
        }
    }

    // Method to take a screenshot
    private static void takeScreenshot(WebDriver driver, String fileName) {
        // Get the current time to append to the screenshot filename
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        String timestamp = dtf.format(now);

        // Take a screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot to the project directory
        try {
            FileHandler.copy(screenshot, new File("C:\\Users\\Akhilesh\\Desktop\\sdfasd\\" + fileName + "_" + timestamp + ".png"));
            System.out.println("Screenshot saved: " + fileName + "_" + timestamp + ".png");
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}
