/* Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as given by the following formula:

a = (v1 - v0)/t

Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
then displays the average acceleration. */

import java.util.Scanner;

public class C2Q09 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter v0, v1, and t: ");
    float v0 = input.nextFloat();
    float v1 = input.nextFloat();
    float t = input.nextFloat();

    float acceleration = (v1 - v0)/t;
    System.out.println("The average acceleration is "+ acceleration);
}
}
