import java.math.RoundingMode;  
import java.text.DecimalFormat;

import org.w3c.dom.css.Rect;  

abstract class Shape{
    protected String Color;
    protected Boolean Filled;

    protected Shape(String color, Boolean filled){
        this.Color = color;
        this.Filled = filled;
    }

    public void setColor(String color){
        this.Color = color;
    }
    public void setFilled(Boolean fill){
        this.Filled = fill;
    }

    public String getColor() {
        return this.Color;
    } 

    public Boolean getFilled(){
        return this.Filled;
    }

    public Boolean isFilled(){
        return false;
    }

    public abstract Double getArea();
    public abstract Double getPerimeter();
    


    public String toString(){
        return "Color: " + this.Color + "Filled: " + this.Filled;
    }

}


