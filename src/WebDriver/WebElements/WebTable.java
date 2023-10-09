package WebDriver.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

    public static void main(String[] args) {

        WebDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("file:/C:/Users/user/Downloads/Web Table.html");

        chromeDriver.manage().window().maximize();

        int rows= chromeDriver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
        System.out.println("Number of Rows: " + rows);
        int columns= chromeDriver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size();
        System.out.println("Number of Columns: " + columns);

        System.out.print(chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[1]")).getText() + "                              ");
        System.out.print(chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[2]")).getText() + "                              ");
        System.out.print(chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[3]")).getText() + "                              ");
        System.out.println();

        for (int i=2; i<=3; i++) {

            for (int j=1; j<=3; j++) {

                System.out.print(chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText() + "                              ");

            }

            System.out.println();

        }

        chromeDriver.close();

    }

}
