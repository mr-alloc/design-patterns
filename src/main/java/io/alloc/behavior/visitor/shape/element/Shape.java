package io.alloc.behavior.visitor.shape.element;

import io.alloc.behavior.visitor.shape.visitor.ShapeVisitor;

public interface Shape {

    void accept(ShapeVisitor visitor);

}
