package assignmentdynamicxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneNamesAndPrices1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		List<WebElement> phonenames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		for(WebElement phone : phonenames) {
			System.out.println(phone.getText());
		}
	}

}
