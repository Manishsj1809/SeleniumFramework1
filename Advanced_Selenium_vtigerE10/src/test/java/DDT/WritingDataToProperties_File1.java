package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingDataToProperties_File1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//step1:-get java representataion object of the physical field
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData8.properties");
//		Properties pro=new Properties();
//		pro.load(fis);
//		String URL = pro.getProperty("url");
//		String USERNAME = pro.getProperty("username");
//		String PASSWORD = pro.getProperty("password");
//		
//		driver.get(URL);
//		driver.findElement(By.name("user-name")).sendKeys(USERNAME);
//		driver.findElement(By.id("password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("login-button")).click();
//		
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/CommonData8.properties");
		
		Properties p1=new Properties();
		
		p1.setProperty("url","https://www.saucedemo.com/v1/");
		p1.setProperty("username","standard_user");
		p1.setProperty("password","secret_sauce");
		p1.store(fos, "data for writing");
		
		Thread.sleep(2000);
		driver.close();
	
		
		
		
	}

}
