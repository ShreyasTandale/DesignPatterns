package com.algoexpert.io.designpatterns.creational.factory;

/*
In the Factory pattern, we dont expose the creation logic to the client and refer the created object using a standard interface.
The factory pattern is also known as Virtual constructor.
* */
public class FactoryMain {
    public static void main(String[] args) {
        ProfesssionFactory professsionFactory = new ProfesssionFactory();
        Profession profession = professsionFactory.getProfession("abc");
        profession.print();
    }
}
