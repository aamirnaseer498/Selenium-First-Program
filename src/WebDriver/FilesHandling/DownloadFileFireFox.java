package WebDriver.FilesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFileFireFox {

    public static void main(String[] args) {

        WebDriver firefoxDriver= new FirefoxDriver();

        firefoxDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.navigate().to("https://demo.automationtesting.in/FileDownload.html");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firefoxDriver.findElement(By.id("textbox")).sendKeys("This is a text file");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firefoxDriver.findElement(By.id("createTxt")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firefoxDriver.findElement(By.id("link-to-download")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File downloaded successfully");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.close();

    }

}
