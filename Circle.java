import java.math.RoundingMode;  
import java.text.DecimalFormat;

import org.w3c.dom.css.Rect;


class Circle extends Shape{
    private Double Radius;
    private static final DecimalFormat decfor = new DecimalFormat("0.00");  

    public Circle(Double radius, String color, Boolean filled) {
        super(color,filled);
        this.Radius = radius;
    }

    public void setRadius(Double radius){
        this.Radius = radius;
    }

    public Double getRadius(){
        return this.Radius;
    }

    @Override
    public Double getPerimeter() {
        //Based on Google the Formula is 2(Pi)(r) circum == perimeter
        return 2 * (3.14 * this.Radius);

    }

    @Override
    public Double getArea() {
        // Formula A = Pi*(r)^2
        return 3.14 * (this.Radius * this.Radius);
    }

    @Override
    public String toString(){
        return "Radius: " + this.Radius + " Perimeter: " + decfor.format(getPerimeter())
         + " Area: " + getArea();
    }
}
