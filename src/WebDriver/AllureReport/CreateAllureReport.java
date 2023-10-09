package WebDriver.AllureReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAllureReport {

    WebDriver webDriver;

    @BeforeClass
    public void setup(){
        webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://demo.nopcommerce.com/");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(webDriver.getTitle());
    }

    @Test(priority = 1)
    public void logoPresence(){
        boolean logoPresent= webDriver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        Assert.assertTrue(logoPresent);
        System.out.println("Logo is present");
    }

    @Test(priority = 2)
    public void loginTest(){
        webDriver.findElement(By.xpath("//a[@class='ico-login']")).click();
        webDriver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nop1@mailinator.com");
        webDriver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Revolve@123");
        webDriver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        Assert.assertEquals(webDriver.getTitle(),"nopCommerce demo store");
    }

    @Test(priority = 3)
    public void registrationTest(){
        throw new SkipException("Skipping this test");
    }

    @AfterClass
    public void tearDown(){
        webDriver.close();
    }

}
