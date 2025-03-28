import java.util.Scanner;

/*
The two roots of a quadratic equation
ax**2 + bx + c = 0 can be obtained using the following formula:

r1 = (-b + Math.pow(Math.pow(b,2)-4*a*c,0.5)/2*a

r2 = (-b - Math.pow(Math.pow(b,2)-4*a*c,0.5)/2*a
b**2 - 4ac is called the discriminant of the quadratic equation.
If it is positive, the equation has two real roots. If it is zero, the equation has one root.
If it is negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots.”
Note you can use Math.pow(x, 0.5) to compute the square root of x.
 */
public class C3Q01 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminantOfTheEquation = (Math.pow(b,2)-4*a*c);
        double positiveFormulaOfTheRoots = (-b + Math.pow(discriminantOfTheEquation,0.5))/2*a;
        double negativeFormulaOfTheRoots = (-b - Math.pow(discriminantOfTheEquation,0.5))/2*a;
        if (discriminantOfTheEquation > 0){
            System.out.println("The roots of the equation are: "+ positiveFormulaOfTheRoots + " and " + negativeFormulaOfTheRoots);
        } else if (discriminantOfTheEquation == 0) {
            System.out.println("The unique root is " + positiveFormulaOfTheRoots);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
