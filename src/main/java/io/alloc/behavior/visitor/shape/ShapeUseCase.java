package io.alloc.behavior.visitor.shape;

import io.alloc.behavior.visitor.shape.element.Circle;
import io.alloc.behavior.visitor.shape.element.Shape;
import io.alloc.behavior.visitor.shape.element.Square;
import io.alloc.behavior.visitor.shape.element.Triangle;
import io.alloc.behavior.visitor.shape.visitor.AreaCalculator;
import io.alloc.behavior.visitor.shape.visitor.SVGRenderer;

public class ShapeUseCase {

    public static void run() {
        Shape [] shapes = new Shape[] {
            new Circle(10),
            new Square(20),
            new Triangle(10, 20)
        };

        AreaCalculator areaCalculator = new AreaCalculator();
        SVGRenderer svgRenderer = new SVGRenderer();

        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
            shape.accept(svgRenderer);
        }

        System.out.println("totalArea = " + areaCalculator.getTotal());
        System.out.println("svg = " + svgRenderer.getSvg());
    }

}
