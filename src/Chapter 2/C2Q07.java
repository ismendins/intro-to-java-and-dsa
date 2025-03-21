/* Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the maximum number of years and remain-
ing days for the minutes. For simplicity, assume that a year has 365 days. */

import java.util.Scanner;

public class C2Q07 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of minutes: ");
    long minutosTotais = input.nextLong();

    //First the years will be obtained        
    long anosTotais = minutosTotais/525600;
    // Now the remaining minutos will be obtained
    long minutosRestantes = minutosTotais%525600;
    //And will be divided by the number of minutes in a day to convert to days
    long diasTotais = minutosRestantes/1440;

    System.out.println(minutosTotais + " minutes is approximately " + anosTotais + " years and " + 
    diasTotais + " days");
}
}
