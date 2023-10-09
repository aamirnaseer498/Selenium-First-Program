package WebDriver.Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTest {

    public static void main(String[] args) {

        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--headless");

        WebDriver webDriver= new ChromeDriver(chromeOptions);
        webDriver.get("https://www.gsmarena.com/");

        webDriver.manage().window().maximize();

        System.out.println("Webpage Title: " + webDriver.getTitle());
        System.out.println("Webpage URL: " + webDriver.getCurrentUrl());

        webDriver.close();
    }

}
