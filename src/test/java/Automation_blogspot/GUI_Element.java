package Automation_blogspot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GUI_Element 
{
	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://testautomationpractice.blogspot.com/");
			
		driver.findElement(By.id("name")).sendKeys("Shital");
		driver.findElement(By.id("email")).sendKeys("Shital@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("5642354622");
		driver.findElement(By.id("textarea")).sendKeys("Bramahapuri");
//		To select the gender
		WebElement femalebtn = driver.findElement(By.id("female"));
		femalebtn.click();
//		To select the days
		String[] daysToSelect = {"monday", "wednesday", "friday"};

		for (String dayValue : daysToSelect) {
		    WebElement checkbox = driver.findElement(By.id(dayValue));

		    if (!checkbox.isSelected()) {
		        checkbox.click();
		    }
		}
		//To select country dropdown
		WebElement country = driver.findElement(By.id("country"));
		Select select  = new Select(country);
		select.selectByVisibleText("India");
		
		//To select the colors
		WebElement color = driver.findElement(By.id("colors"));
		Select col = new Select(color);
		col.selectByVisibleText("Yellow");
		
		WebElement sortedList = driver.findElement(By.id("animals"));
		Select animal = new Select(sortedList);
		animal.selectByVisibleText("Rabbit");
		
		driver.findElement(By.id("datepicker")).sendKeys("03/19/2026");
		
		driver.findElement(By.id("txtDate")).click();

		// Select Month
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select mon = new Select(month);
		mon.selectByVisibleText("Aug");
		
		// WAIT for year dropdown to refresh
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		WebElement year = wait.until(
//		    ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-year"))
//		);
//
//		// Select Year
//		
//		Select yr = new Select(year);
//		yr.selectByValue("2013");
		
		driver.findElement(By.className("ui-datepicker-year")).click();

		// Select year from dropdown list
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='2012']")).click();

		// Select Date
		driver.findElement(By.xpath("//a[text()='16']")).click();
		
		
		
		
		
				
		
		
	Thread.sleep(5000);


		
        driver.quit();
		
	}

}
