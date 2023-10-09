package WebDriver.JavaScriptExecutions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshBrowser {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();
        JavascriptExecutor javascriptExecutor;
        WebElement webElement;

        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.get("https://www.twoplugs.com/");
        System.out.println(chromeDriver.getTitle());

        javascriptExecutor= (JavascriptExecutor) chromeDriver;

        webElement= chromeDriver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
        System.out.println(webElement.getText());

        JavaScriptUtil.refreshBrowser(javascriptExecutor);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
