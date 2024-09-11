package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//declaration
		@FindBy(name="user_name")
		private WebElement UserTextField;
		
		@FindBy(css="[name='user_password']")
		private WebElement PassWordTextField;
		
		@FindBy(xpath="//input[@id='submitButton']")
		private WebElement LoginButton;
		
		public WebElement getUserTextField() {
			return UserTextField;
		}

		public WebElement getPassWordTextField() {
			return PassWordTextField;
		}

		public WebElement getLoginButton() {
			return LoginButton;
		}
		//Business logics
		public void loginToApp(String UserName,String PassWord)
		{
			UserTextField.sendKeys(UserName);
			PassWordTextField.sendKeys(PassWord);
			LoginButton.click();
		}

}
