//package Capstone.AutomationPractice10;
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
//
//public class Alerts {
//	public static WebDriver driver;
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository19\\AutomationPractice10\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//		driver.manage().window().maximize();
//		Thread.sleep(6000);
//		WebElement alerts = driver.findElement(By.id("new"));
//		alerts.click();
//		try {
//		    WebDriverWait wait = new WebDriverWait(driver, 1);
//		    wait.until(ExpectedConditions.alertIsPresent());
//		    Alert alert = driver.switchTo().alert();
//		    System.out.println(alert.getText());
//		    alert.dismiss();
//		    Assert.assertTrue(alert.getText().contains("Thanks."));
//		} catch (Exception e) {
//		    //exception handling
//		}		
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert(); 
		// switch to alert

		String alertMessage= driver.switchTo().alert().getText(); // capture alert message

		}
}
		
		
		

	


