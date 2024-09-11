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

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;

public class CreateProductAndDeleteProduct2 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		// Generic file utility
		File_Utility flib = new File_Utility();
		String URL = flib.getPropertiesData("url");
		String USERNAME = flib.getPropertiesData("UserName");
		String PASSWORD = flib.getPropertiesData("PassWord");

//		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData8.properties");
//		Properties pro = new Properties();
//		pro.load(fis);
//		String URL = pro.getProperty("url");
//		String USERNAME = pro.getProperty("UserName");
//		String PASSWORD = pro.getProperty("PassWord");

		driver.get(URL);

		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();

		// TO avoid Duplicates
//		Random ran = new Random();
//		int ranNum = ran.nextInt(1000);

		// Generic Java utility
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum();

//		FileInputStream fes = new FileInputStream(
//				"C:\\Users\\admin\\eclipse-workspace\\Advanced_Selenium_vtigerE10\\src\\test\\resources\\TestDataa.xlsx");
//
//		Workbook book = WorkbookFactory.create(fes);
//
//		Sheet sheet = book.getSheet("Product");
//
//		Row row = sheet.getRow(1);
//
//		Cell cell = row.getCell(1);
//
//		String prdName = cell.getStringCellValue() + ranNum;

		// Generic Excel Utility
		Excel_Utility elib = new Excel_Utility();
		String prdData = elib.getExcelData("Product", 0, 0) + ranNum;
		System.out.println(prdData);
		System.out.println(prdData);

		driver.findElement(By.name("productname")).sendKeys(prdData);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();

		driver.findElement(By.linkText("Products")).click();
		Thread.sleep(3000);

//		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='" + prdName
//				+ "']/../preceding-sibling::td//input[@type='checkbox']")).click();
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='Delete']")).click();
//		driver.switchTo().alert().accept();

//		List allNames = driver.findElements(By.xpath("//table[@class='lvt small']/tbody//tr//td[3])[position()>1]"));
//	    boolean flag = false;
//	
//	for (WebElement name : allNames)
//	{
//		String actData = name.getText();
//		if(actData.contains(prdName))
//		{
//			flag=true;
//			break;
//		}
//	}
//	if(flag)
//	{
//		System.out.println("product name is deleted");
//	}
//	else
//	{
//		System.out.println("product name is not deleted");
//	}

//		List<WebElement> productList = driver
//				.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr//td[3])[position()>1]"));
//
//		boolean flag = false;
//
//		for (WebElement prdName1 : productList) {
//			String actData = prdName1.getText();
//			if (actData.contains(prdName)) {
//				flag = true;
//				break;
//			}
//		}
//		if (flag) {
//			System.out.println("product data is deleted");
//		} else {
//			System.out.println("product data not deleted");
//		}
		
		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+prdData+"']/../preceding-sibling::td/input[@type='checkbox']")).click();
        
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();

//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		List<WebElement> allprd = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr//td[3])[position()>1]"));
			
		boolean flag=false;
			
			for (WebElement prdName : allprd)
			{
				String actData = prdName.getText();
				if(actData.contains(prdData))
				{
					flag=true;
					break;
				}
			}
			System.out.println(flag);
			if(flag)
			{
				System.out.println("Product data is deleted");
			}
			else
			{
				System.out.println("Product data is not deleted");
			}
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			driver.findElement(By.linkText("Sign Out")).click();
	}

}
