package pageObjects;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	public class RegistrationPage extends BasePage{
		public RegistrationPage(WebDriver driver) {
			super(driver);
		}
		@FindBy (id="firstName")
		WebElement txt_fname;
		@FindBy (id="lastName")
		WebElement txt_lname;
		
		@FindBy (id="email")
		WebElement txt_email;
		@FindBy (id="password")
		WebElement txt_pwd;
		@FindBy (xpath="//button[@id='submit']")
		WebElement btn_submit;
		
		public void setFirstname(String fname) {
			txt_fname.sendKeys(fname);
		}
		public void setLastname(String lname) {
			txt_lname.sendKeys(lname);
		}
		public void setEmail(String mail) {
			txt_email.sendKeys(mail);
		}
		public void setPassword(String pwd) {
			txt_pwd.sendKeys(pwd);
		}
		public void clickSubmit() {
			btn_submit.click();
		}
	{

	}
}
