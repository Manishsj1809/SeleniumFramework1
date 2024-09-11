package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignsPage {
	public CreateCampaignsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement hookUpImg;
	
	@FindBy(name="campaignname")
	private WebElement campName;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/select.gif\"]")
	private WebElement prdWin;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getHookUpImg() {
		return hookUpImg;
	}

	public WebElement getCampName() {
		return campName;
	}

	public WebElement getPrdWin() {
		return prdWin;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	public void clickHookUpImg()
	{
		hookUpImg.click();
	}
	
	public void enterCampName(String campNAme)
	{
		campName.sendKeys(campNAme);
	}
	
	public void clickOnPrdWinLink()
	{
		prdWin.click();
	}
	public void clickonsavebutton()
	{
		saveButton.click();
	}

}
