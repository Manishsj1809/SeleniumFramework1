package Generic_Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImp implements IRetryAnalyzer{

	
	int count=0;
	int retryLimit=2;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<retryLimit)
		{
			count++;
			return true;
			
		}
		return false;
	}
	
	

}
