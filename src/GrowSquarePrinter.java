import java.awt.*;

public class GrowSquarePrinter {

    public static void main(String[] args) {

        // Create a Rectangle object with a starting x, y of (100, 100) and a width and height of 50.
            Rectangle square = new Rectangle (100, 100,50,50);
        // print the rectangle object.
        System.out.println(square);
        // Use the translate and grow methods as described in the instructions
        square.translate(25,25);

        // print the rectangle object.
        square.grow( 25 ,25);
        System.out.println(square);

    }
}
//The new Rectangle has (x - h, y - v) as its upper-left corner, width of (width + 2h), and a height of (height + 2v).
//Translates this Rectangle the indicated distance, to the right along the X coordinate axis, and downward along the Y coordinate axis.
//The calls to translate and grow should modify the square so that it has twice the size and the same top-left corner as the original. I