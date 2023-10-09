package WebDriver.TestNG.Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("Test Succeed");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("Test Failed");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.println("Test Skipped");
    }

}
