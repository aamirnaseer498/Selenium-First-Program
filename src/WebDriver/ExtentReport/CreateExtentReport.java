package WebDriver.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateExtentReport {

    ExtentSparkReporter extentSparkReporter= new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extent-report.html");
    ExtentReports extentReports;
    ExtentTest extentTest;

    @BeforeTest
    public void startReport(){
        extentReports= new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        try {
            extentSparkReporter.loadXMLConfig(System.getProperty("user.dir") + "\\src\\extent-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        extentSparkReporter.config().setTheme(Theme.STANDARD);
//        extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
//        extentSparkReporter.config().setReportName("Test Report");
//        extentSparkReporter.config().setTimelineEnabled(true);
    }

    @Test
    public void test1(){
        extentTest= extentReports.createTest("Test1");
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
        extentTest= extentReports.createTest("Test2");
        Assert.assertTrue(false);
    }

    @Test
    public void test3(){
        extentTest= extentReports.createTest("Test3");
        throw new SkipException("The test is skipped");
    }

    @AfterMethod
    public void getResult(ITestResult result){
        if (result.getStatus()==ITestResult.SUCCESS){
            extentTest.log(Status.PASS, result.getTestName());
        } else if (result.getStatus()==ITestResult.FAILURE) {
            extentTest.log(Status.FAIL, result.getThrowable());
        }else {
            extentTest.log(Status.SKIP, result.getTestName());
        }
    }

    @AfterTest
    public void endReport(){
        extentReports.flush();
    }

}
