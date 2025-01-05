package com.algoexpert.io.designpatterns.creational.builder;

/*
* Builder pattern refers to approach that focuses on constructing a simple objects using step-by-step approach.
* Major roles in this design pattern:
* - Complex Object/ Final product - Example House. Which will be generated with builder design pattern.
* - Builder: Abstract class/interface that defines all the ways to create the product.
* - ConcreteBuilder: Multiple Builder Impls that will give different final objects which are complex to design.
* - Director: Controls complex object creation. 2 roles:
* 1) Gets the required builder
* 2) Gets you the complex object.
* */
public class BuilderMain {

    public static void main(String[] args) {
        Director director = new Director(new EarthquakeResistantBuilder());
        director.manageRequiredHomeConstruction();

        Home home = director.getComplexObjectOfHome();
        System.out.println("Home constructed = " + home);
        System.out.println("Home constructed = " + home.floors);
    }
}
