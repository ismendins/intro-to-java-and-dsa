/* Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. */

import java.util.Scanner;

public class C2Q03 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a value for feet: ");
    double feet = input.nextDouble();

    // Converting to meters
    double meters = (feet*0.305);
    System.out.println(feet + " feet is " + meters + "meters.");
    }
}
