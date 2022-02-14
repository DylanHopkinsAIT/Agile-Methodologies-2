import junit.framework.TestCase;

public class CurrencyConversionTest extends TestCase {

    CurrencyConversion cc = new CurrencyConversion();

    //Test number: 1
    //Test objective: Reject negative inputs
    //Test input(s): usdAmount = -1000, conversionRate = -0.88"
    //Test expected output(s): -1.0
    public void testCurrencyConversion001() {
        assertEquals(-1.0, cc.ConvertCurrency(-10, 10));
    }

    //Test number: 2
    //Test objective: Verify correct conversion result
    //Test input(s): usdAmount = 67.80, conversionRate = 0.33
    //Test expected output(s): 23.37
    public void testCurrencyConversion002() {
        assertEquals(880.00, cc.ConvertCurrency(1000, 0.88), 0.1);
    }

    //Test number: 3
    //Test objective: Reject inputs outside of boundary limits
    //Test input(s): usdAmount = 100000 , conversionRate = 0.88
    //Test expected output(s):
    public void testCurrencyConversion003(){
        assertEquals(-1, cc.ConvertCurrency(100000,0.88),0.1);
    }

}