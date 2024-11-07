/**
 *  the Circle class models a circle with a radius and color
 */
public class Circle {

    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "red";

    private double radius;
    private String color;

    // Constructors (overloaded)
    /**
     * Constructs a Circle instance with default radius and color
    */

    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Circle[radius = " + radius + ", color = " + color + "]";
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2.0 * radius * Math.PI;
    }
}