package WebDriver.ImagesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.get("https://www.orangehrm.com/");
        System.out.println("Page Title: " + chromeDriver.getTitle());

        WebElement webElement= chromeDriver.findElement(By.xpath("/html/body/nav/div/a/img"));

        File file= new File("C://Users//user//Downloads//expectedimage.png");

        if (file.exists()){
            System.out.println("Image exists");
        }else {
            System.out.println("Image not exists");
        }

        Screenshot screenshot= new AShot().takeScreenshot(chromeDriver,webElement);
        try {
            ImageIO.write(screenshot.getImage(),"png",file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (file.exists()){
            System.out.println("Screenshot captured successfully");
        }else {
            System.out.println("Screenshot capturing failed");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
