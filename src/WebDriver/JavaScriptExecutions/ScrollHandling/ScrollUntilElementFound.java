package WebDriver.JavaScriptExecutions.ScrollHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilElementFound {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.get("https://www.worldometers.info/geography/alphabetical-list-of-countries/");
        System.out.println(chromeDriver.getTitle());

        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) chromeDriver;

        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",chromeDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/table/tbody/tr[132]/td[2]")));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
