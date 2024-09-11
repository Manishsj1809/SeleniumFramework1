package organization;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import ObjectRepository.CreateOrganizationPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.OrganizationPage;
import ObjectRepository.ValidationPage;


public class CreateOrganizationTest extends BaseClass {
	@Test
	public void CreateOrganizationTest() throws Throwable {

		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();

		// click on organization link
		HomePage home = new HomePage(driver);
		home.getOrgLink().click();

		OrganizationPage orgImg = new OrganizationPage(driver);
		orgImg.clickOrgPlusImg();

		int ranNum = jlib.getRandomNum();

		String OrgName = elib.getExcelData("Organization", 0, 0) + ranNum;
		String phnNUm = elib.getExcelDataUsingFormatter("Organization", 1, 0);
		String mailId = elib.getExcelData("Organization", 2, 0);
		System.out.println(OrgName);

		Thread.sleep(2000);
		CreateOrganizationPage orgPage = new CreateOrganizationPage(driver);
	
		orgPage.enterOrgData(OrgName, phnNUm, mailId);
		
		
		orgImg.clicksavebutton();
	
//		ValidationPage page2 = new ValidationPage(driver);
//		String actualdata = page2.ValidateOrgName(driver);

		
//		Assert.assertEquals(actualdata, OrgName);

//		home.logOutFromApp();

	}

}
