package WebDriver.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.navigate().to("C://Users//user//Downloads//Mouse Over.html");
        chromeDriver.manage().window().maximize();
        System.out.println(chromeDriver.getTitle());

        Actions actions= new Actions(chromeDriver);

        WebElement dropDownList= chromeDriver.findElement(By.xpath("/html/body/div/button"));
        WebElement dropDownItem= chromeDriver.findElement(By.xpath("/html/body/div/div/a[1]"));

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.moveToElement(dropDownList).build().perform();
        System.out.println("Mouse moved to drop down list");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.moveToElement(dropDownItem).click().build().perform();
        System.out.println("Clicked on list item");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
