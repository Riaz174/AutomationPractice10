package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Connect with friends and the world around you on Facebook.')]") WebElement text;
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "pass") WebElement pword;
	@FindBy(name = "login") WebElement button;
	
	public HomeOfFacebook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String verificationOfText() {
		String tx = text.getText();
		return tx;
	}
	public void emailField(String id) {
		email.sendKeys(id);
	}
	public void pwordField(String id) {
		pword.sendKeys(id);
	}
	public void loginField() {
		button.click();
		
	}

}
