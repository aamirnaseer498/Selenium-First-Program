package WebDriver.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();
        String month="";
        String day="";

        chromeDriver.get("https://www.rapidtables.com/tools/todays-date.html");

        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i=7; i>=2; i--) {
            chromeDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/div[1]/div[1]/div[1]")).click();
            month= chromeDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/div[1]/div[1]/div[2]/span[1]")).getText();
            if (month.contains("February")){
                chromeDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/div[1]/div[2]/div[35]")).click();
                day= chromeDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/div[1]/div[2]/div[35]")).getText();
                break;
            }
        }

        System.out.println("Selected Date: " + day + " " + month);

        chromeDriver.close();

    }

}
