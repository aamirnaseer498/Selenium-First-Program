package WebDriver.Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

    public static void main(String[] args) {

        WebDriver webDriver= new ChromeDriver();

        webDriver.get("https://www.gsmarena.com/");

        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//i[@class='head-icon icon-login']")).click();

        boolean loginForm= webDriver.findElement(By.xpath("//input[@id='nick-submit']")).isDisplayed();
        boolean emailField= webDriver.findElement(By.xpath("//input[@id='email']")).isEnabled();
        boolean passwordField= webDriver.findElement(By.xpath("//input[@id='upass']")).isEnabled();

        if (loginForm && emailField && passwordField){
            System.out.println("Login Form : " + loginForm);
            System.out.println("Email Field : " + emailField);
            System.out.println("Password Field : " + passwordField);
            webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
            webDriver.findElement(By.xpath("//input[@id='upass']")).sendKeys("password");
            webDriver.findElement(By.xpath("//input[@id='nick-submit']")).click();
        }

        webDriver.close();

    }

}
