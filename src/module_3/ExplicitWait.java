package module_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\ChromeDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
		
	
		WebDriverWait element = new WebDriverWait(driver, 10);
		//WebElement nyLink = element.until(ExpectedConditions.elementToBeClickable(By.linkText("LinText-5")));
		
		//nyLink.click();
	
		
		element.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))).click();

	}

}
