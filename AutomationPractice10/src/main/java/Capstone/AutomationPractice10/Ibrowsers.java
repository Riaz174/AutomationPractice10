package Capstone.AutomationPractice10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice10\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		String currentPageurl = driver.getCurrentUrl();
		System.out.println(currentPageurl);
		Thread.sleep(3000);
		String whandle = driver.getWindowHandle();
		System.out.println(whandle);
		driver.close();
		

	}

}
