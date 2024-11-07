package oop.pattern.visitor.exe2;

import java.util.ArrayList;
import java.util.List;

class Computer implements ComputerPart {
    private List<ComputerPart> parts;

    public Computer() {
        this.parts = new ArrayList<>();
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
    }
}