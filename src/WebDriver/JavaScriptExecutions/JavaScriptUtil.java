package WebDriver.JavaScriptExecutions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

    public static void flash(WebElement element, JavascriptExecutor javascriptExecutor) {

        String bgColor= element.getCssValue("backgroundColor");

        for (int i=0; i<10; i++) {
            changeColor("#000000", element, javascriptExecutor);
            changeColor(bgColor, element, javascriptExecutor);
        }

    }

    public static void changeColor(String color, WebElement element, JavascriptExecutor javascriptExecutor){

        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void drawBorder(WebElement element, JavascriptExecutor javascriptExecutor){

        javascriptExecutor.executeScript("arguments[0].style.border='5px solid red'",element);

    }

    public static void getTitle(JavascriptExecutor javascriptExecutor){

        System.out.println("Page Title: " + javascriptExecutor.executeScript("return document.title;").toString());

    }

    public static void clickElement(WebElement element, JavascriptExecutor javascriptExecutor){

        javascriptExecutor.executeScript("arguments[0].click();", element);

    }

    public static void generateAlert(String message, JavascriptExecutor javascriptExecutor){

        javascriptExecutor.executeScript("alert('"+ message +"')");

    }

    public static void refreshBrowser(JavascriptExecutor javascriptExecutor){

        javascriptExecutor.executeScript("history.go(0)");

    }

}
