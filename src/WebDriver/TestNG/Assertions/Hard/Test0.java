package WebDriver.TestNG.Assertions.Hard;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test0 {

    @Test
    void demoTest1(){
        Assert.assertTrue(true);
        Assert.assertEquals("welcome","welcome");
        Assert.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
    }

    @Test
    void demoTest2(){
        Assert.assertTrue(true);
        Assert.assertEquals("welcome","Welcome");
        Assert.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
    }

    @Test
    void demoTest3(){
        Assert.assertTrue(false);
        Assert.assertEquals("welcome","welcome");
        Assert.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
    }

    @Test
    void demoTest4(){
        Assert.assertFalse(false);
        Assert.assertEquals("welcome","welcome");
        Assert.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
    }

    @Test
    void demoTest5(){
        Assert.assertFalse(false);
        Assert.assertEquals("welcome","welcome");
        Assert.assertEquals("selenium","Selenium");
        System.out.println("Successfully Passed");
    }

    @Test
    void demoTest6(){
        Assert.assertFalse(true);
        Assert.assertEquals("welcome","welcome");
        Assert.assertEquals("selenium","selenium");
        System.out.println("Successfully Passed");
    }

}
