package Salseforce_POM_casestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome", "https://login.salesforce.com/?locale=in");
		POM_2 loginSalseforce = PageFactory.initElements(driver, POM_2.class);
		loginSalseforce.LogininSalseforce("Ravi", "Ravi@123");
	}

}

