package Capstone.AutomationPractice10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flights {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice10\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement flights = driver.findElement(By.linkText("Flights"));
		flights.click();
		Thread.sleep(6000);
		WebElement dates = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		dates.click();
		Thread.sleep(6000);
		WebElement departdt = driver.findElement(By.xpath("//div[@aria-label='Friday, September 27, 2024']"));
		Actions action = new Actions(driver);
		action.moveToElement(departdt).click().build().perform();
		Thread.sleep(6000);
		WebElement edate = driver.findElement(By.xpath("//div[@aria-label='Wednesday, October 30, 2024']"));
		action.moveToElement(edate).click().build().perform();
		

	}

}
