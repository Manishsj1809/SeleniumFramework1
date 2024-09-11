package campaigns;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import ObjectRepository.CreateCampaignsPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.ValidationPage;

//@Listeners(Generic_Utilities.ListenerImplementation.class)
public class CreateCampaignsTest extends BaseClass {

	@Test
	public void CreateCampaignsTest() throws Throwable {
		// ---------Generic utility---------------------------//

		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		// --------------------------------------------------//
//		WebDriver_Utility wlib = new WebDriver_Utility();

		HomePage home = new HomePage(driver);
		home.clickOnMoreLink();
		home.clickOnCampLink();

		int ranNum = jlib.getRandomNum();

		CreateCampaignsPage campPage = new CreateCampaignsPage(driver);
		campPage.clickHookUpImg();

		String campName = elib.getExcelData("Campaigns", 0, 0) + ranNum;
		System.out.println(campName);

		campPage.enterCampName(campName);
		campPage.clickonsavebutton();

//		ValidationPage page = new ValidationPage(driver);
//		String actdata = page.ValidatecampaignName(driver);
//
//		Assert.assertEquals(actdata, campName);

//		home.logOutFromApp();

	}

}
