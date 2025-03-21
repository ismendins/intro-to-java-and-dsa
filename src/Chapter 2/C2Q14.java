/* Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and divid-
ing, by the square of your height in meters. Write a program that prompts the user to
enter a weight in pounds and height in inches and displays the BMI. Note one pound
is 0.45359237 kilograms and one inch is 0.0254 meters. */

import java.util.Scanner;

public class C2Q14 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter weight in pounds: ");
    double weightinPounds = input.nextDouble();
    System.out.println("Enter height in inches: ");
    double heightInInches = input.nextDouble();

    final double KILOGRAMS_CONVERSION = 0.45359237;
    final double METERS_CONVERSION = 0.0254;

    double weightInKilograms = weightinPounds*KILOGRAMS_CONVERSION;
    double heightInMeters = (heightInInches*METERS_CONVERSION);
    
    double bmi = weightInKilograms/(heightInMeters*heightInMeters);
    System.out.println("BMI is " + bmi);
    }
}
