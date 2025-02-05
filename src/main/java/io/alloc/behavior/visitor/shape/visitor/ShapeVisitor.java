package io.alloc.behavior.visitor.shape.visitor;

import io.alloc.behavior.visitor.shape.element.Circle;
import io.alloc.behavior.visitor.shape.element.Pentagon;
import io.alloc.behavior.visitor.shape.element.Triangle;
import io.alloc.behavior.visitor.shape.element.Square;

public interface ShapeVisitor {

    void visitSquare(Square square);
    void visitCircle(Circle circle);
    void visitTriangle(Triangle triangle);
    void visitPentagon(Pentagon pentagon);
}
