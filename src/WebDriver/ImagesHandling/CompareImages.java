package WebDriver.ImagesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompareImages {

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

        String imagePath= "C://Users//user//Downloads//expectedimage.png";

        BufferedImage expectedImage;

        try {
            expectedImage= ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (expectedImage.getWidth()!=0){
            System.out.println("Expected image exists");
        }else {
            System.out.println("Expected image not exists");
        }

        Screenshot screenshot= new AShot().takeScreenshot(chromeDriver,webElement);

        System.out.println("Now comparing expected and actual images");

        BufferedImage actualImage= screenshot.getImage();

        if (actualImage.getWidth()!=0){
            System.out.println("Screenshot of actual image captured successfully");
        }else {
            System.out.println("Screenshot capturing failed");
        }

        ImageDiffer imageDiffer= new ImageDiffer();
        ImageDiff imageDiff= imageDiffer.makeDiff(expectedImage,actualImage);

        if (imageDiff.hasDiff()){
            System.out.println("Images are not same");
        }else {
            System.out.println("Expected and actual images are same");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
