package WebDriver.BrowserHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindow {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        chromeDriver.manage().window().maximize();
        System.out.println(chromeDriver.findElement(By.cssSelector("p")).getText());

        chromeDriver.close();

    }

}
