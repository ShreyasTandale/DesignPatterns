package com.algoexpert.io.designpatterns.behavioral.decorator_pattern;

public class ExtraCheeseTopping extends BasePizza {
    private BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza pizza) {
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
