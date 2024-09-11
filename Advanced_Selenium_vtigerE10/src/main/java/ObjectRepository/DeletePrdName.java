package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePrdName {
	public DeletePrdName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteButton;
	
	public void selectPrdData(String prdName,WebDriver driver)
	{
		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+prdName+"']/../preceding-sibling::td/input[@type='checkbox']")).click();

	}

	public void clickOnDeleteButton()
	{
		deleteButton.click();
	}
	public void validatePrdDeleted(WebDriver driver,String prdName)
	{
		List<WebElement> allprd =driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr//td[3])[position()>1]"));
		boolean flag = false;

		for (WebElement prdName1: allprd) {
			String actData = prdName1.getText();
			System.out.println(actData);
			if (actData.contains(prdName)) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);

		if (!flag) 
		{
			System.out.println("Product data is deleted");
		} else {
			System.out.println("Product data is not deleted");
		}
	}

}
