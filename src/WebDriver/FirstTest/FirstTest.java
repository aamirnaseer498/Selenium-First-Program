package WebDriver.FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    public static void main(String[] args) {

        // 1. Open the browser
        WebDriver webDriver= new FirefoxDriver(); //invokes the browser

        // 2. Open URL
        webDriver.get("https://www.gsmarena.com/"); //Opens URL

        // 3. Open login form
        WebElement loginForm = webDriver.findElement(By.id("login-active")); //Find login form element
        loginForm.click(); // Clicks on login form button

        // 4. Enter email
        WebElement emailField = webDriver.findElement(By.id("email")); //Find email element
        emailField.sendKeys("aamir@revolveai.com"); //Enter email input

        // 5. Enter password
        WebElement passwordField = webDriver.findElement(By.id("upass")); //Find password element
        passwordField.sendKeys("Amir@9087"); //Enter password input

        // 6. Click on login
        WebElement loginButton = webDriver.findElement(By.id("nick-submit")); //Find login button element
        loginButton.click(); // Clicks on login button

        // 7. Hold for moment to get the comparison values

        // 8. Validate the page title
        String expectedTitle= "GSMArena.com - mobile phone reviews, news, specifications and more...";
        String actualTitle= webDriver.getTitle(); //Returns the page title

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }

        // 9. Close the browser
        webDriver.close();

    }

}
