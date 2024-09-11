package assignmentdynamicxpath;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Phonecolourprint1 {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone",Keys.ENTER);
		List<WebElement> allColours = driver.findElements(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']/../../../..//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//a"));
		
		for(WebElement colour:allColours) {
			System.out.println(colour.getAttribute("aria-label"));
		}
	
		
		
		Thread.sleep(2000);
	//driver.close();
	}

}
