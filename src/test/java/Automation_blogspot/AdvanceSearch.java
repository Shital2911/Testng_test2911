package Automation_blogspot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvanceSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Google");
		
		driver.findElement(By.cssSelector(".wikipedia-search-button")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement googleChrome = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Google Chrome']")));
	
		googleChrome.click();
			
		
		
		

	}

}
