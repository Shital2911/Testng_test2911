package Automation_blogspot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GUI_Test 
{
	
    @Test
	public void test() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		GUI_PAGE page = new GUI_PAGE(driver);
		
		page.entername("Shital");
		page.enteremail("Shital@gmail.com");
		page.enterphone("5642354622");
		page.entertextarea("Bramahapuri");
		
		page.selectGender("female");

        String[] days = {"monday", "wednesday", "friday"};
        page.selectDays(days);

        page.selectCountry("India");
        page.selectColor("Yellow");
        page.selectAnimal("Rabbit");

        page.selectSimpleDate("03/19/2026");

        page.selectCalendarDate("Aug", "16");

        page.selectDateRange("2025-03-20", "2026-03-30");

        page.clickSubmit();

        Thread.sleep(5000);
        driver.quit();
					
		
	}

}
