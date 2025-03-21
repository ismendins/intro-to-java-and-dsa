/* How cold is it outside? The temperature alone is
not enough to provide the answer. Other factors including wind speed, relative hu-
midity, and sunshine play important roles in determining coldness outside. In 2001,
the National Weather Service (NWS) implemented the new wind-chill temperature
to measure the coldness using temperature and wind speed. The formula is  

twc = 35.74 + 0.6215*ta - 35.75*v**0.16 + 0.4275*ta*v**0.16

where ta is the outside temperature measured in degrees Fahrenheit, v is the speed
measured in miles per hour, and twc is the wind-chill temperature. The formula cannot
be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F.*/

import java.util.Scanner;

public class C2Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double outsideTemperature = input.nextDouble();
        System.out.println("Enter the wind speed ( 7 = 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChill = 35.74 + 0.6215*outsideTemperature - 35.75*Math.pow(windSpeed, 0.16) + 0.4275*outsideTemperature*Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is: "+ (float) windChill);
    }
}
