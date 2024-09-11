package DDT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingDataFromJsonFile {
	public static void main(String[] args) throws Throwable {
		
		File fis= new File("./src/test/resources/forjsonreadingselenium.json");
		
		ObjectMapper jsonData = new ObjectMapper();
		
		JsonNode data = jsonData.readTree(fis);
		
		
		String URL= data.get("url").asText();
		String USERNAME = data.get("username").asText();
		String PASSWORD = data.get("password").asText();
		
	
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
		
		//have to correctly write the key value pair in json documents like {} "  " and , syntax shoul be correct
				
	}

}
