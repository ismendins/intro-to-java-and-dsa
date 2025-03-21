/*Write a program that
reads in investment amount, annual interest rate, and number of years and dis-
plays the future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.
 */

import java.util.Scanner;

public class C2Q21 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterest = input.nextDouble();
        System.out.println("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        double monthlyInterestRate = (annualInterest/1200);

        double futureInvestmentValue = investmentAmount*Math.pow((1+monthlyInterestRate),numberOfYears*12);
    System.out.println("Future value is: " + futureInvestmentValue);
    }

}
