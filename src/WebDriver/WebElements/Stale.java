package WebDriver.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.manage().window().maximize();

        chromeDriver.get("https://ui.cogmento.com/");

        System.out.println(chromeDriver.getTitle());

        WebElement email= chromeDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input"));
        WebElement password= chromeDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input"));

        email.sendKeys("email");
        password.sendKeys("password");

        chromeDriver.navigate().refresh();

        try {

            email.sendKeys("email");
            password.sendKeys("password");

        }catch (StaleElementReferenceException e){

            System.out.println("Exception: " + e.getMessage());

            email= chromeDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input"));
            password= chromeDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input"));

            email.sendKeys("email");
            password.sendKeys("password");

            System.out.println();
            System.out.println("Now exception got handled");
        }

        chromeDriver.close();

    }

}
