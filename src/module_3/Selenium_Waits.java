package module_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Waits {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\ChromeDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com"); 
		
		//Pageload
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Implicit waits
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		
		
		//setScript Time
		
		driver.manage().timeouts().setScriptTimeout(70, TimeUnit.SECONDS);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("PROFILE")).click();
		
	   
		
		driver.close();
		
		/*
		
		
		//Explicit waits
		WebDriverWait waiting = new WebDriverWait(driver, 15);
		waiting.until(ExpectedCondition.presenceOfElementLocated(ElementLocator));
		
		
		
		
		
		*/
		
	}

}
