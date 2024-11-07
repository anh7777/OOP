package hus.java;

public class Square implements Shape{
    private double length; // field
    public Square(){}
    public Square(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    // Implements methods of Shape interface
    public double getPerimeter(){
        return 4*length;
    }
    public double getArea(){
        return length*length;
    }

    @Override
    public int compareTo(Shape shape) {
        return Shape.super.compareTo(shape);
    }
    public String printShape() {
        return String.format("Square[length=%f, are=%s]", length,  getArea());
    }

    @Override
    public String isShape() {
        return "Square";
    }
}
