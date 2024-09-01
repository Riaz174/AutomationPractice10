package Capstone.AutomationPractice10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice10\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement cnewaccount = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		cnewaccount.click();
		Thread.sleep(6000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("John");
		Thread.sleep(3000);
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Doe");
		Thread.sleep(3000);
		WebElement emailField = driver.findElement(By.name("reg_email__"));
		emailField.sendKeys("john@gmail.com");
		Thread.sleep(3000);
		WebElement pword = driver.findElement(By.id("password_step_input"));
		pword.sendKeys("abcdef");
		Thread.sleep(3000);
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select st = new Select(birthmonth);
		st.selectByIndex(9);
		Thread.sleep(3000);
		WebElement bday = driver.findElement(By.name("birthday_day"));
		Select sb = new Select(bday);
		sb.selectByValue("27");
		Thread.sleep(3000);
		WebElement byear = driver.findElement(By.name("birthday_year"));
		Select sy = new Select(byear);
		sy.selectByVisibleText("1957");
		Thread.sleep(3000);
		WebElement glink = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		glink.click();
		
		

	}

}
