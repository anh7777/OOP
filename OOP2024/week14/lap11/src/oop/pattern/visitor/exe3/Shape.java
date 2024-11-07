package oop.pattern.visitor.exe3;

public interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Visitor v);
}
