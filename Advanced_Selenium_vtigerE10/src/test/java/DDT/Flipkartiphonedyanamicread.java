package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkartiphonedyanamicread {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Thread.sleep(4000);
		WebElement price_list = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../../..//div[@class='cN1yYO']"));
		System.out.println(price_list.getText());
	}

}
//m
