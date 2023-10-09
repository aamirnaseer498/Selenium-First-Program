package WebDriver.Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

    public static void main(String[] args) {

        WebDriver webDriver= new ChromeDriver();

        webDriver.get("https://www.gsmarena.com/");

        webDriver.navigate().to("https://www.phonearena.com/");

        webDriver.navigate().back();

        webDriver.navigate().forward();

        webDriver.navigate().refresh();

        webDriver.close();

    }

}
