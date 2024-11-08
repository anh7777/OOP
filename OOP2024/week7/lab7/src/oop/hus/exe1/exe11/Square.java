package oop.hus.exe1.exe11;

public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }
    private void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}
