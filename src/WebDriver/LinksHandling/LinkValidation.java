package WebDriver.LinksHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class LinkValidation {

    public static void main(String[] args) {

        WebDriver firefoxDriver= new FirefoxDriver();

        firefoxDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.navigate().to("https://www.snapchat.com/");
        List <WebElement> links= firefoxDriver.findElements(By.tagName("a"));
        System.out.println("Total links in this page: " + links.size());

        for (WebElement webElement : links) {

            try {
                String url = webElement.getAttribute("href");
                URL link = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) link.openConnection();
                Thread.sleep(1000);
                connection.connect();
                int responseCode = connection.getResponseCode();

                if (responseCode > 400) {
                    System.out.println("Response Code: " + responseCode);
                    System.out.println("It is a broken link");
                } else {
                    System.out.println("Response Code: " + responseCode);
                    System.out.println("It is a valid link");
                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        firefoxDriver.close();

    }

}
