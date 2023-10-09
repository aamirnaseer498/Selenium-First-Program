package WebDriver.BatchTesting;

import org.testng.annotations.Test;

public class PaymentTest {

    @Test
    public void paymentInRupees(){
        System.out.println("Paid in Rupees");
    }

    @Test
    public void paymentInDollars(){
        System.out.println("Paid in Dollars");
    }

}
