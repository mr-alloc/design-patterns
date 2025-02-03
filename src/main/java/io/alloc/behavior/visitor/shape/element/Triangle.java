package io.alloc.behavior.visitor.shape.element;

import io.alloc.behavior.visitor.shape.visitor.ShapeVisitor;

public class Triangle implements Shape {

    private final int base;
    private final int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitTriangle(this);
    }
}
