package Automation_blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GUI_PAGE 
{
	WebDriver driver;

	public GUI_PAGE(WebDriver d) 
	{
		this.driver = d;
		
	}
	// Locators
	By name = By.id("name");
	By email = By.id("email");
	By phone = By.id("phone");
	By textarea = By.id("textarea");
	By female = By.id("female");

	By country = By.id("country");
	By colors = By.id("colors");
	By animals = By.id("animals");

	By datepicker = By.id("datepicker");
	By txtDate = By.id("txtDate");

	By startDate = By.id("start-date");
	By endDate = By.id("end-date");

	By submitbtn = By.className("submit-btn");

	// Actions (Methods)
	public void entername(String nm) {
		driver.findElement(name).sendKeys(nm);
	}

	public void enteremail(String em) {
		driver.findElement(email).sendKeys(em);
	}

	public void enterphone(String ph) {
		driver.findElement(phone).sendKeys(ph);
	}

	public void entertextarea(String text) {
		driver.findElement(textarea).sendKeys(text);
	}
	
	public void selectGender(String gender) {
		driver.findElement(female).click();;
	}
	
	 public void selectDays(String[] days) {
	        for (String day : days) {
	            WebElement checkbox = driver.findElement(By.id(day));
	            if (!checkbox.isSelected()) {
	                checkbox.click();
	            }
	        }
	    }

	    public void selectCountry(String value) {
	        new Select(driver.findElement(country)).selectByVisibleText(value);
	    }

	    public void selectColor(String value) {
	        new Select(driver.findElement(colors)).selectByVisibleText(value);
	    }

	    public void selectAnimal(String value) {
	        new Select(driver.findElement(animals)).selectByVisibleText(value);
	    }

	    public void selectSimpleDate(String date) {
	        driver.findElement(datepicker).sendKeys(date);
	    }

	    public void selectCalendarDate(String monthVal, String dateVal) {
	        driver.findElement(txtDate).click();

	        new Select(driver.findElement(By.className("ui-datepicker-month")))
	                .selectByVisibleText(monthVal);

	        driver.findElement(By.xpath("//a[text()='" + dateVal + "']")).click();
	    }

	    public void selectDateRange(String start, String end) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("document.getElementById('start-date').value='" + start + "'");
	        js.executeScript("document.getElementById('end-date').value='" + end + "'");
	    }

	    public void clickSubmit() {
	        driver.findElement(submitbtn).click();
	    }

		
			
		
	
}
	
	

  