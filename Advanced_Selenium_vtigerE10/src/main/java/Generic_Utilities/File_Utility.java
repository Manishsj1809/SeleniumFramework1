package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	
	/**
	 * This method is used to read data from properties file
	 * @param key
	 * @return
	 * @throws Throwable
	 * @author MANISH
	 */
	
	
	public String getPropertiesData(String key) throws Throwable
	{
		 FileInputStream fis=new FileInputStream("./src/test/resources/CommonData8.properties");
			Properties pro=new Properties();
			pro.load(fis);
			String value = pro.getProperty(key);
			
			return value;
	}

}
