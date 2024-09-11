package Generic_Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportImp implements ITestListener{
ExtentTest test;
ExtentReports report;
	@Override
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		System.out.println("--------i am taking Screenshot");
		String screenshot=null;
		try {
			screenshot=WebDriver_Utility.takeScreenShot1(BaseClass.sdriver, result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenshot);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum();
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Report.html"+ranNum);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("VtigerReport");
		spark.config().setReportName("Manish");
		
		//system configuration
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("platform", "window10");
		report.setSystemInfo("executedby", "manish");
		report.setSystemInfo("Reviewed by", "nobody");
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		report.flush();
	
	}
	
	

}
