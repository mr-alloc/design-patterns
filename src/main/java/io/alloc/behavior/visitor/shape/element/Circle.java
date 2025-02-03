package io.alloc.behavior.visitor.shape.element;

import io.alloc.behavior.visitor.shape.visitor.ShapeVisitor;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitCircle(this);
    }
}
