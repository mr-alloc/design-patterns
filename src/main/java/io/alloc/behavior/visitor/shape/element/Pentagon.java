package io.alloc.behavior.visitor.shape.element;

import io.alloc.behavior.visitor.shape.visitor.SVGRenderer;
import io.alloc.behavior.visitor.shape.visitor.ShapeVisitor;

public class Pentagon implements Shape {

    private final int side;

    public Pentagon(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        if (! (visitor instanceof SVGRenderer)) {
            visitor.visitPentagon(this);
        }
    }
}
