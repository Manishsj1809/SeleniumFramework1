package testNgPractise;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void createProduct()
	{
		System.out.println("product created");
	}
	@Test(priority=1)
	
		public void modifyProductTest()
		{
			System.out.println("product modified");
		}
	@Test
	public void deleteProductTest()
	{
		System.out.println("product deleted");
	}
	

}
