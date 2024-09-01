package Capstone.AutomationPractice10;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ilocators10 {
	public static WebDriver driver;
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice10\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		sign.click();
		Thread.sleep(3000);
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("john@gmail.com");
		Thread.sleep(6000);
		WebElement contField = driver.findElement(By.xpath("//input[@type='submit']"));
		contField.click();
		Thread.sleep(6000);
		WebElement pword = driver.findElement(By.xpath("//input[@type='password']"));
		pword.sendKeys("abcdef");
		contField.click();
		//Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement signField = driver.findElement(By.xpath("//input[@type='submit']"));
		signField.click();
		WebDriverWait sk = new WebDriverWait(driver,30);
		sk.until(ExpectedConditions.elementToBeClickable(signField));
//		WebElement signField = driver.findElement(By.xpath("//input[@type='submit']"));
//		signField.click();
		
	}

}
