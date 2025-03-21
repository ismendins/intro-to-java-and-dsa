/* Assume that a runner runs 14 kilometers in 45 minutes
and 30 seconds. Write a program that displays the average speed in miles per
hour. (Note 1 mile is equal to 1.6 kilometers.) */

public class C1Q10 {
    public static void main(String[] args) {

        double minutes = 45, seconds = 30, kilometers = 14;
        //converting from minutes and seconds to hours
        double time = minutes/60+seconds/3600;

        
        //convertendo from kilometers to miles
        double miles = (kilometers*1.6);

        double milesPerHour = miles/time;
        System.out.println("The runner had an average of "+ milesPerHour + " mp/h");
        
    }
}
