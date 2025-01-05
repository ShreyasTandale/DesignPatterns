package com.algoexpert.io.designpatterns.creational.absfactory;

/*
* This pattern is called Factory of factories.
* AbstractFactory lets a class return a factory of classes.
*
* */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Profession profession = abstractFactory.getProfession("Engineer");
        profession.print();

    }
}
