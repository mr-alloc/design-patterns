package io.alloc.behavior.visitor.shape.element;

import io.alloc.behavior.visitor.shape.visitor.ShapeVisitor;

public class Square implements Shape {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitSquare(this);
    }
}
