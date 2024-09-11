package products;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
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
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;
import ObjectRepository.CreateProductPage;
import ObjectRepository.DeletePrdName;
import ObjectRepository.HomePage;

//@Listeners(Generic_Utilities.ListenerImplementation.class)
public class CreateProductAndDeleteProductTest extends BaseClass {

	@Test

	public void CreateProductAndDeleteProductTest() throws Throwable {
//		WebDriver driver = new ChromeDriver();

		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		HomePage home = new HomePage(driver);

		home.clickProductLink();

		CreateProductPage prdPage = new CreateProductPage(driver);
		prdPage.clickPrdHookUp();

		int ranNum = jlib.getRandomNum();

		String prdName = elib.getExcelData("Product", 0, 0) + ranNum;
		System.out.println(prdName);

		prdPage.enterPrdName(prdName);
		prdPage.clickSaveButton();
//
//		ValidationPage page = new ValidationPage(driver);
//		String actdata = page.ValidatePrdname(driver);

//		Assert.assertEquals(actdata, prdName);

		home.clickProductLink();

		DeletePrdName deletePrd = new DeletePrdName(driver);
		deletePrd.selectPrdData(prdName, driver);

		deletePrd.clickOnDeleteButton();
		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		deletePrd.validatePrdDeleted(driver, prdName);

	}

}
