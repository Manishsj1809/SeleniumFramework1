package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage {
	public ValidationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public String ValidatePrdname(WebDriver driver)
	{
		
		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
		return actData;
	
	}
	public String ValidatecampaignName(WebDriver driver)
	{
		String campnamev = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText();
		return campnamev;
	}
	
	public String ValidateOrgName(WebDriver driver)
	{
		String orgname = driver.findElement(By.xpath("//span[@id=\"dtlview_Organization Name\"]")).getText();
		return orgname;
	}
	
	
	
}
