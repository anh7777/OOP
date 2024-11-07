package hus.java;

public interface Shape {
    double getPerimeter();
    double getArea();
    default int compareTo(Shape shape){
        if(getArea() > shape.getArea()) {
            return 1;
        }
        if(getArea() == shape.getArea()) {
            return 0;
        }
        return -1;
    }
    String printShape();
    String isShape();
}
