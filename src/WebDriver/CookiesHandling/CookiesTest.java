package WebDriver.CookiesHandling;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesTest {

    public static void main(String[] args) {

        Cookie myCookie;

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.get("https://www.amazon.com/");
        System.out.println(chromeDriver.getTitle());
        System.out.println();

        Set <Cookie> cookies= chromeDriver.manage().getCookies();
        System.out.println("Total Cookies Generated: " + cookies.size());
        System.out.println();

        for (Cookie cookie:cookies) {
            System.out.println("Cookie Name: " + cookie.getName());
            System.out.println("Cookie Domain: " + cookie.getDomain());
            System.out.println("Cookie Path: " + cookie.getPath());
            System.out.println("Cookie Value: " + cookie.getValue());
            System.out.println("Cookie Expiry: " + cookie.getExpiry());
            System.out.println("Is cookie secure: " + cookie.isSecure());
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        myCookie= new Cookie("Cookie Test","123456789");
        chromeDriver.manage().addCookie(myCookie);

        cookies= chromeDriver.manage().getCookies();
        System.out.println("Total Cookies Modified: " + cookies.size());
        System.out.println();

        for (Cookie cookie:cookies) {
            System.out.println("Cookie Name: " + cookie.getName());
            System.out.println("Cookie Domain: " + cookie.getDomain());
            System.out.println("Cookie Path: " + cookie.getPath());
            System.out.println("Cookie Value: " + cookie.getValue());
            System.out.println("Cookie Expiry: " + cookie.getExpiry());
            System.out.println("Is cookie secure: " + cookie.isSecure());
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("My cookie is shown below");
        System.out.println(chromeDriver.manage().getCookieNamed("Cookie Test"));
        System.out.println();

        System.out.println("Now I'm going to delete my own created cookie");
        chromeDriver.manage().deleteCookie(myCookie);
        System.out.println();

        System.out.println("My cookie is shown below");
        System.out.println(chromeDriver.manage().getCookieNamed("Cookie Test"));
        System.out.println();

        cookies= chromeDriver.manage().getCookies();
        System.out.println("Cookies after deletion: " +cookies.size());
        System.out.println();

        for (Cookie cookie:cookies) {
            System.out.println("Cookie Name: " + cookie.getName());
            System.out.println("Cookie Domain: " + cookie.getDomain());
            System.out.println("Cookie Path: " + cookie.getPath());
            System.out.println("Cookie Value: " + cookie.getValue());
            System.out.println("Cookie Expiry: " + cookie.getExpiry());
            System.out.println("Is cookie secure: " + cookie.isSecure());
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Now I'm going to delete all cookies");
        chromeDriver.manage().deleteAllCookies();

        cookies= chromeDriver.manage().getCookies();
        System.out.println("Cookies after deletion: " +cookies.size());
        System.out.println();

        for (Cookie cookie:cookies) {
            System.out.println("Cookie Name: " + cookie.getName());
            System.out.println("Cookie Domain: " + cookie.getDomain());
            System.out.println("Cookie Path: " + cookie.getPath());
            System.out.println("Cookie Value: " + cookie.getValue());
            System.out.println("Cookie Expiry: " + cookie.getExpiry());
            System.out.println("Is cookie secure: " + cookie.isSecure());
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
