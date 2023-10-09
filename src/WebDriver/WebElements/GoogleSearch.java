package WebDriver.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearch {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.google.com/");
        System.out.println(chromeDriver.getTitle());

        chromeDriver.findElement(By.name("q")).sendKeys("java");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List <WebElement> webElementList= chromeDriver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
        System.out.println("Total search suggestions: " + webElementList.size());

        for (WebElement webElement: webElementList){
            System.out.println(webElement.getText());
            if (webElement.getText().contains("javatpoint")){
                webElement.click();
                break;
            }
        }

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.close();

    }

}
