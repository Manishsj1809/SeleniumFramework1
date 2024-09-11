package campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

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
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.ValidationPage;
import ObjectRepository.WindowSwitchingCampWithPrd;

//@Listeners(Generic_Utilities.ListenerImplementation.class)
public class CreateCampaignsWithProduct2Test extends BaseClass {
	@Test
	public void CreateCampaignsWithProduct2Test() throws Throwable {

		File_Utility flib = new File_Utility();
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		// --------------------------------------------------//
		WebDriver_Utility wlib = new WebDriver_Utility();

		HomePage home = new HomePage(driver);
		home.clickProductLink();

		CreateProductPage prdPage = new CreateProductPage(driver);
		prdPage.clickPrdHookUp();

		// to avoid duplicates
		int ranNum = jlib.getRandomNum();

		String prdName = elib.getExcelData("Product", 1, 0) + ranNum;
		System.out.println(prdName);

		prdPage.enterPrdName(prdName);
		prdPage.clickSaveButton();
//		
//		ValidationPage page = new ValidationPage(driver);
//		String actdata = page.ValidatePrdname(driver);
//		
//		Assert.assertEquals(actdata, prdName);

		home.clickOnMoreLink();
		home.clickOnCampLink();
		

		CreateCampaignsPage campPage = new CreateCampaignsPage(driver);
		campPage.clickHookUpImg();

		String campName = elib.getExcelData("Campaigns", 0, 0) + ranNum;
		System.out.println(campName);

		campPage.enterCampName(campName);
		campPage.clickOnPrdWinLink();

		wlib.switchingWindows(driver, "Products&action");

		WindowSwitchingCampWithPrd switching = new WindowSwitchingCampWithPrd(driver);
		switching.enterPrdName(prdName);
		switching.clickOnSearchBar();
		switching.clickonprdName(driver, prdName);

		wlib.switchingWindows(driver, "Campaigns&action");
		campPage.clickonsavebutton();
//		String actdata2 = page.ValidatecampaignName(driver);
		
//		Assert.assertEquals(actdata2, campName);

//		home.logOutFromApp();

	}

}
