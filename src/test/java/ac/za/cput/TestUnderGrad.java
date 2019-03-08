package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class TestUnderGrad {

    @Test
    public void testObject()
    {
        loanInterest loanInt = new underGrad("Aderito", "Zacarias", 5000);

        double result = loanInt.interest();

        Assert.assertEquals(600, result, 1);

    }


}
