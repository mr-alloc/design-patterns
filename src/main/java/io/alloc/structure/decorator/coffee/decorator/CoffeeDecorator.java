package io.alloc.structure.decorator.coffee.decorator;

import io.alloc.structure.decorator.coffee.component.Coffee;

public class CoffeeDecorator implements Coffee {

    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return this.decoratedCoffee.getDescription();
    }
}
