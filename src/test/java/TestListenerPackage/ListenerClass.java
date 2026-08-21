package TestListenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{
	    public void onStart(ITestContext context) 
	    {
	        System.out.println("Listener - Test Suite Started");
	    }

	    public void onTestStart(ITestResult result) 
	    {
	        System.out.println("Listener - Test Started: " + result.getName());
	    }

	    public void onTestSuccess(ITestResult result) 
	    {
	        System.out.println("Listener - Test Passed: " + result.getName());
	    }

	    public void onTestFailure(ITestResult result) 
	    {
	        System.out.println("Listener - Test Failed: " + result.getName());
	    }

	    public void onTestSkipped(ITestResult result) 
	    {
	        System.out.println("Listener - Test Skipped: " + result.getName());
	    }

	    public void onFinish(ITestContext context) 
	    {
	        System.out.println("Listener - Test Suite Finished");
	    }
}
