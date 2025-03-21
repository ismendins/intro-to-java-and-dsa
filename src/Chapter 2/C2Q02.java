/* Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * π
volume = area * length */

import java.util.Scanner;

public class C2Q02 {
    public static void main(String[] args) {
        // Reading the user input 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius  and length of the cylinder: ");
        float radius = input.nextFloat();
        float length = input.nextFloat();

        // Defining π with a four number precision as a constant
        final double pi = 3.14159;
 
        double area = radius * radius * pi;
        double volume = area * length;

        System.out.println("The area is: " + area);
        System.out.println("The volume is " + volume);
    }
}
