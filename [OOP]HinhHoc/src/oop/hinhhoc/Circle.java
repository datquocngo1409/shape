package oop.hinhhoc;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
    radius=1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    }
    
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+radius+", which is a subclass of Shape"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
