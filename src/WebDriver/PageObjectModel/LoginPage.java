package WebDriver.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver webDriver;

    @FindBy (xpath = "//*[@id=\"login-active\"]/i")
    WebElement loginLinkButtonWebElement;

    @FindBy (xpath = "//*[@id=\"email\"]")
    WebElement emailWebElement;

    @FindBy (xpath = "//*[@id=\"upass\"]")
    WebElement passwordWebElement;

    @FindBy (xpath = "//*[@id=\"nick-submit\"]")
    WebElement submitButtonWebElement;

    public LoginPage(WebDriver webDriver){
        this.webDriver= webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void clickLoginLinkButton(){
        loginLinkButtonWebElement.click();
        System.out.println("Login link button is clicked");
    }

    public void enterEmail(String email){
        emailWebElement.sendKeys(email);
        System.out.println("Entered email: " + email);
    }

    public void enterPassword(String password){
        passwordWebElement.sendKeys(password);
        System.out.println("Entered password: " + password);
    }

    public void clickSubmit(){
        submitButtonWebElement.click();
        System.out.println("Login button is clicked");
    }

}
