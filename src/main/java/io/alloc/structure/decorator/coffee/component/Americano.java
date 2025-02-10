package io.alloc.structure.decorator.coffee.component;

public class Americano implements Coffee {

    private final Espresso espresso;

    public Americano(Espresso espresso) {
        this.espresso = espresso;
    }

    @Override
    public double getCost() {
        return espresso.getCost() + 500;
    }

    @Override
    public String getDescription() {
        return "아메리카노";
    }
}
