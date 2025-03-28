/*
Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and dis-
play the future day of the week.
 */

import java.util.Scanner;

public class C3Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today’s day: ");
        int dayOfTheWeek = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int futureDayOfTheWeek = input.nextInt();
        switch (dayOfTheWeek){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wesnesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
