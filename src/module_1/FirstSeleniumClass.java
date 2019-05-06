package module_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\ChromeDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");   //get the d URL of AUT
		System.out.println(driver.getTitle());  //to capture d current URL page title
		driver.getCurrentUrl();  // to capture d current URL of that page
		driver.getWindowHandle(); // to capture d name of d window
		
		//Navigation
		driver.navigate().to("URL");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//Element handling
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys();
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).submit();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Jar\\GeckoDrive\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://facebook.com");
		System.out.println(driver1.getTitle());
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Jar\\IDE_Drive\\IEDriverServer.exe");
		WebDriver driver3 = new InternetExplorerDriver();
		driver3.get("https://facebook.com");
		System.out.println(driver3.getTitle());
		
		driver.quit();
		driver1.quit();
		driver3.quit();
		
		
		

	}

}
