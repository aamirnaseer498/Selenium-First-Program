package WebDriver.BrowserHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.get("https://demo.automationtesting.in/Alerts.html");
        chromeDriver.manage().window().maximize();

        chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
        String expectedText= "You pressed Ok";
        String actualText= "";
        chromeDriver.switchTo().alert().accept();
        actualText= chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).getText();

        if (actualText.equals(expectedText)){
            System.out.println(expectedText);
        }else {
            System.out.println("You pressed Cancel");
        }

        chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
        chromeDriver.switchTo().alert().dismiss();
        actualText= chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).getText();

        if (actualText.equals(expectedText)){
            System.out.println(expectedText);
        }else {
            System.out.println("You pressed Cancel");
        }

        chromeDriver.close();

    }

}
