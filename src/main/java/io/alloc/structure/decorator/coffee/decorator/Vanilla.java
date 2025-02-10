package io.alloc.structure.decorator.coffee.decorator;

import io.alloc.structure.decorator.coffee.component.Coffee;

public class Vanilla extends io.alloc.structure.decorator.coffee.decorator.CoffeeDecorator {

    public Vanilla(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 바닐라 시럽";
    }
}
