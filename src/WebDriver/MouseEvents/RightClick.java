package WebDriver.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

    public static void main(String[] args) {

        WebDriver firefoxDriver= new FirefoxDriver();

        firefoxDriver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        firefoxDriver.manage().window().maximize();
        System.out.println(firefoxDriver.getTitle());

        Actions actions= new Actions(firefoxDriver);

        WebElement rightClickButton= firefoxDriver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.contextClick(rightClickButton).build().perform();
        System.out.println("Right clicked on button");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.findElement(By.xpath("/html/body/ul/li[5]/span")).click();
        System.out.println("Item selected from right click menu");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(firefoxDriver.switchTo().alert().getText());
        firefoxDriver.switchTo().alert().accept();

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.close();

    }

}
