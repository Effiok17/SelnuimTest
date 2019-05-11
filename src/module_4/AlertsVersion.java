package module_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsVersion {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\ChromeDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
			
		//display alert
		
		/*
		driver.findElement(By.id("alert")).click();
		Alert simpleAlert = driver.switchTo().alert();//switch to d alert popsup	
		simpleAlert.accept(); //click on alert button
		*/
		
		//confirm alert
		/*
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.dismiss();
		*/
		
		//promtAlert
		
		driver.findElement(By.id("prompt")).click();
		Alert promtAlert = driver.switchTo().alert();
		promtAlert.sendKeys("Welcome");
		
		promtAlert.accept();
		
		

	}

}
