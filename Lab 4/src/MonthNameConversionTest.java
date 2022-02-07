import junit.framework.TestCase;

public class MonthNameConversionTest extends TestCase {

    public class MonthNameConversionTest extends TestCase {

        // Test Number: 1
        // Test Objective: To test conversion of January to 1
        // Test input(s): monthName = "January"
        // Test expected output(s): 1

        public void testconvertMonthName001() {

            assertEquals(1, MonthNameConversion.convertMonthName("January"));
        }



        // Test Number: 13
        // Test Objective: To test conversion of Mike to returning -99
        // Test input(s): monthName = "Mike"
        // Test expected output(s): -99

        public void testconvertMonthName013() {

            assertEquals(-99, MonthNameConversion.convertMonthName("Mike"));
        }

    }