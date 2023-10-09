package WebDriver.KeyboardEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotApiDemo {

    public static void main(String[] args) {

        WebDriver firefoxDriver= new FirefoxDriver();

        firefoxDriver.manage().window().maximize();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.navigate().to("https://accounts.snapchat.com/accounts/v2/signup");
        System.out.println(firefoxDriver.getTitle());

        Robot robot;

        try {

            robot= new Robot();

            for (int i=0; i<6; i++) {
                robot.keyPress(KeyEvent.VK_TAB);
                System.out.println("Tab key pressed");
                Thread.sleep(1000);
            }

            for (int i=0; i<9; i++) {
                robot.keyPress(KeyEvent.VK_DOWN);
                System.out.println("Down key pressed");
                Thread.sleep(500);
            }

            robot.keyPress(KeyEvent.VK_TAB);
            System.out.println("Tab key pressed");
            Thread.sleep(1000);

            for (int i=0; i<19; i++) {
                robot.keyPress(KeyEvent.VK_UP);
                System.out.println("Up key pressed");
                Thread.sleep(250);
            }

            robot.keyPress(KeyEvent.VK_TAB);
            System.out.println("Tab key pressed");
            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_1);
            System.out.println("1 key pressed");
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_9);
            System.out.println("9 key pressed");
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_9);
            System.out.println("9 key pressed");
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_4);
            System.out.println("4 key pressed");
            Thread.sleep(500);

            robot.keyPress(KeyEvent.VK_TAB);
            System.out.println("Tab key pressed");
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_TAB);
            System.out.println("Tab key pressed");
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_TAB);
            System.out.println("Tab key pressed");
            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_ENTER);
            System.out.println("Enter key pressed");
            Thread.sleep(1000);


        } catch (AWTException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        firefoxDriver.close();

    }

}
