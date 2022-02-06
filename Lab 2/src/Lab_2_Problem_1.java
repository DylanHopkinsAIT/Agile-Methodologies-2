import java.util.Scanner;

public class Lab_2_Problem_1 {

    public static void main(String[] args) {
        int Num1, Num2, Num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("This program calculates the product of three positive integers: ");

        //Take in three positive integers from user
        System.out.println("Please enter the first positive integer: ");
        Num1 = sc.nextInt();

        System.out.println("Please enter the second positive integer: ");
        Num2 = sc.nextInt();

        System.out.println("Please enter the final positive integer: ");
        Num3 = sc.nextInt();

        //Test if any integer is negative, and throw an error if integer is negative.
        if (Num1 < 0 || Num2 < 0 || Num3 < 0){
            System.out.println("Please try again, entering only positive integers.");
        }
        else{
            System.out.println("The product of the three positive integers is: ");
            System.out.println(Num1 * Num2 * Num3);
        }

    }
}
