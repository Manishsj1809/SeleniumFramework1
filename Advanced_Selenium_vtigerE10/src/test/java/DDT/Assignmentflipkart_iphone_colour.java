package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentflipkart_iphone_colour {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("field_keywords")).sendKeys("iphone",Keys.ENTER);
		//push
		
		//pullit
		
	}

}
