/*(Population projection) The U.S. Census Bureau projects population based on
the following assumptions:
- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds 

Write a program to display the population for each of the next five years. Assume
that the current population is 312,032,486, and one year has 365 days. Hint: In Java,
if two integers perform division, the result is an integer. The fractional part is trun-
cated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accu-
rate result with the fractional part, one of the values involved in the division must be
a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

*/
public class C1Q11 {
    public static void main(String[] args) {
    double birthRatePerSeconds = 7.0, deathRatePerSeconds = 13.0, immigrationPerSeconds = 45.0, currentPopulation = 312_032_486;

    // Calculating how many seconds exist in a year
    double secondsInAYear = (((60 * 60)*24)*365);

    double birthsPerYear = secondsInAYear/birthRatePerSeconds;
    double deathsPerYear = secondsInAYear/deathRatePerSeconds;
    double immigrantsPerYear = secondsInAYear/immigrationPerSeconds;

    for(int i=1; i<=5; i++){
        currentPopulation = currentPopulation + birthsPerYear + immigrantsPerYear - deathsPerYear;
        System.out.println("The population estimation for year " + i + " is " + (int)currentPopulation);
    }
}
}