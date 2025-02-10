package io.alloc.structure.decorator.coffee.decorator;

import io.alloc.structure.decorator.coffee.component.Coffee;

public class ExtraShot extends io.alloc.structure.decorator.coffee.decorator.CoffeeDecorator {

    public ExtraShot(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1500;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 샷 추가";
    }
}
