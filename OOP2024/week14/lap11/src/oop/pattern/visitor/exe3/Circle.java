package oop.pattern.visitor.exe3;

class Circle implements Shape {
    protected int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing Circle at (" + x + ", " + y + ") with radius " + radius);
    }

    public void accept(Visitor v) {
        v.visitCircle(this);
    }
}
