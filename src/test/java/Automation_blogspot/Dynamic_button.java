package Automation_blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_button 
{
	public static void main(String[] args) throws InterruptedException 
	{ 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.name("start")).click();
		System.out.println(driver.findElement(By.name("stop")).getText());
		
		driver.quit();	
	
	}
	
}
