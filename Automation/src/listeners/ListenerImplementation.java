package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case is failed",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case is passed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test case is skipped",true);
	}
	
	
	
	


}
