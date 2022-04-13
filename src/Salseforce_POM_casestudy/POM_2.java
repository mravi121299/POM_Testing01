package Salseforce_POM_casestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class POM_2 {
	WebDriver driver;
		
	public POM_2(WebDriver driver) {
		this.driver=driver;
			
		}
	@FindBy(how = How.ID, using="username")
	WebElement UserName;

	@FindBy(how = How.ID, using="password")
	WebElement Password;

	@FindBy(how = How.XPATH, using="//*[@id=\"Login\"]")
	WebElement LoginBtn;
	public void LogininSalseforce(String Uname, String Psd) {
		UserName.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}
	}


