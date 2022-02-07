import java.util.Scanner;

public class Lab_3_Problem_1 {
    public static void main(String[] args) {
        double fuelEfficiency;
        double fuelPrice;
        double tankCapacity;
        double costPer100KM;
        double tankRange;

        Scanner sc = new Scanner(System.in);

            try{
                //Initialise inputs
                System.out.println("Please enter fuel efficiency in Kilometers per Litre: ");
                fuelEfficiency = sc.nextDouble();

                System.out.println("Please enter fuel price in euros: ");
                fuelPrice = sc.nextDouble();

                System.out.println("Please enter fuel tank capacity in Litres: ");
                tankCapacity = sc.nextDouble();

                if(isPositive(fuelEfficiency) && isPositive(fuelPrice) && isPositive(tankCapacity)){

                    //Gather Results
                    costPer100KM = costPer100KM(fuelEfficiency, fuelPrice);
                    tankRange = tankRange(tankCapacity, fuelEfficiency);

                    //Output results
                    System.out.println();
                    System.out.println("---------------------------------------------------");
                    System.out.println();
                    System.out.println("Cost to drive vehicle per 100km: " +costPer100KM +"euro per 100 KM");
                    System.out.println("Range of vehicle in kilometres based on tank capacity: " + tankRange + "KM");
                }else {
                    throw new IllegalArgumentException("Please enter positive numbers only. ");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

    }

    private static Double costPer100KM(double fuelEfficiency, double fuelPrice){
        double fuelCost;

        fuelCost = fuelEfficiency * fuelPrice;

        return fuelCost;
    }

    private static Double tankRange(double tankCapacity, double fuelEfficiency){
        double tankRange;

        tankRange = tankCapacity * fuelEfficiency;

        return tankRange;
    }

    private static boolean isPositive(double input){
        boolean isPositive;

        isPositive = input >= 0;

        return  isPositive;
    }
}
