package io.alloc.behavior.visitor.shape.visitor;

import io.alloc.behavior.visitor.shape.element.Circle;
import io.alloc.behavior.visitor.shape.element.Pentagon;
import io.alloc.behavior.visitor.shape.element.Square;
import io.alloc.behavior.visitor.shape.element.Triangle;

public class SVGRenderer implements ShapeVisitor {
    private String svg = "";

    public String getSvg() {
        return svg;
    }

    @Override
    public void visitSquare(Square square) {
        this.svg += String.format("<rect width=\"%d\" height=\"%d\" />", square.getSide(), square.getSide());
    }

    @Override
    public void visitCircle(Circle circle) {
        this.svg += String.format("<circle r=\"%d\" />", circle.getRadius());
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        this.svg += String.format("<polygon points=\"0,0 %d,0 %d, %d\" />", triangle.getBase(), triangle.getBase() /2, triangle.getHeight());
    }

    @Override
    public void visitPentagon(Pentagon pentagon) {
        //다각형은 만들지 않는다.
    }
}
