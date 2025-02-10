package io.alloc.structure.decorator.coffee.decorator;

import io.alloc.structure.decorator.coffee.component.Coffee;

public class WhippedCream extends io.alloc.structure.decorator.coffee.decorator.CoffeeDecorator {

    public WhippedCream(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 800;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 휘핑 크림";
    }
}
