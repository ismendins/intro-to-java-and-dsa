/* Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is */

import java.util.Scanner;

public class C2Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        double lengthOfASide = input.nextDouble();
        
        double area = (3*Math.pow(3,0.5)/2)* Math.pow(lengthOfASide,2);
        System.out.println("The area of the hexagon is " + area);
    }
}

