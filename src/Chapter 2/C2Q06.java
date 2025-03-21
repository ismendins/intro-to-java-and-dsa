/* Write a program that reads an integer between 0
and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93. */

import java.util.Scanner;

public class C2Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        
        if (1 <= number && number <= 9){
            System.out.println("The sum of the digits is " + number);
        }
        else {
            // Creating loop that will verify the number, add its last digit to the sum and do a division by 10
            byte sum = 0;
            while (0 < number){
                int n = number%10;
                sum += n;
                number /= 10;
            }
            System.out.println("The sum of the digits is: " + sum);
        }
    }
}
