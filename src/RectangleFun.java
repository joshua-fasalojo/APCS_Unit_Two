import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner input = new Scanner(System.in);

        // Get input for x, y, width, and height. Create four separate variables for these.
        System.out.println("Enter a x value");
        int x = input.nextInt();
        System.out.println("Enter a y value");
        int y = input.nextInt();
        System.out.println("Enter the width");
        int width = input.nextInt();
        System.out.println("Enter the height");
        int height = input.nextInt();


        // Create a Rectangle object using the four pieces of user input.

        Rectangle r = new Rectangle(x, y, width, height);


        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it
        double perimeter = 2*(r.getHeight()) + 2*(r.getWidth());
        System.out.println("The perimeter is " + perimeter);
        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.
        r.getX();
        r.getY();
        r.setLocation(x,y);
        System.out.println(r);

    }




}
