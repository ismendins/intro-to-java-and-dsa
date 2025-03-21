/*Write a program that reads a Celsius degree in a
double value from the console, then converts it to Fahrenheit, and displays the
result. The formula for the conversion is as follows: 
fahrenheit = (9 / 5) * celsius + 32*/

import java.util.Scanner;

public class C2Q01 {
    public static void main(String[] args) {
        // Declaring the variable and receiving the temperature
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor em Celsius: ");
        double tempInCelsius = input.nextDouble();

        // Converting to F

        double tempInFahrenheit = (9.0 / 5) * tempInCelsius + 32;
        System.out.println(tempInCelsius + " Celsius is " + tempInFahrenheit + " Fahrenheit.");

    }
}
