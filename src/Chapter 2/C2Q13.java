/* Suppose you save $100 each month into a savings account with an annual interest rate of 5%. 
Thus, the monthly interest rate is 0.05/12 = 0.00417. 
After the first month, the value in the account becomes 100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and dis-
plays the account value after the sixth month. */

import java.util.Scanner;

public class C2Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        final int monthlyAdd = input.nextInt();
        double value = 0;

        for(int i = 1; i <= 6; i++){
        value = (monthlyAdd + value)*(1+0.00417);
        }
        System.out.println("After the 6th month, the account value is $" + (float)value);
    }
}
