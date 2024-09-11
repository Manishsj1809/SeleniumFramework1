package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathEx {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://olympics.com/en/paris-2024");
		
		driver.get("https://www.prokabaddi.com/standings");
		Thread.sleep(3000);
		WebElement won_medal = driver.findElement(By.xpath("//p[text()='Gujarat Giants']/../../../..//div[@class='table-data matches-won']"));
		System.out.println(won_medal.getText());
		Thread.sleep(3000);
		WebElement total_points = driver.findElement(By.xpath("//p[text()='Gujarat Giants']/../../../following-sibling::div[@class='table-data points']"));
		
		System.out.println(total_points.getText());
		
		
		
		
	}

}
