/* Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
v²/2a
Write a program that prompts the user to enter v in meters/second (m/s) and
the acceleration a in meters/second squared (m/s2), then, displays the minimum
runway length. */

import java.util.Scanner;

public class C2Q12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
    
        double minimunRunwayLength = Math.pow(speed,2)/(2*acceleration);
        System.out.println("The minimum runway length for this airplane is: "+ (float) minimunRunwayLength);

    }
}
