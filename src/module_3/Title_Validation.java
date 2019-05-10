package module_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Validation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\ChromeDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		driver.get("https://www.google.com");
		String AppTitle = driver.getTitle();
		System.out.println(AppTitle);
		boolean read = AppTitle.equals("google");
		System.out.println(read);
		
		*/
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		driver.findElement(By.id("profession-1")).click();
		WebElement element_2 = driver.findElement(By.id("profession-1"));
		WebElement element_3 = driver.findElement(By.id("submit"));
		boolean result = element_2.isSelected();
		boolean result2 = element_3.isEnabled();
		//boolean result3 = element_2.isDisplayed();
		
		System.out.println(result);
		
		System.out.println(result2);
		
			}

}
