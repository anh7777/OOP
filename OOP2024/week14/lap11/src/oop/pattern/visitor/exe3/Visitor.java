package oop.pattern.visitor.exe3;

interface Visitor {
    void visitDot(Dot d);
    void visitCircle(Circle c);
    void visitRectangle(Rectangle r);
    void visitCompoundGraphic(CompoundGraphic cs);
}