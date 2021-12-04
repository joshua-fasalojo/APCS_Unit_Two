import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // create print statements and get input for the x and y values.
        System.out.println("Enter the x cordinate: ");
        int x = input.nextInt();
        System.out.println("Enter the y cordinate: ");
        int y = input.nextInt();
        //Instantiate a Point object p. Hint: you will need the keyword "new"
        Point p = new Point();
        // create print statements and get input for the length and width
        System.out.println("Enter the length: ");
        int length = input.nextInt();
        System.out.println("Enter the width: ");
        int width = input.nextInt();
        //System.out.print(0,0);
        //Instantiate a Dimension object d.
        Dimension d = new Dimension();

        //Instantiate a Rectangle object r.
        Rectangle r = new Rectangle();


        // Print each object p, d, and r on a separate line.
        System.out.println(p);
        System.out.println(d);
        System.out.println(r);

        //System.out.println(d);
        //System.out.println(r);
    }
}