package WebDriver.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {

        WebDriver firefoxDriver= new FirefoxDriver();

        firefoxDriver.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        firefoxDriver.manage().window().maximize();
        System.out.println(firefoxDriver.getTitle());

        WebElement object= firefoxDriver.findElement(By.xpath("//*[@id=\"box1\"]"));
        WebElement box= firefoxDriver.findElement(By.xpath("//*[@id=\"box103\"]"));

        Actions actions= new Actions(firefoxDriver);

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.dragAndDrop(object,box).build().perform();

//        actions.clickAndHold(object).build().perform();
//        System.out.println("Item clicked and holded");
//
//        try {
//            Thread.sleep(2500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        actions.moveToElement(box).build().perform();
//        System.out.println("Item moved to new location");
//
//        try {
//            Thread.sleep(2500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        actions.release().build().perform();
//        System.out.println("Item released on new location");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.close();

    }

}
