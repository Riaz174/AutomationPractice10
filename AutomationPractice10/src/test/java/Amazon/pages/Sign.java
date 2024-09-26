package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public static WebDriver driver;
	@FindBy(name = "pass") WebElement pwordField;
	@FindBy(name = "login") WebElement logbutton;
	
	public Sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void emailField() {
		pwordField.sendKeys("abcdef");
	}
	
	public void continueClick() {
		logbutton.click();
	}

}
