/* Write a program that prompts the user to
enter two points (x1, y1) and (x2, y2) and displays their distance. The for-
mula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2 */

import java.util.Scanner;

public class C2Q15 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter x1 and y1: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    System.out.println("Enter x2 and y2: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double distance = Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 0.5);
    System.out.println("The distance between the two points is " + distance);
    }
}
