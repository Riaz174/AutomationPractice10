package Capstone.AutomationPractice10;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TextVerification extends Utilities {
	
  @Test(priority = 2,dependsOnMethods = "signin")
  public void f() throws IOException, InterruptedException {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  String tx = home.verificationOfText();
	  Thread.sleep(3000);
	  shots();
	  System.out.println(tx);
	 // Assert.assertEquals(tx, "Connect with friends and the world around you on Facebook.");
	  SoftAssert st = new SoftAssert();
	  Thread.sleep(3000);
	  shots();
	  st.assertEquals(tx, "Connect with friends and the world around you on Facebook.");
	  System.out.println("This is after assertion");
	  st.assertAll();
	  Thread.sleep(3000);
	  shots();
	  }
  @Test(priority = 1)
  public void signin(String n, String s) {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.emailField(n);
	  home.pwordField(s);
	  home.loginField();
  }
  
    
	  
	  
  }

  


