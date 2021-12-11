import java.util.Scanner;

public class TemperatureDifference {



    /**
     * This method will calculate the difference in two temperatures, regardless of which one is larger.
     * @param temp1 - an int temperature value
     * @param temp2 - an int temperature value
     * @return the absolute value of the difference between the two temps. Make sure to change the 0
     */
    public static int calculateDifference(int temp1, int temp2) {
       int finalTemperature = (int) (Math.absExact((0)));

        return 0;
    }

    public static void main(String[] args) {
        // Scanner object to get input
        Scanner input = new Scanner(System.in);

        // Get the two temperatures from the user as input
        System.out.print("Enter the first temperature: ");
        int temp1 = input.nextInt();
        System.out.print("Enter the second temperature: ");
        int temp2 = input.nextInt();
        System.out.println( (int) Math.absExact(temp1));
        // Call the calculateDifference method and save the result in a variable.
        int finalTemperature = (int) (Math.absExact(input.nextInt()));
        // Print out the information to the user
        System.out.println("The temperature changed " + finalTemperature + " degrees" );
    }
}
