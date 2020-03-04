package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		
		this.driver = driver;
		
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]")  WebElement PageTitle;
	
	public void waitForPage() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(PageTitle));
	}


}
