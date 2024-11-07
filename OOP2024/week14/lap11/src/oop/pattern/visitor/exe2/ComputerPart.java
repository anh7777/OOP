package oop.pattern.visitor.exe2;

interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}