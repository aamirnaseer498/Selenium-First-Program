package WebDriver.TestNG.Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {

    @Test
    void loginByGoogle(){
        System.out.println("Login by Google");
        Assert.assertEquals("aamir","Aamir");
    }

    @Test
    void loginByFacebook(){
        System.out.println("Login by Facebook");
        Assert.assertEquals("Naseer","Naseer");
    }

}
