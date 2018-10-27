package oop.hinhhoc;

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle() {
        width=length=1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }
    
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+width+" and length="+length+", which is a subclass of Shape"; //To change body of generated methods, choose Tools | Templates.
    }
 
}
