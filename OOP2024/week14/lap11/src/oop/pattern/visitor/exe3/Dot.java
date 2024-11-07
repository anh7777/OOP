package oop.pattern.visitor.exe3;

class Dot implements Shape {
    protected int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing Dot at (" + x + ", " + y + ")");
    }

    public void accept(Visitor v) {
        v.visitDot(this);
    }
}
