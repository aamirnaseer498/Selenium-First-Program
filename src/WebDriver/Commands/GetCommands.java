package WebDriver.Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

    public static void main(String[] args) {

        String pageTitle, pageUrl, elementText;
        WebDriver webDriver= new ChromeDriver();

        webDriver.get("https://www.gsmarena.com/");

        pageTitle= webDriver.getTitle();
        System.out.println("Page Title : " + pageTitle);
        pageUrl= webDriver.getCurrentUrl();
        System.out.println("Page Url: " + pageUrl);

        elementText= webDriver.findElement(By.xpath("//div[@class='news-column-index']//div[3]//a[1]//h3[1]")).getText();
        System.out.println("Element Text: " + elementText);

        webDriver.close();

    }

}
