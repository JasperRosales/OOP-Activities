import java.math.RoundingMode;  
import java.text.DecimalFormat;

import org.w3c.dom.css.Rect;  


class Square extends Rectangle{
    private Double Side;

    private static final DecimalFormat decfor = new DecimalFormat("0.00");  


    public Square(Double side, Double length, Double width, String color, Boolean filled){
        super(length, width, color, filled);
        this.Side = side;
    }

    public void setSide(Double side){
        this.Side = side;
    }

    public Double getSide(){
        return this.Side;
    }


    @Override
    public Double getArea() {
        // A = side ^ 2
        //Return 0 if not a square
        Double area = (this.getLength() == this.getWidth()) ? (this.Side * this.Side) :  0;
        return area;
    }

    @Override
    public Double getPerimeter() {
        // P = 4 * side based on google
        //Return 0 if not a square
        Double result = (this.getLength() == this.getWidth()) ? (4 * this.Side) :  0;
        // String err = (result == 0) ? "[ERROR] Both length and width should be equal" : ""; 
        return result;
    }

    @Override 
    public String toString(){
        return "Side: " + this.Side + " Length: " + this.getLength() + " Width: " + this.getWidth() + " Perimeter: " + decfor.format(getPerimeter()) + " Area: " + decfor.format(getArea()) + " Color: " + this.Color + " Filled: " + this.Filled; 
    }
}




