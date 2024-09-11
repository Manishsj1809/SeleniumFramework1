package testNgPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx2 {
	
		//dataProvider:- Executing same method/script multiple times with different se of data
		//Return Type of data provider provides 2 Dimensional Object Array
		
		
		@Test(dataProvider="dataProvider_BookTickets")
		
		public void bookTickets(String src,String dest,int noOfPPl)
		{
			System.out.println("Book Tickets from"+src+ "to" +dest+","+noOfPPl+"");
			
		}
@DataProvider
public Object[][] dataProvider_BookTickets()
{
	Object[][] objArr=new Object[2][3];
	
	objArr[0][0]="Bangalore";
	objArr[0][1]="Goa";
	objArr[0][2]=5;
	
	objArr[1][0]="Bangalore";
	objArr[1][1]="Mysuru";
	objArr[1][2]=3;
	
	return objArr;
	
}
}
