import junit.framework.TestCase;

public class CurrencyConversionTest extends TestCase {

    CurrencyConversion cc = new CurrencyConversion();

    //Test number: 1
    //Test objective: Reject invalid inputs
    //Test input(s): currencyAmount = -10, conversionRate = 10"
    //Test expected output(s): -1
    public void testCurrencyConversion001() {
        assertEquals(-1.0, cc.ConvertCurrency(-10, 10));
    }

    //Test number: 2
    //Test objective: Verify correct conversion result
    //Test input(s): currencyAmount = 67.80, conversionRate = 0.33
    //Test expected output(s): 23.37
    public void testCurrencyConversion002() {
        assertEquals(22.37, cc.ConvertCurrency(67.80, 0.33), 0.1);
    }
}