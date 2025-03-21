/*Assume that a runner runs 24 miles in 1 hour, 40
minutes, and 35 seconds. Write a program that displays the average speed in
kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.) */

public class C1Q12{
    public static void main(String[] args){
        double hours = 1, minutes = 40, seconds = 35, miles = 24;
        
        //Converting the minutes and seconds to hours
        double time = hours + minutes/60 + seconds/3600;

        //Converting miles to kms
        double kms = (miles*1.6);
        

        double kmPerHour = kms/time;
        System.out.println("The runner had an average of "+ kmPerHour + " km/h");
    }
}