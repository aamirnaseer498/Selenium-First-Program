package WebDriver.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        LoginPage loginPage = new LoginPage(chromeDriver);

        chromeDriver.get("https://www.gsmarena.com/");
        System.out.println(chromeDriver.getTitle());

        loginPage.clickLoginLinkButton();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        loginPage.enterEmail("selenium@mailinator.com");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        loginPage.enterPassword("Revolve@123");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        loginPage.clickSubmit();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
