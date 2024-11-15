import java.io.IOException;
import java.math.RoundingMode;  
import java.text.DecimalFormat;

import org.w3c.dom.css.Rect;  


public class Polymorphism {
    public static void main(String[] args){
        Circle circle = new Circle(5.0, "blue", true);
        System.out.println("Circle= " + circle.toString());

        Rectangle rectangle = new Rectangle(5.0, 10.0, "red", false);
        System.out.println("Rectangle= " + rectangle.toString());

        //You can change it to other number of length or width to check if it is a square or not
        //if the area and perimeter are 0, then it is not a square.
        Square square = new Square(15.0, 15.0, 15.0, "white", true);

        System.out.println("Square= " + square.toString());
    } 

}
