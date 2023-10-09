package WebDriver.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

    public static void main(String[] args) {

        WebDriver firefoxDriver= new FirefoxDriver();

        firefoxDriver.navigate().to("https://jqueryui.com/resizable/");
        firefoxDriver.manage().window().maximize();
        System.out.println(firefoxDriver.getTitle());

        firefoxDriver.switchTo().frame(0);
        WebElement resizer= firefoxDriver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

        Actions actions= new Actions(firefoxDriver);

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.moveToElement(resizer).build().perform();
        System.out.println("Item ready to resize");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.dragAndDropBy(resizer,300,0).build().perform();
        System.out.println("Item got resized horizontally");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.dragAndDropBy(resizer,0,200).build().perform();
        System.out.println("Item got resized vertically");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.dragAndDropBy(resizer,-300,-200).build().perform();
        System.out.println("Item got resized in x and y axis together");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.close();

    }

}
