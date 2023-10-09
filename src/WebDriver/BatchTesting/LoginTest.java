package WebDriver.BatchTesting;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginByEmail(){
        System.out.println("Login with Email");
    }

    @Test
    public void loginByFacebook(){
        System.out.println("Login with Facebook");
    }

    @Test
    public void loginByGoogle(){
        System.out.println("Login with Google");
    }

}
