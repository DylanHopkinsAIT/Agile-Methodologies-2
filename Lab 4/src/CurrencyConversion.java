public class CurrencyConversion {

    public double ConvertCurrency(double usdAmount, double conversionRate){

        try{
            if (isPositive(usdAmount) && isPositive(conversionRate)){
                return usdAmount * conversionRate;
            }
            else{
                throw new IllegalArgumentException("Please only enter positive number values...");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }

    }

    private boolean isPositive(double input){
        boolean isPositive;

        isPositive = input >= 0;

        return  isPositive;
    }

}
