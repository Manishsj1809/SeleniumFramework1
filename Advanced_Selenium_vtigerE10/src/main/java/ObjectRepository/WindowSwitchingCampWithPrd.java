package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowSwitchingCampWithPrd {
	
	public WindowSwitchingCampWithPrd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="search_text")
	private WebElement prdTextfield;
	
	public WebElement getPrdTextfield() {
		return prdTextfield;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	@FindBy (xpath="//input[@type='button']")
	private WebElement searchBar;
	
	public void clickonprdName(WebDriver driver,String prdName )
	{
		driver.findElement(By.xpath("//a[text()='" + prdName + "']")).click();

	}
	
	public void enterPrdName(String prdName)
	{
		prdTextfield.sendKeys(prdName);
	}
	public void clickOnSearchBar()
	{
		searchBar.click();
	}
}
