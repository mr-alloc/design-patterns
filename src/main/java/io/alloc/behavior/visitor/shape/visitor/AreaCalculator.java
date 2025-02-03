package io.alloc.behavior.visitor.shape.visitor;

import io.alloc.behavior.visitor.shape.element.Circle;
import io.alloc.behavior.visitor.shape.element.Pentagon;
import io.alloc.behavior.visitor.shape.element.Triangle;
import io.alloc.behavior.visitor.shape.element.Square;

public class AreaCalculator implements ShapeVisitor {

    private double total = 0.0;

    public double getTotal() {
        return total;
    }

    @Override
    public void visitSquare(Square square) {
        total += square.getSide() * square.getSide();
    }

    @Override
    public void visitCircle(Circle circle) {
        total += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        total += 0.5 * triangle.getBase() * triangle.getHeight();
    }

    @Override
    public void visitPentagon(Pentagon pentagon) {
        double halfCenterAngle = Math.PI / 5;
        double baseFactor = 5 * Math.pow(pentagon.getSide(), 2);
        double cosHalfAngle = Math.cos(halfCenterAngle);
        double tanHalfAngle = Math.tan(halfCenterAngle);

        total += (baseFactor * cosHalfAngle / tanHalfAngle) / 4;
    }
}
