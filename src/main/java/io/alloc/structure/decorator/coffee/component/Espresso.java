package io.alloc.structure.decorator.coffee.component;

public class Espresso implements Coffee {

    @Override
    public double getCost() {
        return 1500;
    }

    @Override
    public String getDescription() {
        return "에스프레소";
    }
}
