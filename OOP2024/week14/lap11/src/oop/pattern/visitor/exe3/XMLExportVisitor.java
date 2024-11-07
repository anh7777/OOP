package oop.pattern.visitor.exe3;

class XMLExportVisitor implements Visitor {
    public void visitDot(Dot d) {
        System.out.println("<dot x='" + d.x + "' y='" + d.y + "'/>");
    }

    public void visitCircle(Circle c) {
        System.out.println("<circle x='" + c.x + "' y='" + c.y + "' radius='" + c.radius + "'/>");
    }

    public void visitRectangle(Rectangle r) {
        System.out.println("<rectangle x='" + r.x + "' y='" + r.y + "' width='" + r.width + "' height='" + r.height + "'/>");
    }

    public void visitCompoundGraphic(CompoundGraphic cs) {
        for (Shape s : cs.shapes) {
            s.accept(this);
        }
    }
}
