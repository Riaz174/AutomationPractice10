//package Capstone.AutomationPractice10;
//
//
//import java.util.concurrent.TimeUnit;
//
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import java.time.Duration;
//
//
//public class Alerts {
//	public static WebDriver driver;
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository19\\AutomationPractice10\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		 driver.get("https://demoqa.com/alerts");
//	     driver.manage().window().maximize();
//	     Thread.sleep(6000);
//	    driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
//		Thread.sleep(6000);
//		WebElement alerts = driver.findElement(By.xpath("//*[contains(text(),'Click me')]"));
//		alerts.click();
//		Thread.sleep(6000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(6000);
//		driver.quit();
//		Thread.sleep(30000);
//		WebElement confirmbox = driver.findElement(By.id("confirmButton"));
//		confirmbox.click();
//		Thread.sleep(30000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(20000);
//		WebElement prompt = driver.findElement(By.id("promtButton"));
//		prompt.click();
//		 driver.switchTo().alert().sendKeys("Hello, Copilot!");
//		// Thread.sleep(20000);
//		driver.switchTo().alert().accept();
		
//	}
//}
		

				
		

	


