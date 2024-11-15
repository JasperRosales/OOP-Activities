import java.math.RoundingMode;  
import java.text.DecimalFormat;

import org.w3c.dom.css.Rect;  

class Rectangle extends Shape{
    private Double Length;
    private Double Width;

    private static final DecimalFormat decfor = new DecimalFormat("0.00");  


    public Rectangle(Double length, Double width, String color, Boolean filled){
        super(color, filled);
        this.Length = length;
        this.Width = width;

        
    }

    public void setLength(Double length){
        this.Length = length;
    }
    public void setWidth(Double width){
        this.Width = width;
    }

    public Double getLength() {
        return this.Length;
    } 

    public Double getWidth() {
        return this.Width;
    }
    
    @Override
    public Double getArea() {
        //Formula A = L * W based on google
        return this.Length * this.Width;
    }

    @Override
    public Double getPerimeter() {
    // Formula P = 2 (L+W) based on google
        return 2 * (this.Length + this.Width);
    }

    @Override
    public String toString(){
        return "Length: " + this.Length + " Width: " + this.Width + " Perimeter: " + decfor.format(getPerimeter()) + " Area: " + getArea() + " Color: " + this.Color + " Filled: " + this.Filled;
    }
}
