package WebDriver.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

    public static void main(String[] args) {

        WebDriver firefoxDriver= new FirefoxDriver();

        firefoxDriver.navigate().to("https://jqueryui.com/slider/");
        firefoxDriver.manage().window().maximize();
        System.out.println(firefoxDriver.getTitle());

        firefoxDriver.switchTo().frame(0);
        WebElement slider= firefoxDriver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

        Actions actions= new Actions(firefoxDriver);

        actions.moveToElement(slider).build().perform();
        System.out.println("Slider ready to move");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.dragAndDropBy(slider,500,0).build().perform();
        System.out.println("Slider moved horizontally");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.close();

    }

}
