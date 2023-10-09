package WebDriver.TestNG.Assertions.Soft;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test0 {

    SoftAssert softAssert1= new SoftAssert();
    SoftAssert softAssert2= new SoftAssert();
    SoftAssert softAssert3= new SoftAssert();
    SoftAssert softAssert4= new SoftAssert();
    SoftAssert softAssert5= new SoftAssert();
    SoftAssert softAssert6= new SoftAssert();

    @Test
    void demoTest1(){
        softAssert1.assertTrue(true);
        softAssert1.assertEquals("welcome","welcome");
        softAssert1.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
        softAssert1.assertAll();
    }

    @Test
    void demoTest2(){
        softAssert2.assertTrue(true);
        softAssert2.assertEquals("welcome","Welcome");
        softAssert2.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
        softAssert2.assertAll();
    }

    @Test
    void demoTest3(){
        softAssert3.assertTrue(false);
        softAssert3.assertEquals("welcome","welcome");
        softAssert3.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
        softAssert3.assertAll();
    }

    @Test
    void demoTest4(){
        softAssert4.assertFalse(false);
        softAssert4.assertEquals("welcome","welcome");
        softAssert4.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
        softAssert4.assertAll();
    }

    @Test
    void demoTest5(){
        softAssert5.assertFalse(false);
        softAssert5.assertEquals("welcome","welcome");
        softAssert5.assertEquals("selenium","Selenium");
        System.out.println("Successfully Passed");
        softAssert5.assertAll();
    }

    @Test
    void demoTest6(){
        softAssert6.assertFalse(true);
        softAssert6.assertEquals("welcome","welcome");
        softAssert6.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
        softAssert6.assertAll();
    }

}
