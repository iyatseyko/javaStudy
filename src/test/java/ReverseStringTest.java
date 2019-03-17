import org.junit.Assert;
import org.junit.Test;

import static JavaMethods.StringReverse.stringReverse;

public class ReverseStringTest {

    @Test
    public void VerifyIsreverseStringMethodWorkCorrect () {
        String inputString = "123456789";

        Assert.assertEquals("Expected result is 987654321, but ectual result is " + stringReverse(inputString) + "!", "987654321", stringReverse(inputString) );
    }
}
