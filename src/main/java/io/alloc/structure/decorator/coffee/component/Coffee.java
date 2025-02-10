package io.alloc.structure.decorator.coffee.component;

public interface Coffee {
    double getCost();
    String getDescription();

    default void print() {
        System.out.printf("주문: %s\n가격: %.2f원\n", getDescription(), getCost());
    }
}
