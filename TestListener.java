package projectVia;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

public class TestListener extends Base  implements ITestListener 
{
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Success");
		try {
			Reporter.log(result.getTestName());
			captureScreen();
			extentlogger.log(Status.FAIL, "Test failed");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

//	@Override
//	public void onTestStart(ITestResult result) {
//		Reporter.log("Test Start");
//	}
	
	
	
}
