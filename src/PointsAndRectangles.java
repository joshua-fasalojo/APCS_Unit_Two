import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        // create print statements and get input for the x and y values.
        int x = kb.nextInt();
        int y = kb.nextInt();
        //Instantiate a Point object p. Hint: you will need the keyword "new"
        Point p = new Point(x,y);

        // create print statements and get input for the length and width
        //System.out.print(0,0);
        //Instantiate a Dimension object d.
        Dimension d = new Dimension();
        //Instantiate a Rectangle object r.
        Rectangle r = new Rectangle();

        // Print each object p, d, and r on a separate line.
        System.out.println(p);
        //System.out.println(d);
        //System.out.println(r);
    }
}