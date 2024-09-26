package Capstone.AutomationPractice10;

import org.testng.annotations.Test;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.emailField(n);
	  home.pwordField(s);
	  home.loginField();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ali", "abcdef" },
      new Object[] { "Saleem", "ghijkl" },
      new Object [] {"Rabiya","mnopqres"},
    };
  }
}
