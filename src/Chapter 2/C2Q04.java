/* Write a program that converts pounds into kilograms. The program prompts the user to enter a number
in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilogram. */

import java.util.Scanner;

public class C2Q04 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number in pounds: ");
    double pounds = input.nextDouble();

    // Converting from pounds to kg

    double kilograms = (pounds*0.454);
    System.out.println(pounds + " pounds is " + kilograms + " kilograms");        
    }
}
