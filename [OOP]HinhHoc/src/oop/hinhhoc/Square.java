package oop.hinhhoc;

public class Square extends Rectangle{
    private double side;

    public Square() {
        side=1;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled=filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side= "+side+", which is a subclass of Rectangle"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getArea() {
        super.setLength(side);
        super.setWidth(side);
        return super.getArea(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        super.setLength(side);
        super.setWidth(side);
        return super.getPerimeter(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
