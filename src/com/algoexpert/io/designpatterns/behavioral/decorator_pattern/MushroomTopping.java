package com.algoexpert.io.designpatterns.behavioral.decorator_pattern;

public class MushroomTopping extends ToppingDecorator {
    private BasePizza basePizza;

    public MushroomTopping(BasePizza pizza) {
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
