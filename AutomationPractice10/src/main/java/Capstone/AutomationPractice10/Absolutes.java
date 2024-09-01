package Capstone.AutomationPractice10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Absolutes {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice10\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
//		WebElement all = driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
//		all.click();
//		Thread.sleep(6000);
//		driver.navigate().back();
//		driver.navigate().forward();
//		Thread.sleep(15000);
//		WebElement mcare = driver.findElement(By.linkText("Medical Care"));
//		mcare.click();
//		Thread.sleep(20000);
//		WebElement bsellers = driver.findElement(By.linkText("Best Sellers"));
//		bsellers.click();
//		Thread.sleep(10000);
//		WebElement abasics = driver.findElement(By.partialLinkText("Amazon Basics"));
//		abasics.click();
//		Thread.sleep(6000);
//		WebElement prime = driver.findElement(By.linkText("Prime"));
//		prime.click();
//		Thread.sleep(6000);
//		WebElement nreleases = driver.findElement(By.linkText("New Releases"));
//		nreleases.click();
//		Thread.sleep(6000);
//		WebElement tdeals = driver.findElement(By.partialLinkText("Today's Deals"));
//		tdeals.click();
//		Thread.sleep(6000);
//		WebElement mmusic = driver.findElement(By.linkText("Music"));
//		mmusic.click();
//		Thread.sleep(6000);
//		WebElement cservice = driver.findElement(By.partialLinkText("Customer Service"));
//		cservice.click();
//		Thread.sleep(6000);
//		WebElement grocery = driver.findElement(By.linkText("Groceries"));
//		grocery.click();
		Thread.sleep(6000);
		WebElement ahome = driver.findElement(By.linkText("Amazon Home"));
		ahome.click();
		Thread.sleep(6000);
		WebElement rregistery = driver.findElement(By.linkText("Registry"));
		rregistery.click();
		Thread.sleep(6000);
		WebElement acart = driver.findElement(By.id("nav-cart-text-container"));
		acart.click();
	
		

	}

}
