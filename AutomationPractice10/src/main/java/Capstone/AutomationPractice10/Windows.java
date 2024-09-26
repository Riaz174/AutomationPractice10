package Capstone.AutomationPractice10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository19\\AutomationPractice10\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement owindow = driver.findElement(By.id("openwindow"));
		owindow.click();
		Thread.sleep(3000);
		String currentwhandle = driver.getWindowHandle();
		System.out.println(currentwhandle);
		Set<String> whandles = driver.getWindowHandles();
		Iterator<String> iterators = whandles.iterator();
		String FirstHandle = iterators.next();
		String SecondHandle = iterators.next();
		System.out.println("This is = " +FirstHandle);
		System.out.println("This is second = " + SecondHandle);
		driver.switchTo().window(SecondHandle);
		Thread.sleep(6000);
		WebElement coursesLink = driver.findElement(By.xpath("//*[text()='Courses']"));
		coursesLink.click();
	}

}
