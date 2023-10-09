package WebDriver.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropDownList {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();

        chromeDriver.get("https://testautomationpractice.blogspot.com/");
        chromeDriver.manage().window().maximize();

        WebElement webElement= chromeDriver.findElement(By.xpath("//*[@id=\"country\"]"));
        Select country= new Select(webElement);

        List countriesList= new ArrayList<>();
        List tempList= new ArrayList<>();

        List <WebElement>countries= country.getOptions();

        for (WebElement element : countries) {
            countriesList.add(element.getText());
            tempList.add(element.getText());
        }

        System.out.println("Non Sorted Temp List: " + tempList);
        System.out.println("Non Sorted Original List: " + countriesList);
        System.out.println();

        Collections.sort(tempList);

        System.out.println("Sorted Temp List: " + tempList);
        System.out.println("Sorted Original List: " + countriesList);
        System.out.println();

        if (tempList==countriesList){
            System.out.println("Drop down list items are sorted");
        }else {
            System.out.println("Drop down list items are not sorted");
        }

        chromeDriver.close();

    }

}
