package oop.hinhhoc;

public class OOPHinhHoc {

    public static void main(String[] args) {
        Shape shape = new Shape("red", true);
        System.out.println(shape.toString());
        
        Circle circle = new Circle(5, "yellow", true);
        System.out.println(circle.toString());
        
        Rectangle rec = new Rectangle(2, 5, "red", true);
        System.out.println(rec.toString());
        
        Square square = new Square(5, "blue", true);
        System.out.println(square.toString());
    }
    
}
