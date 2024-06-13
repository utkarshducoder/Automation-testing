package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{
	@Override
    public void onTestStart(ITestResult result) {
        // This method is invoked each time before a test will be invoked.
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // This method is invoked each time a test succeeds.
    	System.out.println("Test case sucsessfully runs");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This method is invoked each time a test fails.
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // This method is invoked each time a test is skipped.
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // This method is invoked each time a test fails but within success percentage.
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // This method is invoked each time a test fails due to a timeout.
        // Deprecated and will be removed in future versions. Use onTestFailure instead.
    }

    @Override
    public void onStart(ITestContext context) {
        // This method is invoked before any test method is invoked.
    }

    @Override
    public void onFinish(ITestContext context) {
        // This method is invoked after all test methods have run.
    }
}
