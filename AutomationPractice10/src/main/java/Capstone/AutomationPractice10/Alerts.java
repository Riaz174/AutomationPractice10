package Capstone.AutomationPractice10;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository19\\AutomationPractice10\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
	            driver.manage().window().maximize();
	            Thread.sleep(6000);
	         //  Click the "Click me" button to trigger a simple alert
	            try {
	            WebElement simpleAlertButton = driver.findElement(By.xpath("//*[contains(text(),'Click me')]"));
	            simpleAlertButton.click();
	            Thread.sleep(6000);
	    		driver.switchTo().alert().accept();
	            // Click the confirmation alert button
	    		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    		
	            WebElement confirmBoxButton = driver.findElement(By.id("confirmButton"));
	            // confirmBoxButton.click();
	             //driver.switchTo().alert().accept();
	             WebDriverWait sk = new WebDriverWait(driver,20);
	     		sk.until(ExpectedConditions.elementToBeClickable(confirmBoxButton));
	     		confirmBoxButton.click();
	     		Alert alert =  driver.switchTo().alert();
	     		alert.accept();
           
	            // Click the prompt alert button
	            WebElement promptButton = driver.findElement(By.id("promtButton"));
	            promptButton.click();

	            // Enter text into the prompt and accept the alert
	            driver.switchTo().alert().sendKeys("Hello, Copilot!");
	            driver.switchTo().alert().accept();
    }catch(Exception e){ 
	e.printStackTrace();

    }finally {
           driver.quit();
	           }
	           }
}

//	private static WebDriver getWebDriver() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	    }

	

//		driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
//		Thread.sleep(6000);
//		WebElement alerts = driver.findElement(By.xpath("//*[contains(text(),'Click me')]"));
//		alerts.click();
//		Thread.sleep(6000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(20000);
//		WebElement confirmbox = driver.findElement(By.id("confirmButton"));
//		confirmbox.click();
//		
//		driver.switchTo().alert().sendKeys("abcdef");
//		driver.switchTo().alert().accept();
//		Thread.sleep(20000);
//		WebElement prompt = driver.findElement(By.id("promtButton"));
//		prompt.click();
//		 driver.switchTo().alert().sendKeys("Hello, Copilot!");
//		driver.switchTo().alert().accept();
//		
//
		// Click the confirmation alert button
		//driver.findElement(By.id("confirmButton")).click();

		// Accept the alert
		//driver.switchTo().alert().accept();

		// Click the confirmation alert button again
		//driver.findElement(By.id("confirmButton")).click();

		// Reject the alert
		//driver.switchTo().alert().dismiss();
	//}
//}

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

//		String alertMessage= driver.switchTo().alert().getText(); // capture alert message
//
//		}
//}
		
		
		

	


