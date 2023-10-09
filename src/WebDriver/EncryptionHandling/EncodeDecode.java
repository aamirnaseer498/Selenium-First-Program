package WebDriver.EncryptionHandling;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodeDecode {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.get("https://www.facebook.com/index.php");
        System.out.println("Page Title: " + chromeDriver.getTitle());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@xyz.com");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String password= "123456789";
        byte[] encodedPassword= Base64.encodeBase64(password.getBytes());
        chromeDriver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(encodedPassword.toString());
        System.out.println("Encoded Password: " + encodedPassword.toString());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.findElement(By.name("login")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
