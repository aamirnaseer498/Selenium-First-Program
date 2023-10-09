package WebDriver.JavaScriptExecutions.ScrollHandling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TillPageEnd {

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

        //Scroll bottom
        javascriptExecutor.executeScript("0,window.scrollTo(document.body.scrollHeight)");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
