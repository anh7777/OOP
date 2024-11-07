package oop.pattern.visitor.exe3;

import java.util.ArrayList;
import java.util.List;

class CompoundGraphic implements Shape {
    protected List<Shape> shapes;

    public CompoundGraphic() {
        shapes = new ArrayList<>();
    }

    public void add(Shape s) {
        shapes.add(s);
    }

    public void move(int x, int y) {
        for (Shape s : shapes) {
            s.move(x, y);
        }
    }

    public void draw() {
        for (Shape s : shapes) {
            s.draw();
        }
    }

    public void accept(Visitor v) {
        v.visitCompoundGraphic(this);
    }
}
