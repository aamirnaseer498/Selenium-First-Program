package WebDriver.BrowserHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.get("https://www.gsmarena.com/nothing_phone_(2)-12386.php");

        chromeDriver.findElement(By.xpath("//*[@id=\"body\"]/div/table/tbody/tr[1]/td[2]/a")).click();

        for (String window: chromeDriver.getWindowHandles()) {
            System.out.println(window);
            String title= chromeDriver.switchTo().window(window).getTitle(); //switching to tab or window
            System.out.println(title);
            if (title.contains("Nothing Phone (2) - Full phone specifications")){
                chromeDriver.close(); //closing the tab or window
            }
        }

    }

}
