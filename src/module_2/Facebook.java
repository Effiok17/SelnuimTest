package module_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException  {
		
		//open browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\ChromeDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//open AUT
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html"); 
		
		
		/*
		//using ID
		
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
		
		
		//using LinkText
		driver.findElement(By.linkText("Glömt kontot?")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		
		//using PartialLinkText
		driver.findElement(By.partialLinkText("Glömt")).click();
		
		
		

		//using CSS
		
		
		driver.findElement(By.cssSelector("input#u_0_a")).click();
	
		
		//using TagName
		
		driver.findElement(By.tagName("img"));
		List<WebElement> myList = driver.findElements(By.tagName("img"));
		
		System.out.println(myList.size());
		
		*/
		
		//using XPath
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Efixx");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='lastname']//preceding::input[1]")).sendKeys("Viktor");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='lastname']//following::input[9]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("2019-05-07");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[contains(@name,'profession')]//following::input[5]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[starts-with(text(), 'Test')]")).click();
		Thread.sleep(5000);
	}
	
}
