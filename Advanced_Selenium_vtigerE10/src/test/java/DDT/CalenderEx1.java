package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.protobuf.Duration;

public class CalenderEx1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.makemytrip.com/");
		
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		Thread.sleep(3000);
		String monthName = "August 2024";
		String dateList = "22";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='"+monthName+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+dateList+"']")).click();
		//driver.close();
	}

}
