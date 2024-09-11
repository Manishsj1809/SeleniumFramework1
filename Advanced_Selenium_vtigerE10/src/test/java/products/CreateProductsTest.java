package products;

import java.io.FileInputStream;

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
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.ValidationPage;

@Listeners(Generic_Utilities.ListenerImplementation.class)
public class CreateProductsTest extends BaseClass {

	@Test
	

	public void createProductsTest() throws Throwable {
		File_Utility flib = new File_Utility();
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();

		HomePage home = new HomePage(driver);

		home.clickProductLink();
		
		CreateProductPage prdPage = new CreateProductPage(driver);


		prdPage.clickPrdHookUp();

		int ranNum = jlib.getRandomNum();

		String prdName = elib.getExcelData("Product", 0, 0) +ranNum;
		System.out.println(prdName);

		prdPage.enterPrdName(prdName);
		
		prdPage.clickSaveButton();
//		
//		ValidationPage page = new ValidationPage(driver);
//		
//
//		String actdata = page.ValidatePrdname(driver);
//
//		Assert.assertEquals(actdata, prdName);
//		Assert.assertEquals(data, prdName, "wrongdatapassed");

//		Thread.sleep(2000);

//		home.logOutFromApp();

	}

}
