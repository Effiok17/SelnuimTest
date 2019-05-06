package module_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args)  {
		
		//open browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\ChromeDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//open AUT
		driver.get("https://facebook.com"); 
		
		
		//using ID
		/*
		driver.findElement(By.id("u_0_l")).sendKeys("Victor");
		driver.findElement(By.id("u_0_n")).sendKeys("Effiok");
		driver.findElement(By.id("u_0_q")).sendKeys("0736467456");
		
	
		
		
		//UsingName
		driver.findElement(By.name("firstname")).sendKeys("Victor");
		driver.findElement(By.name("lastname")).sendKeys("Effiok");
		driver.findElement(By.name("reg_email__")).sendKeys("0736467456");
		driver.findElement(By.id("u_0_x")).sendKeys("ert234");
		
	
		//using Classname
		driver.findElement(By.name("inputtext")).sendKeys("Victor");
		
		
		*/
		
		//using LinkText
		driver.findElement(By.linkText("Glömt kontot?")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		
		//using PartialLinkText
		
		
		//using CSS
		//using TagName
		//using XPath
		
	}
	
}
