package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver; //this called global
	
	//To Start The Browser
	public static WebDriver startBrowser(String url)  {
	
	System.setProperty("webdriver.chrome.driver", ".\\drives\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    return driver;
	}	
}
