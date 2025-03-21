/* Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and display the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program.  */
import java.util.Scanner;

public class C2Q11 {
    public static void main(String[] args) {
        double birthRatePerSeconds = 7.0, deathRatePerSeconds = 13.0, immigrationPerSeconds = 45.0, currentPopulation = 312_032_486;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int yearChosen = input.nextInt();
        // Calculating how many seconds exist in a year
        double secondsInAYear = (((60 * 60)*24)*365);
    
        double birthsPerYear = secondsInAYear/birthRatePerSeconds;
        double deathsPerYear = secondsInAYear/deathRatePerSeconds;
        double immigrantsPerYear = secondsInAYear/immigrationPerSeconds;
    
        for(int i=1; i<=yearChosen; i++){
            currentPopulation = currentPopulation + birthsPerYear + immigrantsPerYear - deathsPerYear;
        }
        System.out.println("The population in " + yearChosen + " years is " + (int)currentPopulation);
    }
}