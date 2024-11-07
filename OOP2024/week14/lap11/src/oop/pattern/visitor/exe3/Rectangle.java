package oop.pattern.visitor.exe3;

class Rectangle implements Shape {
    protected int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing Rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }

    public void accept(Visitor v) {
        v.visitRectangle(this);
    }
}
