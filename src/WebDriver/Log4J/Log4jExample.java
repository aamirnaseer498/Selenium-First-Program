package WebDriver.Log4J;

import WebDriver.PageObjectModel.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jExample {

    public static void main(String[] args) {

        Logger logger= Logger.getLogger(Log4jExample.class);

        WebDriver chromeDriver= new ChromeDriver();

        logger.info("Browser Opened");

        chromeDriver.manage().window().maximize();

        logger.info("Browser windows got maximized");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        LoginPage loginPage = new LoginPage(chromeDriver);

        chromeDriver.get("https://www.gsmarena.com/");
        System.out.println(chromeDriver.getTitle());

        logger.info("Website got opened and page title printed");

        loginPage.clickLoginLinkButton();

        logger.info("Clicked on login link button");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        loginPage.enterEmail("selenium@mailinator.com");

        logger.info("Email is entered");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        loginPage.enterPassword("Revolve@123");

        logger.info("Password is entered");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        loginPage.clickSubmit();

        logger.info("Clicked on login button");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        logger.info("User got logged in successfully");

        chromeDriver.close();

        logger.info("Browser got closed");

    }

}
