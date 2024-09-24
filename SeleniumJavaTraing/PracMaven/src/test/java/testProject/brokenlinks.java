package testProject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {


	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

	    driver.manage().window().maximize();

	    List<String> urls = new ArrayList<>();
	    urls.add("https://www.studyin-uk.com/cambodia/services/free-services/");
	    urls.add("https://www.studyin-uk.com/cambodia/services/premium-service/");
	    urls.add("https://www.studyin-uk.com/cambodia/services/oxbridge/");
	    urls.add("https://www.studyin-uk.com/cambodia/services/medicine/");
	    urls.add("https://www.studyin-uk.com/cambodia/services/art-design/");
	    urls.add("https://www.studyin-uk.com/cambodia/services/");
	    urls.add("https://www.studyin-uk.com/cambodia/uk-study-info/ucas/");
	    urls.add("https://www.studyin-uk.com/cambodia/uk-study-info/university-rankings/");
	    urls.add("https://www.studyin-uk.com/cambodia/popular-courses/");
	    urls.add("https://www.studyin-uk.com/cambodia/uk-study-info/scholarships/");
	    urls.add("https://www.studyin-uk.com/cambodia/uk-study-info/");
	    urls.add("https://www.studyin-uk.com/cambodia/study-options/foundation/");
	    urls.add("https://www.studyin-uk.com/cambodia/study-options/undergraduate/");
	    urls.add("https://www.studyin-uk.com/cambodia/study-options/postgraduate-and-masters-degree/");
	    urls.add("https://www.studyin-uk.com/cambodia/study-options/");
	    urls.add("https://www.studyin-uk.com/cambodia/profiles/");
	    urls.add("https://www.studyin-uk.com/cambodia/study-guide/");
	    urls.add("https://www.studyin-uk.com/cambodia/ielts/");
	    urls.add("https://www.studyin-uk.com/cambodia/ielts/practice-test/");
	    urls.add("https://www.studyin-uk.com/cambodia/news/");
	    urls.add("https://www.studyin-uk.com/cambodia/events/");

	    // Add all other URLs...
	    
	    for (String url : urls) {
	        driver.get(url);

	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("No.of Links of Home Page: " + links.size());
	    for(int i=0; i<links.size(); i++)
	    {
	        WebElement element =links.get(i);
	        String href = element.getAttribute("href");
	        String txt = element.getText();
	        String currentlink = driver.getCurrentUrl();
	        Verify(href, txt, currentlink);
	    }
	    }

	    driver.close();
	}
	private static void Verify(String href, String txt, String currentlink) {
	    // TODO Auto-generated method stub
	    try {
	        URL link = new URL(href);
	        HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
	        httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
	        httpURLConnection.connect();

	        if (httpURLConnection.getResponseCode() == 200) {
	        System.out.println(href + " - "+ txt+" - " + currentlink+ " - "+ httpURLConnection.getResponseMessage());
	        } else {
	        System.out.println(href + " - "+ txt+" - " + currentlink+ " - "+ httpURLConnection.getResponseMessage() + " - " + "is a broken link");
	        }
	        } catch (Exception e) {
	        System.out.println(href + " - "+ txt+" - " + currentlink+ " - "+ "is a broken link");
	        }
	}
	}
	
	
	
	
	
	

