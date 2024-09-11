package Generic_Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	public void FullScreenWindow(WebDriver driver) {
		driver.manage().window().fullscreen();
	}

	public void waitPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void switchingWindows(WebDriver driver,String title) {
		Set<String> allWin = driver.getWindowHandles();//window1,windoww2

		Iterator<String> it = allWin.iterator();
		while (it.hasNext()) {
			String win = it.next();
			driver.switchTo().window(win);
			String currentTitle = driver.getTitle();

			if (currentTitle.contains(title)) {
				break;
			}

		}
	}
		public  void moveToElementAction(WebDriver driver,WebElement ele)
		{
			Actions act = new Actions(driver);
			act.moveToElement(ele).click().perform();
		}
		
		public static String takeScreenShot1(WebDriver driver,String screenShotName) throws Throwable
		{
			TakesScreenshot takesScreenShot = (TakesScreenshot)BaseClass.sdriver;
			File src = takesScreenShot.getScreenshotAs(OutputType.FILE);
			File dst = new File("./ScreenShots/"+ screenShotName +".png");
			FileUtils.copyFile(src, dst);
		
			return dst.getAbsolutePath();
			
		}
		

	
}
