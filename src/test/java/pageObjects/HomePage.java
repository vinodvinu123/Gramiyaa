package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
		public HomePage(WebDriver driver) {
			super(driver);	
		}
		@FindBy (id="signup")
		WebElement btn_signup;
		public void click_signup() {
			btn_signup.click();
		}	

}
