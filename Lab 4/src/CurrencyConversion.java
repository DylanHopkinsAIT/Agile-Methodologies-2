public class CurrencyConversion {

    public double ConvertCurrency(double usdAmount, double conversionRate) {

        try {
            if (isPositive(usdAmount) && isWithinBounds(usdAmount) && isPositive(conversionRate)) {
                return usdAmount * conversionRate;
            } else {
                throw new IllegalArgumentException("Please only enter positive number values \n and dollar values between 100 and 100000...");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }

    }

    private boolean isPositive(double input) {
        boolean isPositive;

        isPositive = input >= 0;

        return isPositive;
    }

    private boolean isWithinBounds(double usdAmount) {
        boolean isWithinBounds;

        isWithinBounds = usdAmount > 100 && usdAmount < 100000;

        return isWithinBounds;
    }

}
