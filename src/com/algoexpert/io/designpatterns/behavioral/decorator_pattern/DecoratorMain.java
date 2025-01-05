package com.algoexpert.io.designpatterns.behavioral.decorator_pattern;

/*
* When is Decorator Pattern used?
* Example:
* 1) Prevents class explosion
* 2) Pizza making (Base + various toppings). Calculate cost after adding all toppings.
* 3) Coffee machine
* */
public class DecoratorMain {
    public static void main(String[] args) {
        BasePizza basePizza = new Magharitta();
        // add toppings

        MushroomTopping mushroomTopping = new MushroomTopping(basePizza);
        ExtraCheeseTopping extraCheeseTopping = new ExtraCheeseTopping(mushroomTopping);
        System.out.println(extraCheeseTopping.cost());

    }
}
