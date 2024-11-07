package oop.hus.exe1.exe15;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    public String toString() {
        return String.format("ResizableCircle[%s]", super.toString());
    }

    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
