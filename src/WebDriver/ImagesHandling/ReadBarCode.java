package WebDriver.ImagesHandling;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadBarCode {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.get("https://www.cognex.com/resources/interactive-tools/free-barcode-generator");
        System.out.println("Page Title: " + chromeDriver.getTitle());

        chromeDriver.findElement(By.xpath("//*[@id=\"main\"]/div/content/div[2]/span[5]/img")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String barCodeURL= chromeDriver.findElement(By.xpath("//*[@id=\"barcode-image\"]")).getAttribute("src");
        System.out.println("Bar Code URL: " + barCodeURL);

        URL url;

        try {
            url= new URL(barCodeURL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        BufferedImage bufferedImage;

        try {
            bufferedImage= ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap binaryBitmap= new BinaryBitmap(new HybridBinarizer(luminanceSource));

        Result result;

        try {
            result= new MultiFormatReader().decode(binaryBitmap);
        } catch (NotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("BarCode Value: " + result.getText());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
