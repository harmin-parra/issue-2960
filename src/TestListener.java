

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

    public TestListener() { }

    @Override
    public void onTestStart(ITestResult result) {
    	System.out.println("onTestStart");
        throw new SkipException("Skip");
     }

    @Override
    public void onTestSuccess(ITestResult result) {
    	System.out.println("onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	System.out.println("onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    	System.out.println("onTestSkipped");
    }
}
