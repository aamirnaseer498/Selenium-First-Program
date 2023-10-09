package WebDriver.ImagesHandling.ScreenRecord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenRecordTest {

    WebDriver chromeDriver;

    @BeforeClass
    public void setup(){
        chromeDriver= new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://demo.nopcommerce.com/computers");
        System.out.println(chromeDriver.getTitle());
    }

    @Test
    public void verifyLinks() throws Exception{
        ScreenRecorderUtil.startRecord("verifyLinks");

        chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/a")).click();
        System.out.println(chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/a")).getText() + " Clicked");

        chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
        System.out.println(chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/a")).getText() + " Clicked");

        chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
        System.out.println(chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/a")).getText() + " Clicked");

        chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/a")).click();
        System.out.println(chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/a")).getText() + " Clicked");

        chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[5]/a")).click();
        System.out.println(chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[5]/a")).getText() + " Clicked");

        chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[6]/a")).click();
        System.out.println(chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[6]/a")).getText() + " Clicked");

        chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[7]/a")).click();
        System.out.println(chromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[7]/a")).getText() + " Clicked");

        ScreenRecorderUtil.stopRecord();
    }

    @AfterClass
    public void tearDown(){
        chromeDriver.close();
    }

}
