package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Declaration
	@FindBy(linkText = "Organizations")
	private WebElement OrgLink;

	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement AdminLink;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;

	@FindBy(linkText = "Products")
	private WebElement prdLink;
	

	@FindBy(linkText="More")
	private WebElement moreLink;
	
	@FindBy(linkText="Campaigns")
	private WebElement campLink;

	public WebElement getPrdLink() {
		return prdLink;
	}

	public WebElement getOrgLink() {
		return OrgLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampLink() {
		return campLink;
	}

	public WebElement getAdminLink() {
		return AdminLink;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	/**
	 * this method is used to click on products page in homepage
	 * @author manish
	 */
	public void clickProductLink()
	{
		prdLink.click();
	}


	/**
	 * this method is used to signout from application using mousehover action
	 * 
	 * @author manish
	 */
	public void signOutApp(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(AdminLink).perform();
		signOut.click();
	}

	public void logOutFromApp() {
		AdminLink.click();
		signOut.click();

	}
	
	public void clickOnMoreLink()
	{
		moreLink.click();
	}
	
	public void clickOnCampLink()
	{
		campLink.click();
	}

}
